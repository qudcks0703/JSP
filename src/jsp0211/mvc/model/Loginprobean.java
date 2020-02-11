package jsp0211.mvc.model;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp0211.mvc.dto.M_DAO;

public class Loginprobean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		
		request.setCharacterEncoding("utf-8");
		String view="/WEB-INF/jsp0211/loginpro.jsp";
		M_DAO mdao=M_DAO.getInstance();
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		int result=mdao.Login(id, pw);
		request.setAttribute("result", result);
		if(result==1) {
			HttpSession session=request.getSession();
			session.setAttribute("sid", id);
		}
		return view;
	}

}
