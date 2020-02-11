package jsp0211.mvc.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp0211.mvc.model.Bean;

public class Logoutbean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session= request.getSession();
		session.invalidate();
		String view="/WEB-INF/jsp0211/login.0211";
		return view;
	}

}
