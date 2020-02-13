package jsp0211.mvc.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp0211.mvc.dto.B_DAO;
import jsp0211.mvc.model.Bean;

public class Writebean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		
		return "/WEB-INF/jsp0211/write.jsp";
	}

}
