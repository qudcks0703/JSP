package jsp0206.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginProController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//DB�����ؼ� id,pw üũ�ϴ� ����....
		//MemberDAO dao = MemberDAO.getInstance();
		//int check = dao.usercheck(id,pw);
		int check = 1;	// ���Ƿ� �´ٰ� �ϱ�
		
		//view���� �α��� üũ ����� request�� �����ؼ� �Ѱ��ֱ�
		request.setAttribute("check", check);
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp0206/loginpPro.jsp");
		rd.forward(request, response);
	}
}