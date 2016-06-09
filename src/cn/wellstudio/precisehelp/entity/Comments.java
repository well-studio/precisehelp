package cn.wellstudio.precisehelp.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 评论实体
 * 
 * @author huhong
 *
 */
public class Comments implements java.io.Serializable {

	// Fields

	private Integer comId; // id
	private Users users; // 关联用户
	private Comments comChild; // 关联儿子评论
	private OrderDone orderDone; // 关联已完成的订单
	private Goodsinfo goodsinfo; // 关联商品信息
	private String comContent; // 评论内容
	private Date comTime; // 评论时间
	private Integer comUps; // 评论赞数
	// private Set commentses = new HashSet(0); // 关联父亲
	private Comments comParent; // 关联父亲

	// Constructors

	/** default constructor */
	public Comments() {
	}

	public Comments(Integer comId) {
		super();
		this.comId = comId;
	}

	/** full constructor */
	public Comments(Users users, Comments comChild, OrderDone orderDone,
			Goodsinfo goodsinfo, String comContent, Date comTime,
			Integer comUps, Comments comParent) {
		this.users = users;
		this.comChild = comChild;
		this.orderDone = orderDone;
		this.goodsinfo = goodsinfo;
		this.comContent = comContent;
		this.comTime = comTime;
		this.comUps = comUps;
		this.comParent = comParent;
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

	public Comments getComParent() {
		return comParent;
	}

	public void setComParent(Comments comParent) {
		this.comParent = comParent;
	}

	public Comments getComChild() {
		return comChild;
	}

	public void setComChild(Comments comChild) {
		this.comChild = comChild;
	}

	@Override
	public String toString() {
		return "Comments [comId=" + comId + ", comContent=" + comContent
				+ ", comTime=" + comTime + ", comUps=" + comUps + "]";
	}

	// public Set getCommentses() {
	// return this.commentses;
	// }
	//
	// public void setCommentses(Set commentses) {
	// this.commentses = commentses;
	// }

}