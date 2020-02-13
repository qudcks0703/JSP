package jsp0211.mvc.model;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp0211.mvc.dto.B_DAO;
import jsp0211.mvc.dto.B_DTO;
import jsp0211.mvc.dto.M_DAO;
import jsp0211.mvc.dto.M_DTO;

public class Writeprobean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		
		request.setCharacterEncoding("utf-8");
		String view="/WEB-INF/jsp0211/writepro.jsp";
		HttpSession session= request.getSession();
		B_DAO bdao=B_DAO.getInstance();
		String id=(String)session.getAttribute("sid");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		B_DTO bdto=new B_DTO();
		bdto.setId(id);
		bdto.setTitle(title);
		bdto.setContent(content); 
		int result=-1;
		if(id != null) {
			result=bdao.write(bdto);
		}
		request.setAttribute("result", result);
		return view;		
	}

}
