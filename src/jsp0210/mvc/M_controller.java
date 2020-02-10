package jsp0210.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.security.provider.certpath.ResponderId;

@WebServlet("*.0210")
public class M_controller extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("get!");
//		PrintWriter out=resp.getWriter();
//		out.print("<html>");
//		out.print("<head>");
//		out.print("</head>");
//		out.print("<h2>hello</h2>");
//		out.print("<h2>반갑다</h2>");
//		out.print("<body>");
//		out.print("</body>");
//		out.print("</html>");
//		resp.setContentType("utf-8");
//		req.setCharacterEncoding("utf-8");
		String uri=req.getRequestURI();
		String ctp=req.getContextPath();
		String realpath=uri.substring(ctp.length());
		
		//System.out.println(realpath);
		
		String view="";
		if(realpath.equals("/main.0210")) {
			view="jsp0210/main.jsp";
		}
		else if(realpath.equals("/index.0210")) {
			view="/jsp0210/index.jsp";
			//앞에 슬러쉬는 아무거나 해두된다.
		}
		else if(realpath.equals("/loginform.0210")) {
			view="/jsp0210/loginform.jsp";
			//앞에 슬러쉬는 아무거나 해두된다.
		}
		else if(realpath.equals("/loginformpro.0210")) {
			view="/jsp0210/loginformpro.jsp";
			//앞에 슬러쉬는 아무거나 해두된다.
		}
		
		RequestDispatcher rd=req.getRequestDispatcher(view);
		rd.forward(req, resp);
	}
	
}
