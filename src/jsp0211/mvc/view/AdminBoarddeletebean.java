package jsp0211.mvc.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp0211.mvc.dto.B_DAO;
import jsp0211.mvc.model.Bean;

public class AdminBoarddeletebean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		if(request.getParameter("num") !=null) {
			int num=Integer.parseInt(request.getParameter("num"));
			B_DAO bdao=B_DAO.getInstance();
			bdao.delete(num);
		}
		return "/WEB-INF/jsp0211/adminboard.jsp";

	}

}
