package board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;

import java.util.List;

import cmn.ControllerV;
import cmn.PLog;
import cmn.SearchDTO;
import cmn.StringUtil;

/**
 * Servlet implementation class BoardContoller
 */
@WebServlet(description = "�Խ��� ��Ʈ�ѷ�", urlPatterns = { "/board/board.do" })
public class BoardContoller extends HttpServlet implements ControllerV, PLog{
	private static final long serialVersionUID = 1L;
	
	BoardService service;

    public BoardContoller() {
    	log.debug("=====================");
		log.debug("BoardContoller()");
		log.debug("=====================");
		
		service = new BoardService();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		log.debug("=====================");
		log.debug("doGet()");
		log.debug("=====================");
		doWork(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		log.debug("=====================");
		log.debug("doPost()");
		log.debug("=====================");
		doWork(req, res);
	}
	
	
	
	public void doWork(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		log.debug("=====================");
		log.debug("doWork()");
		log.debug("=====================");
		
		//request ���ڵ� ó�� :
		req.setCharacterEncoding("UTF-8");
		
		String workDiv = StringUtil.nvl(req.getParameter("work_div"),"0");
		log.debug("workDiv : {}", workDiv);
		
		switch(workDiv) {
		case "doRetrieve" :
			doRetrieve(req, res);
			break;
			
		default :
			log.debug("�۾� ������ Ȯ���ϼ���. workDiv : {}", workDiv);
			break;
		}
	}
	
	public void doRetrieve(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		log.debug("=====================");
		log.debug("doRetrieve()");
		log.debug("=====================");
		HttpSession sesssion = req.getSession();
		
		SearchDTO inVO= new SearchDTO();
		
		//page_no
		//page_size
		String pageNo = StringUtil.nvl(req.getParameter("page_no"),"1");
		String pageSize = StringUtil.nvl(req.getParameter("page_size"),"10");
		
		log.debug("pageNO : {}", pageNo);
		log.debug("pageSize : {}", pageSize);
		
		inVO.setPageNo(Integer.parseInt(pageNo));
		inVO.setPageSize(Integer.parseInt(pageSize));
		
		log.debug("inVO : {}", inVO);
		
		//service call
		List<BoardDTO> list = service.doRetrieve(inVO);
		
		//return ������ Ȯ��
		int i =0;
		for(BoardDTO vo : list) {
			log.debug("i : {}, vo : {} :", ++i, vo);
		}
		
		//UI ������ ����
		req.setAttribute("list", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/J02/board_list.jsp");
		dispatcher.forward(req, res);
	}
}
	

