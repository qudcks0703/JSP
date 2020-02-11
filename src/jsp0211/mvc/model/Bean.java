package jsp0211.mvc.model;

import java.io.IOError;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Bean {

	public String action(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
}
