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
		//path 안엔 주소만 적혀잇음
		Properties pp=null;
		InputStream is=null;
		try {
			is=new FileInputStream(path);
			pp=new Properties();
			pp.load(is);
			//System.out.println(pp); properties안에 있는 값들 출력됨
			Iterator it=pp.keySet().iterator();
			while(it.hasNext()) {
				String key=(String)it.next();
				String value=(String)pp.getProperty(key);
				Class c =Class.forName(value);
				Object obj=c.newInstance();
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
		
		//System.out.println(realpath);
		Bean bean=(Bean)beanMap.get(uri);
		String view=bean.actionBean(req, resp);
		RequestDispatcher rd=req.getRequestDispatcher(view);
		rd.forward(req, resp);
	}
	
}
