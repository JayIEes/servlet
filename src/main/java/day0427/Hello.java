package day0427;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. HttpServlet�� ���
public class Hello extends HttpServlet {

	//��û ����� ó���� �� �ִ� method Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. �����ڿ��� ������ ���� ��� ����
		response.setContentType("text/html;charset=UTF-8");
		
		//4. ��� ��Ʈ���� ���
		PrintWriter out=response.getWriter();
		
		//5. �����ڿ��� ������ ������ ����
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>�ȳ缭��</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("</body>");
		out.println("</html>");
			
	}//doGet

}//
