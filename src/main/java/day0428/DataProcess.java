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
 * �����͸� ó���Ѵ�.
 */
@SuppressWarnings("serial")
public class DataProcess extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ó���� ������
		String[] url= {"daum.net","naver.com","google.com","nate.com","youtube.com"};
		TestVO tv=new TestVO("ũ����", "������ ������Դϴ�.");
		
		//scope ��ü�� ����(�̵��� ���������� ����� �� �ֵ��� request�� session�� ���)
		request.setAttribute("site_url", url);
		request.setAttribute("vo", tv);
		
		//�̵��� ������ URI ����
		//http://localhost/servlet_prj/day0428/view.jsp
		RequestDispatcher rd=request.getRequestDispatcher("day0428/data_view.jsp");
		//�̵�
		rd.forward(request, response);
		
	}//doGet

}
