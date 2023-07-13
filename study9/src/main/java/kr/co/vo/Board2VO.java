package kr.co.vo;

import java.util.Date;

public class Board2VO {

	private int num;
	private String name;
	private String title;
	private String main_t;
	private Date regdate;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMain_t() {
		return main_t;
	}
	public void setMain_t(String main_t) {
		this.main_t = main_t;
	}
	
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
