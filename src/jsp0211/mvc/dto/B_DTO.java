package jsp0211.mvc.dto;

import java.sql.Timestamp;

public class B_DTO {

	private String id;
	private String title;
	private String content;
	private Timestamp reg;
	private int num;
	private int r;
	
	public B_DTO() {
	}
	public B_DTO(String id, String title, String content, Timestamp reg, int num, int r) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.reg = reg;
		this.num = num;
		this.r = r;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getReg() {
		return reg;
	}
	public void setReg(Timestamp reg) {
		this.reg = reg;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
	
}
