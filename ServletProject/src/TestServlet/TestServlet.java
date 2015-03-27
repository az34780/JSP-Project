package TestServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8"); 
		String n =request.getParameter("name");
		String g =request.getParameter("gender");
		String c =request.getParameter("mycolor");
		String e =request.getParameter("myEmail");
		String s =request.getParameter("subgect");
	    String[] hobby=	request.getParameterValues("hobby");//체크박스
		
		PrintWriter out =response.getWriter();
	
		out.print(n + "<br>");
		out.print(g +"<br>");
		//out.print("<font color='red'>"+c+"</font><br>"); 무슨색으로 하든 빨강 출력
		out.print("<font color='" + c + "'>"+ c +"</font><br>");//글씨색이 선택한색으로
		out.print(e);
		out.print(s);
		if(hobby == null)//체크박스에 선택이 하나도 안됬을때 실행 문장
			out.print("선택하세요");
		else{
			out.print(hobby.length +"개 선택!"+"<br>");
			
			for(int i=0; i<hobby.length;i++)//선택한 hobby출력
			out.print(hobby[i]+"<br>");
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
