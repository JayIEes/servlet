package day0429;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoveSession extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//세션 삭제
		//1. 세션얻기
		HttpSession session=request.getSession();
		//2. 세션에서 값 삭제
		session.removeAttribute("paramData");
		//3. 페이지 이동
		RequestDispatcher rd=request.getRequestDispatcher("day0429/remove_view.jsp");
		rd.forward(request, response);
	}

}
