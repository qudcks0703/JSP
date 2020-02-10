package jsp0210.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class mainBean implements Bean{

	public String actionBean(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		return "jsp0210/loginform.jsp";
	}
}
