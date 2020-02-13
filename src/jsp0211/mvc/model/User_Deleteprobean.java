package jsp0211.mvc.model;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp0211.mvc.dto.M_DAO;
import jsp0211.mvc.dto.M_DTO;

public class User_Deleteprobean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		
		request.setCharacterEncoding("utf-8");
		String view="/WEB-INF/jsp0211/deletepro.jsp";
		M_DAO mdao=M_DAO.getInstance();
		String pw=request.getParameter("pw");
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("sid");
		int result=-1;
		M_DTO mdto=new M_DTO();
		if(pw !=null && id != null) {
			result=mdao.Login(id, pw);
			if(result==1) {
				result=mdao.delete(id);
				session.invalidate();
			}
		}
		request.setAttribute("result", result);
		
		return view;		
	}

}
