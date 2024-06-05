package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cmn.PLog;

/**
 * Servlet implementation class LifecycleServlet
 */
@WebServlet(description = "서블릿 설명", urlPatterns = { "/LifecycleServlet.do" })
public class LifecycleServlet extends HttpServlet implements PLog{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifecycleServlet() {
        super();
        log.debug("======================");
        log.debug("생성자 : {} ", "LifecycleServlet()");
        log.debug("======================");
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		 log.debug("======================");
	     log.debug("INIT() : {} ", "INIT()");
	     log.debug("======================");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html; charset=UTF-8");
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		
		Date now = new Date();
		
		out.println(" <!DOCTYPE html>                        \n");
		out.println(" <html>                                 \n");
		out.println(" <head>                                 \n");
		out.println(" <meta charset='UTF-8'>                 \n");
		out.println(" <title>내일은 더 즐거운 금요일</title>  	 \n");
		out.println(" </head>                                \n");
		out.println(" <body>                                 \n");
		out.println("   <h2>Hello, World!(행복한 금요일)</h2> 	 \n");
		out.println("   <p>" + now + "</p> 	 				 \n");
		out.println(" </body>                                \n");
		out.println(" </html>                                \n");
	}

}
