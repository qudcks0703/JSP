package jsp0211.mvc.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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

import org.apache.tomcat.jni.Mmap;

import jsp0211.mvc.model.Bean;

@WebServlet(urlPatterns ="*.0211",initParams =
@WebInitParam(name = "cf",value = "D:\\Byoungchan\\git\\JSP\\WebContent\\WEB-INF\\properties\\jsp0211.properties"))
public class M_controller extends HttpServlet {

	Map map=new HashMap();
	@Override
	public void init(ServletConfig config) throws ServletException {
		String path=config.getInitParameter("cf");
		Properties p=null;
		InputStream is=null;
		
		try {
			is=new FileInputStream(path);
			p=new Properties();
			p.load(is);
			
			Iterator it=p.keySet().iterator();
			while(it.hasNext()) {
				String key=(String)it.next();
				String value=p.getProperty(key);
				
				Class c=Class.forName(value);
				Object obj=c.newInstance();
				map.put(key, obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri=req.getRequestURI();
		Object obj=map.get(uri);
		Bean bean=null;
		String view="/WEB-INF/jsp0211/main.jsp";
		if(obj instanceof Bean) {
			bean=(Bean)obj;
			view=bean.action(req, resp);
		}
		req.getRequestDispatcher(view).forward(req, resp);
	}
}
