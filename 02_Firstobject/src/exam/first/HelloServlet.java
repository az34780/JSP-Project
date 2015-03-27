package exam.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("*.first") //URL Mapping
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//한글처리
		request.setCharacterEncoding("UTF-8");//GET방식에서는 안됨,server.xmlURIEncoding="UTF-8"해줘야함//클->서
		response.setContentType("text/html;charset=UTF-8");//ㄴㅐ려보낼떄html로 보내겟다.(MIME)
		
		PrintWriter out =response.getWriter();
		
		
		String j= request.getParameter("abc");//이름의 정보 값이 넘어옴 "name속성"
		String id= request.getParameter("id");
		String password= request.getParameter("pwd");
		
		out.print("Hello - GET<br>");
		out.print("이름  :"+ j +"<br>");

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//한글처리
		request.setCharacterEncoding("UTF-8");//데이터입력창한글깨짐방지
		response.setContentType("text/html;charset=UTF-8");//한글깨짐방지
		
		PrintWriter out =response.getWriter();
		
		String j= request.getParameter("name");//이름의 정보 값이 넘어옴 "name속성"
		String id= request.getParameter("id");
		String password= request.getParameter("pwd");
		//out.print("<html>");
		out.print("Hello - GET<br>");
		out.print("이름  :"+ j +"<br>");
	//	out.print("</html>");
	
	}

	}


