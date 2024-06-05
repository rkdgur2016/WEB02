package board;

import java.util.List;



import cmn.DTO;
import cmn.PLog;
import cmn.SearchDTO;
import emp.DeptDTO;
import emp.DeptDaoMain;

public class BoardMain implements PLog {
 
		BoardDAO DAO;
		BoardDTO board01; 
	 
		public BoardMain() {
			DAO = new BoardDAO();
			board01 = new BoardDTO(30, "�젣紐�_30", "紐⑤떇", 0, "admin_30", "�궗�슜x", "amdin_30", "�궗�슜x");
		     
		}
		
		public void doSave() {
			log.debug("doSave()");
			int flag = DAO.doSave(board01);
			if(1 == flag) {
				log.debug("�꽦怨�:{}",flag);
				
			}else {
				log.debug("�떎�뙣:{}",flag);
			}
			////board01.setRegId();
			
			
		} 
		public void doUpdate() {
			log.debug("doUpdate()");
			String updateStr = "_U";
			board01.setTitle(board01.getTitle()    +updateStr);
			board01.setContents(board01.getContents() +updateStr);
			board01.setModId(board01.getModId() +updateStr);
			
			DAO.doUpdate(board01);
			int flag = DAO.doUpdate(board01);
			if(1 == flag) {
				log.debug("�꽦怨�:{}",flag);
				
			}else {
				log.debug("�떎�뙣:{}",flag);
			}
			////board01.setRegId();
			
			
		} 
		public void doDelete() {
			log.debug("doDelete()");
			int flag = DAO.doDelete(board01);
			if(1 == flag) {
				log.debug("�꽦怨�:{}",flag);
				
			}else {
				log.debug("�떎�뙣:{}",flag);
			}
			////board01.setRegId();
			
			
		} 
		
		public BoardDTO deSelectOne() {
			log.debug("doSelectOne()");  
			BoardDTO outVO = DAO.doSelectOne(board01);
			
			if(null !=outVO) {
				log.debug("�떒嫄� 議고쉶 �꽦怨�"+outVO);
			}else {
				log.debug("�떒嫄� 議고쉶 �떎�뙣"+outVO);
			}
			return outVO;
		}
 
		
		public void doUpdateReadCnt() {
			log.debug("doUpdateReadCnt()");
			//蹂몄씤湲�議고쉶�븞�릪
			board01.setRegId(board01.getRegId()+"000");
			int flag = DAO.doUpdateReadCnt(board01);
			if(1 == flag) {
				log.debug("�꽦怨�:{}",flag);
				
			}else {
				log.debug("�떎�뙣:{}",flag);
			}
			////board01.setRegId();
			
			
		} 
		
		public void doRetrieve() {
			log.debug("doRetrieve()");
			SearchDTO searchVO = new SearchDTO();
			searchVO.setPageNo(1);
			searchVO.setPageSize(10);
			
			searchVO.setSearchDiv("50");
			searchVO.setSearchWord("30"); 
			
			List<BoardDTO> list = DAO.doRetrieve(searchVO);
			int i = 0;
			for(BoardDTO vo : list) {
				log.debug("i: {}, vi: {}",++i,vo);
			}
		 
		} 
		
		public void addAndGet() {
			//1. �궘�젣:  �꽦怨� �떎�뙣 泥댄겕 �븡�븿
			//2. �벑濡�:
			//3. 議고쉶:
			log.debug("addAndGet()");
			
			//1.
			DAO.doDelete(board01);
			//2.
			int flag = DAO.doSave(board01);
			if(1 == flag) {
				log.debug("�꽦怨�:{}",flag);
				
			}else {
				log.debug("�떎�뙣:{}",flag);
				return;
			}
			//3.
			BoardDTO outVO = DAO.doSelectOne(board01); 
			
		    //outVO.setSeq(9999);
		    
			boolean isSame = isSameData(outVO, board01);
			if(false == isSame) {
			    log.debug("---------------�떎�뙣--");		
			}else {
				log.debug("---------------�꽦怨�--");	
			}
			
		}
		
		public boolean isSameData(BoardDTO outVO, BoardDTO board01) {
			
				// board01,outVO 鍮꾧탳
			if(outVO.getSeq() != board01.getSeq() ) {
				log.debug("�떎�뙣 seq: {},{}",outVO.getSeq(),board01.getSeq());
				return false;
			}
			if(!outVO.getTitle().equals(board01.getTitle())) {
				log.debug("�떎�뙣 title: {},{}",outVO.getTitle(),board01.getTitle());
				return false;
			}
			if(!outVO.getContents().equals(board01.getContents())) {
				log.debug("�떎�뙣 Contents: {},{}",outVO.getContents(),board01.getContents());
				return false;
			}
			if(!outVO.getRegId().equals(board01.getRegId())) {
				log.debug("�떎�뙣 RegId: {},{}",outVO.getRegId(),board01.getRegId());
				return false;
			}
			return true;
		}
		
		
		public static void main(String[] args) { 
			
			BoardMain m = new BoardMain();
			//m.doUpdateReadCnt();
			//m.doRetrieve();
			//m.doUpdate();
			m.doSave();
			//m.doDelete();
			//m.deSelectOne();
			//m.addAndGet();

		 

	}

}
