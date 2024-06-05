package board;

import cmn.DTO;

public class SearchDTO extends DTO {
	
	private int pageNo;   //�럹�씠吏� 踰덊샇 : 1,2,3..
	private int pageSize; //�럹�씠吏� �궗�씠利� : 10,20,50,100,200..
	
	//寃��깋援щ텇
	//寃��깋�뼱
	private String searchDiv;
	private String searchWord;
	
	
	public SearchDTO() { 
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getSearchDiv() {
		return searchDiv;
	}

	public void setSearchDiv(String searchDiv) {
		this.searchDiv = searchDiv;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	@Override
	public String toString() {
		return "SearchDTO [pageNo=" + pageNo + ", pageSize=" + pageSize + ", searchDiv=" + searchDiv + ", searchWord="
				+ searchWord + ", getFlag()=" + getFlag() + ", toString()=" + super.toString() + "]";
	}

	public void setSearchDiv(int parseInt) {
		// TODO Auto-generated method stub
		
	}

	
	 

}