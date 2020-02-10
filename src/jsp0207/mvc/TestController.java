package jsp0207.mvc;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//#1. request �Ӽ� �߰�
		request.setAttribute("num", "66");
		request.setAttribute("id", "test");
		
		//#2. request null �� ������
		request.setAttribute("data", null);
		
		//#3. ���������� ������ ���� ���� Ȯ��
		request.setAttribute("age", "20");
		
		//#4. session �� ������
		HttpSession session = request.getSession();
		session.setAttribute("num", 777);
		session.setAttribute("memId", "jsp");
		
		//#5. �迭 ������
		int [] arr = {10,20,30,40,50};
		request.setAttribute("arr", arr);
		
		//#6. ArrayList ������
		ArrayList list = new ArrayList();
		list.add("������");
		list.add("���α�");
		list.add("����Ǯ");
		request.setAttribute("list", list);
		
		//#7. TestVo
		TestVo vo = new TestVo();
		vo.setId("java");
		vo.setName("�̵���");		
		vo.setAge(10);
		request.setAttribute("vo", vo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp0207/jsptest.jsp");
		rd.forward(request, response);
		
		
	}
}
