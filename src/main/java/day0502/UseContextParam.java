package day0502;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 모든 Servlet/JSP에서 사용할 수 있는 <context-param>사용
 * @author user
 */
@SuppressWarnings("serial")
public class UseContextParam extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//1.ServletContext 얻기
		ServletContext sc=getServletContext();
		
		//2.값얻기
		String common_css=sc.getInitParameter("common_css");
		String common_js=sc.getInitParameter("common_jquery");
		
		System.out.println("context-param");
		System.out.println("공통 css "+common_css);
		System.out.println("공통 js "+common_js);
		
	}

}
