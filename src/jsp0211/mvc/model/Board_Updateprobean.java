package jsp0211.mvc.model;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp0211.mvc.dto.B_DAO;
import jsp0211.mvc.dto.B_DTO;
import jsp0211.mvc.dto.M_DAO;
import jsp0211.mvc.dto.M_DTO;

public class Board_Updateprobean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		
		request.setCharacterEncoding("utf-8");
		String view="/WEB-INF/jsp0211/board_updatepro.jsp";
		
		int num=Integer.parseInt(request.getParameter("num"));
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		B_DTO bdto=new B_DTO();
		bdto.setTitle(title);
		bdto.setContent(content);
		bdto.setNum(num);
		B_DAO bdao=B_DAO.getInstance();
		int result=-1;
		
		if(num != 0) {
			result=bdao.update(bdto);
		}
		request.setAttribute("result", result);
		return view;	
	}

}
