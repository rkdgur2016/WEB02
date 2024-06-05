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
@WebServlet(description = "게시판 컨트롤러", urlPatterns = { "/board/board.do" })
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
		
		//request 인코딩 처리 :
		req.setCharacterEncoding("UTF-8");
		
		String workDiv = StringUtil.nvl(req.getParameter("work_div"),"");
		log.debug("workDiv : {}", workDiv);
		
		switch(workDiv) {
		case "doRetrieve" :
			doRetrieve(req, res);
			break;
			
		default :
			log.debug("작업 구분을 확인하세요. workDiv : {}", workDiv);
			break;
		}
	}
	
	public void doRetrieve(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		log.debug("=====================");
		log.debug("doRetrieve()");
		log.debug("=====================");
		HttpSession session = req.getSession();
		
		SearchDTO inVO= new SearchDTO();
		
		//page_no
		//page_size
		String pageNo = StringUtil.nvl(req.getParameter("page_no"),"1");
		String pageSize = StringUtil.nvl(req.getParameter("page_size"),"10");
		String searchWord = StringUtil.nvl(req.getParameter("search_word"),"");
		String searchDiv = StringUtil.nvl(req.getParameter("search_div"),"");
		
		log.debug("pageNO : {}", pageNo);
		log.debug("pageSize : {}", pageSize);
		log.debug("searchWord : {}", searchWord);
		log.debug("searchDiv : {}", searchDiv);
		
		inVO.setPageNo(Integer.parseInt(pageNo));
		inVO.setPageSize(Integer.parseInt(pageSize));
		inVO.setSearchWord(searchWord);
		inVO.setSearchDiv(searchDiv);
		log.debug("inVO : {}", inVO);
		
		//service call
		List<BoardDTO> list = service.doRetrieve(inVO);
		
		//return 데이터 확인
		int i =0;
		for(BoardDTO vo : list) {
			log.debug("i : {}, vo : {} :", ++i, vo);
		}
		
		//UI 데이터 전달
		req.setAttribute("list", list);
		
		//검색 조건 UI로 전달
		req.setAttribute("vo", inVO);
		
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/J02/board_list.jsp");
		dispatcher.forward(req, res);
	}
}
	

