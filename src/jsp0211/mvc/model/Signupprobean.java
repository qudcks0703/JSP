package jsp0211.mvc.model;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp0211.mvc.dto.M_DAO;
import jsp0211.mvc.dto.M_DTO;

public class Signupprobean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		
		request.setCharacterEncoding("utf-8");
		String view="/WEB-INF/jsp0211/signuppro.jsp";
		M_DAO mdao=M_DAO.getInstance();
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		int result=-1;
		M_DTO mdto=new M_DTO();
		mdto.setId(id);
		mdto.setPw(pw);
		if(name ==null) {
			mdto.setName("없음");
		}else {
			mdto.setName(name);
		}
		if(id != null && pw != null) {
			result=mdao.signup(mdto);
		}
		request.setAttribute("result", result);
		return view;		
	}

}
