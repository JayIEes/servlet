package day0429;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 쿠키생성
		Cookie name=new Cookie("cookieName", "서지숙");
		Cookie age=new Cookie("cookieAge", "20");
		
		//2. 생존시간 설정
		name.setMaxAge(60*2); //초*분*시*일*월*년
		age.setMaxAge(60*2); //초*분*시*일*월*년
		
		//3. 심기
		response.addCookie(name);
		response.addCookie(age);
		
		//쿠키읽기 서블릿 리다이렉트방식으로 이동 
		response.sendRedirect("http://localhost/servlet_prj/read_cookie");
	}

}
