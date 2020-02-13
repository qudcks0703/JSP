package jsp0211.mvc.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp0211.mvc.dto.B_DAO;
import jsp0211.mvc.dto.B_DTO;
import jsp0211.mvc.model.Bean;

public class Contentbean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		int num=Integer.parseInt(request.getParameter("num"));
		B_DAO bdao=B_DAO.getInstance();
		B_DTO bdto=bdao.content(num);
		request.setAttribute("bdto", bdto);
		
		return "/WEB-INF/jsp0211/content.jsp";
	}

}
