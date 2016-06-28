package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * 待做的订单    管理员还未接单，需标记用户是否已付款
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class OrderTodo implements java.io.Serializable {

	// Fields

	private Integer ordertodoId; // 待做订单id
//	private Goodsinfo goodsinfo; // 商品信息 old
	private String orderContent;//商品号以及商品数量
	private String orderNumber; // 订单编号
	private String orderPs; // 订单注释
	private Date orderTime; // 订单下单时间
	private Integer orderPay = 0;//是订单是否支付(0 未付款 1 已付款)
	private Integer orderCancel = 0;//是否退款取消(0 没 1 是)
    private Integer addressId;
    private String userId;
 	private Users users; // 下单用户
 	private Toaddress toaddress; // 收货地址
	// Constructors

	/** default constructor */
	public OrderTodo() {
	}

	/** full constructor */
	public OrderTodo(Users users, String orderNumber,
			String orderPs, Date orderTime) {
		this.users = users;
		this.orderNumber = orderNumber;
		this.orderPs = orderPs;
		this.orderTime = orderTime;
	}

	
	public OrderTodo(Integer ordertodoId) {
		super();
		this.ordertodoId = ordertodoId;
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

//	public Goodsinfo getGoodsinfo() {
//		return this.goodsinfo;
//	}
//
//	public void setGoodsinfo(Goodsinfo goodsinfo) {
//		this.goodsinfo = goodsinfo;
//	}

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
		return orderPay;
	}

	public void setOrderPay(Integer orderPay) {
		this.orderPay = orderPay;
	}

	public Integer getOrderCancel() {
		return orderCancel;
	}

	public void setOrderCancel(Integer orderCancel) {
		this.orderCancel = orderCancel;
	}

	
	public String getOrderContent() {
		return orderContent;
	}

	public void setOrderContent(String orderContent) {
		this.orderContent = orderContent;
	}
	
	

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Toaddress getToaddress() {
		return toaddress;
	}

	public void setToaddress(Toaddress toaddress) {
		this.toaddress = toaddress;
	}

	@Override
	public String toString() {
		return "OrderTodo [ordertodoId=" + ordertodoId + ", orderNumber="
				+ orderNumber + ", orderPs=" + orderPs + ", orderTime="
				+ orderTime + ", orderPay=" + orderPay + ", orderCancel="
				+ orderCancel + "]";
	}
	
	

}