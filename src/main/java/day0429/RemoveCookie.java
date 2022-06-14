package day0429;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RemoveCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//쿠키 삭제
		//1.삭제하려는 이름의 쿠키 생성
		Cookie nameCookie=new Cookie("cookieName", "");
		Cookie ageCookie=new Cookie("cookieAge", "");
	
		//2. 바로 삭제되도록 생존시간 0으로
		nameCookie.setMaxAge(0);
		ageCookie.setMaxAge(0);
		
		//3. 쿠키 심기
		response.addCookie(nameCookie);
		response.addCookie(ageCookie);
		
		//쿠키를 읽기 위한 서블렛 페이지 이동
		response.sendRedirect("http://localhost/servlet_prj/read_cookie");
	}

}
