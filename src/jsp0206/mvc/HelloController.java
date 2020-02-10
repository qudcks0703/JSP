package jsp0206.mvc;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class HelloController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ������ �ٷ� ������ �Ұ�. ��û�� �¹��� �������� ���ּҵ� ����������.
		// web.xml�� �۾��ؾ���.
		System.out.println("hellow!!!");
		
		// # jsp �������� ������ �ѱ��
		request.setAttribute("num", 1);
		request.setAttribute("name", "test");
		
		// # session���� ������ �ѱ��
		HttpSession session = request.getSession();
		session.setAttribute("memId", "java");
		
		//�ش� jsp ������ ����
		RequestDispatcher rd = request.getRequestDispatcher("/jsp0206/hello.jsp");
		rd.forward(request, response);
		
		//<jsp:forward> �±׸� �ڹٷ� �ٲ� ���¿� ����ϴ�.
		
	}
}