package jsp0206.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ��� ��û�� �̰����� ������, uri�� �м��Ͽ� ��û�� ���� �´� ó���� �ϰ�
		// ��û�� �´� jsp ������ forward ��Ű��.
		
		// 1. url �м�
		String url = request.getRequestURI();
		System.out.println("url ==>" + url);
		
		// 2. ��  url��û�� ���� ó��
		String view = "";
		if(url.equals("/web/login.git")) {
			view = "/jsp0206/loginForm.jsp";			
		}else if(url.equals("/web/loginPro.git")){
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			// DB ����ó��..			
			int check = 1;
			request.setAttribute("check", check);
			view = "/jsp0206/loginPro.jsp";
		}
		
		// 3. ������ ������
		request.getRequestDispatcher(view).forward(request, response);		
	}
}