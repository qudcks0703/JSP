package jsp0211.mvc.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp0211.mvc.dto.B_DAO;
import jsp0211.mvc.dto.B_DTO;
import jsp0211.mvc.model.Bean;

public class Board_Updatebean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session= request.getSession();
		String id=(String)session.getAttribute("sid");
		int num=Integer.parseInt(request.getParameter("num"));
		B_DAO bdao=B_DAO.getInstance();
		B_DTO bdto= bdao.content(num);
		request.setAttribute("bdto", bdto);
		
		String view="/WEB-INF/jsp0211/board_update.jsp";
		return view;		
	}

}
