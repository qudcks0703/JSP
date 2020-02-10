package jsp0210.mvc;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study.0210")
public class Jstl1 extends HttpServlet {
 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Date day=new Date();
		
		req.setAttribute("day", day);
		
		RequestDispatcher rd=req.getRequestDispatcher("jsp0210/Jstl_study.jsp");
		rd.forward(req, resp);
	}
}
