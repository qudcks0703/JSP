package jsp0211.mvc.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp0211.mvc.dto.M_DAO;
import jsp0211.mvc.dto.M_DTO;
import jsp0211.mvc.model.Bean;

public class User_Updatebean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session= request.getSession();
		String id=(String)session.getAttribute("sid");

		
		M_DAO mdao=M_DAO.getInstance();
		M_DTO mdto= mdao.selectId(id);
		request.setAttribute("M_DTO", mdto);
		
		String view="/WEB-INF/jsp0211/update.jsp";
		return view;		
	}

}
