package day0428;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author user
 * 데이터를 처리한다.
 */
@SuppressWarnings("serial")
public class DataProcess extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//처리된 데이터
		String[] url= {"daum.net","naver.com","google.com","nate.com","youtube.com"};
		TestVO tv=new TestVO("크리스", "오늘은 목요일입니다.");
		
		//scope 객체에 저장(이동한 페이지에서 사용할 수 있도록 request나 session을 사용)
		request.setAttribute("site_url", url);
		request.setAttribute("vo", tv);
		
		//이동할 페이지 URI 설정
		//http://localhost/servlet_prj/day0428/view.jsp
		RequestDispatcher rd=request.getRequestDispatcher("day0428/data_view.jsp");
		//이동
		rd.forward(request, response);
		
	}//doGet

}
