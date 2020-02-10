package jsp0206.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/hellowServlet")
public class hellowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static int x = 100;
	
	
    public hellowServlet() {
    	// ������
        super();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
//    	int y=200;
//    	System.out.println(hellowServlet.x);
//    	System.out.println(y);
    	PrintWriter pw = resp.getWriter();
    	pw.println("<html>");
    	pw.println("<body>");
    	pw.println("<h2>hellowservlet</h2>");    	
    	pw.println("</body>");
    	pw.println("</html>");
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// GET ��û�޾��� �� ó���ؾ��� ���� �ۼ�
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST ��û�� �޾��� �� ó���ؾ��� ���� �ۼ�.
		doGet(request, response);
	}

}
