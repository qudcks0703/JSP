package jsp0211.mvc.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp0211.mvc.model.Bean;

public class User_Deletebean implements Bean {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		String view="/WEB-INF/jsp0211/delete.jsp";
		return view;		
	}

}
