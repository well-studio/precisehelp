package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * Questionreply entity. @author MyEclipse Persistence Tools
 */

public class Questionreply implements java.io.Serializable {

	// Fields

	private Integer replyId;
	private Users users;
	private Goodsquestion goodsquestion;
	private String replyContent;
	private Date replyTime;
	private Integer replyAdm;

	// Constructors

	/** default constructor */
	public Questionreply() {
	}

	/** minimal constructor */
	public Questionreply(String replyContent) {
		this.replyContent = replyContent;
	}

	/** full constructor */
	public Questionreply(Users users, Goodsquestion goodsquestion,
			String replyContent, Date replyTime, Integer replyAdm) {
		this.users = users;
		this.goodsquestion = goodsquestion;
		this.replyContent = replyContent;
		this.replyTime = replyTime;
		this.replyAdm = replyAdm;
	}

	// Property accessors

	public Integer getReplyId() {
		return this.replyId;
	}

	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Goodsquestion getGoodsquestion() {
		return this.goodsquestion;
	}

	public void setGoodsquestion(Goodsquestion goodsquestion) {
		this.goodsquestion = goodsquestion;
	}

	public String getReplyContent() {
		return this.replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Date getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public Integer getReplyAdm() {
		return this.replyAdm;
	}

	public void setReplyAdm(Integer replyAdm) {
		this.replyAdm = replyAdm;
	}

}