package jsp0211.mvc.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp0211.mvc.dto.B_DAO;
import jsp0211.mvc.dto.B_DTO;
import jsp0211.mvc.model.Bean;

public class Board_Deletebean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session= request.getSession();
		int num=Integer.parseInt(request.getParameter("num"));
		B_DAO bdao=B_DAO.getInstance();
		int result=-1;
		if(num !=0) {
			result=bdao.delete(num);
		}
		request.setAttribute("result", result);
		
		String view="/WEB-INF/jsp0211/board_delete.jsp";
		return view;		
	}

}
