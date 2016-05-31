package cn.wellstudio.precisehelp.entity;

/**
 * 评论实体
 * @author huhong
 *
 */
public class Comments implements java.io.Serializable {

	// Fields

	private Integer comId; // 评论id
	private Users users; // 用户
	private OrderDone orderDone; // 已完成的订单
	private Goodsinfo goodsinfo; // 商品信息
	private String comContent; // 评论内容

	// Constructors

	/** default constructor */
	public Comments() {
	}

	/** full constructor */
	public Comments(Users users, OrderDone orderDone, Goodsinfo goodsinfo,
			String comContent) {
		this.users = users;
		this.orderDone = orderDone;
		this.goodsinfo = goodsinfo;
		this.comContent = comContent;
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

}