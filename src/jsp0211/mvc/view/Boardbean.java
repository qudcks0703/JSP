package jsp0211.mvc.view;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp0211.mvc.dto.B_DAO;
import jsp0211.mvc.model.Bean;

public class Boardbean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		
		request.setCharacterEncoding("utf-8");
		B_DAO bdao=B_DAO.getInstance();
		String select=request.getParameter("select");
		String select_value=request.getParameter("select_value");
		List list=null;
		if(select_value ==null && select ==null) {
			list=bdao.select();
			request.setAttribute("list",list);
		}else {
			list=bdao.ex_select(select,select_value);
			request.setAttribute("list",list);
		}
		
		return "/WEB-INF/jsp0211/board.jsp";
	}

}
