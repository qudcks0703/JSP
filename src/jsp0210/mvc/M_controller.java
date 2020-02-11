package jsp0210.mvc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "*.0210",initParams = 
@WebInitParam(name = "propertiesPath",value ="D:\\Byoungchan\\git\\JSP\\WebContent\\WEB-INF\\properties\\test.properties") )
public class M_controller extends HttpServlet {

	private Map beanMap=new HashMap();
	@Override
	public void init(ServletConfig config) throws ServletException {
		String path=config.getInitParameter("propertiesPath");
		//path="D:\\Byoungchan\\git\\JSP\\WebContent\\WEB-INF\\properties\\test.properties";
		Properties pp=null;
		InputStream is=null;
		try {
			is=new FileInputStream(path);
			pp=new Properties();
			pp.load(is);
			//pp={/web/loginform.0210=jsp0210.mvc.LoginformBean,/web/loginpro.0210=jsp0210.mvc.LoginformproBean,/web/main.0210=jsp0210.mvc.mainBean}
			
			Iterator it=pp.keySet().iterator();
			//pp.keyset() ={/web/loginform.0210,/web/loginpro.0210,/web/main.0210}
			//it= iterator의 주소값
			while(it.hasNext()) {//안에 값이 있냐
				String key=(String)it.next();///web/loginform.0210
				String value=(String)pp.getProperty(key);//jsp0210.mvc.LoginformBean
				
				Class c =Class.forName(value);
				Object obj=c.newInstance();
				//LoginformBean lfb=new LoginformBean();
				//LoginformBean lfb=new jsp0210.mvc.LoginformBean();
				//Object lfb=new LoginformBean();
				//Object lfb=new jsp0210.mvc.LoginformBean();
				beanMap.put(key, obj);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(beanMap);
		String uri=req.getRequestURI();
		//uri=/web/loginform.0210
		//System.out.println(realpath);
		Object obj=beanMap.get(uri);
		Bean bean=null;
		String view=null;
		if(obj instanceof Bean) {
			bean=(Bean)obj;
			view=bean.actionBean(req, resp);
		}
		//Bean bean=(Bean)beanMap.get(uri);
		//String view=bean.actionBean(req, resp);
		RequestDispatcher rd=req.getRequestDispatcher(view);
		rd.forward(req, resp);
	}
	
}
