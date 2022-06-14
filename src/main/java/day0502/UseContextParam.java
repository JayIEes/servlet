package day0502;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��� Servlet/JSP���� ����� �� �ִ� <context-param>���
 * @author user
 */
@SuppressWarnings("serial")
public class UseContextParam extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//1.ServletContext ���
		ServletContext sc=getServletContext();
		
		//2.�����
		String common_css=sc.getInitParameter("common_css");
		String common_js=sc.getInitParameter("common_jquery");
		
		System.out.println("context-param");
		System.out.println("���� css "+common_css);
		System.out.println("���� js "+common_js);
		
	}

}
