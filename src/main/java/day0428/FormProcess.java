package day0428;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class FormProcess extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		out.println("<strong>");
		out.println(request.getParameter("name"));
		out.println("</strong>?? ?ȳ??ϼ???.");
		out.println("<a href='javascript:history.back()'>?ٽ??Է?</a>");
	}//service

}
