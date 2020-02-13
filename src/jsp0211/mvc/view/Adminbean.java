package jsp0211.mvc.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp0211.mvc.model.Bean;

public class Adminbean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		return "/WEB-INF/jsp0211/admin.jsp";
	}

}
