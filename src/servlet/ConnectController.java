package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cmn.ControllerV;
import cmn.PLog;
import cmn.StringUtil;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/connect.do")
public class ConnectController extends HttpServlet implements PLog, ControllerV{
	
	private static final long serialVersionUID = 1L;
	public ConnectController() {
		log.debug("=====================");
		log.debug("BoardController()");
		log.debug("=====================");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		log.debug("=====================");
		log.debug("doGet()");
		log.debug("=====================");
		doWork(req,res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		log.debug("=====================");
		log.debug("doPost()");
		log.debug("=====================");
		doWork(req,res);
	}

	public void doWork(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		log.debug("=====================");
		log.debug("doWork()");
		log.debug("=====================");
		
		//req encoding
		req.setCharacterEncoding("UTF-8");
		
		String workDiv = StringUtil.nvl(req.getParameter("work_div"),"");
		//String userName = req.getParameter("user_name");
		
		log.debug("workDiv : {}", workDiv);
		
		switch (workDiv) {
		
		case "doRetrieve" :
			doRetrieve(req, res);
			break;
			
		case "doSave" :
			doSave(req, res);
			break;
			
		default:
			log.debug("작업구분을 확인하세요. workDiv : " + workDiv);
			break;
		}
		
		
//		if(workDiv.equals("doRetrieve")) {
//			doRetrieve(req, res);
//		}else if(workDiv.equals("doSave")){
//			doSave(req, res);
//		}else {
//			log.debug("작업구분을 확인하세요. workDiv : " + workDiv);
//		}
//		log.debug("userName : {}", userName);
	}
	
	public void doSave(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		log.debug("=====================");
		log.debug("doSave()");
		log.debug("=====================");
		
	}
	
	public void doRetrieve(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		log.debug("=====================");
		log.debug("doRetrieve()");
		log.debug("=====================");
		
		String userName = req.getParameter("user_name");
		log.debug("userName : {}", userName);
		
		//UI
		req.setAttribute("userName", userName + "님");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/J02/J03_connect_response.jsp");
		dispatcher.forward(req, res);
	}

}
