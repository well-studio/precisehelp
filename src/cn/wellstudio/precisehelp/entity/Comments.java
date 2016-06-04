package cn.wellstudio.precisehelp.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 评论实体
 * @author huhong
 *
 */
public class Comments implements java.io.Serializable {

	// Fields

	private Integer comId; // id
	private Users users; // 关联用户
	private Comments comments; // 关联评论
	private OrderDone orderDone; // 关联已完成的订单
	private Goodsinfo goodsinfo; // 关联商品信息
	private String comContent; // 评论内容
	private Date comTime; // 评论时间
	private Integer comUps; // 评论赞数
	private Set commentses = new HashSet(0); // 关联父亲

	// Constructors

	/** default constructor */
	public Comments() {
	}

	/** full constructor */
	public Comments(Users users, Comments comments, OrderDone orderDone,
			Goodsinfo goodsinfo, String comContent, Date comTime,
			Integer comUps, Set commentses) {
		this.users = users;
		this.comments = comments;
		this.orderDone = orderDone;
		this.goodsinfo = goodsinfo;
		this.comContent = comContent;
		this.comTime = comTime;
		this.comUps = comUps;
		this.commentses = commentses;
	}

	// Property accessors

	public Integer getComId() {
		return this.comId;
	}

	public void setComId(Integer comId) {
		this.comId = comId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Comments getComments() {
		return this.comments;
	}

	public void setComments(Comments comments) {
		this.comments = comments;
	}

	public OrderDone getOrderDone() {
		return this.orderDone;
	}

	public void setOrderDone(OrderDone orderDone) {
		this.orderDone = orderDone;
	}

	public Goodsinfo getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public String getComContent() {
		return this.comContent;
	}

	public void setComContent(String comContent) {
		this.comContent = comContent;
	}

	public Date getComTime() {
		return this.comTime;
	}

	public void setComTime(Date comTime) {
		this.comTime = comTime;
	}

	public Integer getComUps() {
		return this.comUps;
	}

	public void setComUps(Integer comUps) {
		this.comUps = comUps;
	}

	public Set getCommentses() {
		return this.commentses;
	}

	public void setCommentses(Set commentses) {
		this.commentses = commentses;
	}

}