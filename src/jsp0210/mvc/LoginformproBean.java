package jsp0210.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginformproBean implements Bean{

	public String actionBean(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{

		req.setCharacterEncoding("utf-8");
			
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");
		
		M_DAO mdao=M_DAO.getInstance();
		int result=mdao.Login(id, pw);
		req.setAttribute("result", result);
		if(result==1) {
			HttpSession session=req.getSession();
			session.setAttribute("id", id);
			return "jsp0210/index.jsp";
		}else {
			return "loginform.0210"; 
		}
	}
}
