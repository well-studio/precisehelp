package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * 待做的订单
 * @author huhong
 *
 */
public class OrderTodo implements java.io.Serializable {

	// Fields

	private Integer ordertodoId; // 待做订单id
	private Users users; // 下单用户
	private Goodsinfo goodsinfo; // 商品信息
	private String orderNumber; // 订单编号
	private String orderPs; // 订单注释
	private Date orderTime; // 订单下单时间

	// Constructors

	/** default constructor */
	public OrderTodo() {
	}

	/** full constructor */
	public OrderTodo(Users users, Goodsinfo goodsinfo, String orderNumber,
			String orderPs, Date orderTime) {
		this.users = users;
		this.goodsinfo = goodsinfo;
		this.orderNumber = orderNumber;
		this.orderPs = orderPs;
		this.orderTime = orderTime;
	}

	// Property accessors

	public Integer getOrdertodoId() {
		return this.ordertodoId;
	}

	public void setOrdertodoId(Integer ordertodoId) {
		this.ordertodoId = ordertodoId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Goodsinfo getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderPs() {
		return this.orderPs;
	}

	public void setOrderPs(String orderPs) {
		this.orderPs = orderPs;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

}