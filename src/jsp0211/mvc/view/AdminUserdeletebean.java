package jsp0211.mvc.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp0211.mvc.dto.B_DAO;
import jsp0211.mvc.dto.M_DAO;
import jsp0211.mvc.model.Bean;

public class AdminUserdeletebean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		
		String id=request.getParameter("id");
		M_DAO mdao=M_DAO.getInstance();
		mdao.delete(id);
		return "/WEB-INF/jsp0211/adminboard.jsp";
	}

}
