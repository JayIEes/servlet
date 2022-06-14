package day0427;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. HttpServlet을 상속
public class Hello extends HttpServlet {

	//요청 방식을 처리할 수 있는 method Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. 접속자에게 제공할 응답 방식 설정
		response.setContentType("text/html;charset=UTF-8");
		
		//4. 출력 스트림을 얻기
		PrintWriter out=response.getWriter();
		
		//5. 접속자에게 제공할 내용을 생성
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>안녕서블릿</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("</body>");
		out.println("</html>");
			
	}//doGet

}//
