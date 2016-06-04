package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * 待处理订单
 * @author huhong
 *
 */
public class OrderTodo implements java.io.Serializable {

	// Fields

	private Integer ordertodoId; //id
	private Users users; // 关联用户
	private Goodsinfo goodsinfo; // 关联商品
	private String orderNumber; // 订单编号
	private String orderPs; // 订单备注
	private Date orderTime; // 订单时间
	private Integer orderPay; // 订单是否支付(0 未付款 1 已付款)
	private Integer orderCancel; // 是否退款取消(0 没 1 是)

	// Constructors

	/** default constructor */
	public OrderTodo() {
	}

	/** full constructor */
	public OrderTodo(Users users, Goodsinfo goodsinfo, String orderNumber,
			String orderPs, Date orderTime, Integer orderPay,
			Integer orderCancel) {
		this.users = users;
		this.goodsinfo = goodsinfo;
		this.orderNumber = orderNumber;
		this.orderPs = orderPs;
		this.orderTime = orderTime;
		this.orderPay = orderPay;
		this.orderCancel = orderCancel;
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

	public Integer getOrderPay() {
		return this.orderPay;
	}

	public void setOrderPay(Integer orderPay) {
		this.orderPay = orderPay;
	}

	public Integer getOrderCancel() {
		return this.orderCancel;
	}

	public void setOrderCancel(Integer orderCancel) {
		this.orderCancel = orderCancel;
	}

}