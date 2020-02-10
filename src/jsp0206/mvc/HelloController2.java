package jsp0206.mvc;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController2 extends HttpServlet{
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init!!!");
		
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("service!!!");
		
	}
} 