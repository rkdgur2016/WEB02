package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TodayServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		
		out.println(" <!DOCTYPE html>                        \n");
		out.println(" <html>                                 \n");
		out.println(" <head>                                 \n");
		out.println(" <meta charset='UTF-8'>                 \n");
		out.println(" <title>������ �� ��ſ� �ݿ���</title>  	 \n");
		out.println(" </head>                                \n");
		out.println(" <body>                                 \n");
		out.println("   <h2>Hello, World!(�ູ�� �ݿ���)</h2> 	 \n");
		out.println(" </body>                                \n");
		out.println(" </html>                                \n");
	}
	
	
}
