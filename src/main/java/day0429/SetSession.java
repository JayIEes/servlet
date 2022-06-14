package day0429;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
//1. HttpServlet을 상속
public class SetSession extends HttpServlet {

	//2. 요청방식을 처리할 수 있는 method를 Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. 응답할 필요가 있다면 응답 방식을 설정하고 출력 스트림을 얻는다. 응답하지 않으면 응답 방식을 설정하지 않아도 됌.
		//3. 업무처리
		String param=request.getParameter("param");
		
		if(param==null) {
			param="최초 호출";
		}//end if
		
		//S_1.세션 얻기 
		HttpSession session=request.getSession();
		
		//S_2.interval 설정 (web.xml)
		session.setMaxInactiveInterval(60*2);
	
		//S_3.세션에 값 할당 => 할당된 값을 어떤 페이지에서도 사용 가능하다.
		session.setAttribute("paramData", param);
		
		//4. 페이지 이동
		RequestDispatcher rd=request.getRequestDispatcher("day0429/session_view.jsp");
		rd.forward(request, response);
		
	}//service

}
