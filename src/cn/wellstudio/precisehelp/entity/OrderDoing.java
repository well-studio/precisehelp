package cn.wellstudio.precisehelp.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 正在进行的订单 管理员处理中
 * 
 * @author huhong
 *
 */
public class OrderDoing implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer orderdoingId; // 正在进行的订单id
	private Users users; // 关联的用户
	private Express express; // 关联的物流信息
	private Admins admins; // 处理订单的管理员
	// private Goodsinfo goodsinfo; // 关联的商品类型 old
	private String orderContent;//商品号以及商品数量
	private String orderNum; // 订单编号
	private String orderPs; // 订单注释
	private Date orderTime; // 订单下单时间
	private Date orderHandleTime; // 订单开始处理时间+++
	private Integer orderStat; // 订单受理状态(0 无人受理 1正在受理 2受理完毕 起初默认为0)
	private String orderKcom; // 订单快递公司
	private String orderKnum; // 订单快递订单
	private Todolist todolist; // 1:1 管理员处理list

	// Constructors

	/** default constructor */
	public OrderDoing() {
	}

	
	public OrderDoing(String orderContent) {
		super();
		this.orderContent = orderContent;
	}


	public OrderDoing(Integer orderdoingId) {
		super();
		this.orderdoingId = orderdoingId;
	}

	/** full constructor */
	public OrderDoing(Users users, Express express, Admins admins,
			String orderNum, String orderPs, Date orderTime, Integer orderStat,
			String orderKcom, String orderKnum, Todolist todolist) {
		this.users = users;
		this.express = express;
		this.admins = admins;
		this.orderNum = orderNum;
		this.orderPs = orderPs;
		this.orderTime = orderTime;
		this.orderStat = orderStat;
		this.orderKcom = orderKcom;
		this.orderKnum = orderKnum;
		this.todolist = todolist;
	}

	// Property accessors

	public Integer getOrderdoingId() {
		return this.orderdoingId;
	}

	public void setOrderdoingId(Integer orderdoingId) {
		this.orderdoingId = orderdoingId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Express getExpress() {
		return this.express;
	}

	public void setExpress(Express express) {
		this.express = express;
	}

	public Admins getAdmins() {
		return this.admins;
	}

	public void setAdmins(Admins admins) {
		this.admins = admins;
	}

	// old
	// public Goodsinfo getGoodsinfo() {
	// return this.goodsinfo;
	// }
	//
	// public void setGoodsinfo(Goodsinfo goodsinfo) {
	// this.goodsinfo = goodsinfo;
	// }

	public String getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
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

	public Integer getOrderStat() {
		return this.orderStat;
	}

	public void setOrderStat(Integer orderStat) {
		this.orderStat = orderStat;
	}

	public String getOrderKcom() {
		return this.orderKcom;
	}

	public void setOrderKcom(String orderKcom) {
		this.orderKcom = orderKcom;
	}

	public String getOrderKnum() {
		return this.orderKnum;
	}

	public void setOrderKnum(String orderKnum) {
		this.orderKnum = orderKnum;
	}

	public Todolist getTodolist() {
		return todolist;
	}

	public void setTodolist(Todolist todolist) {
		this.todolist = todolist;
	}

	public Date getOrderHandleTime() {
		return orderHandleTime;
	}

	public void setOrderHandleTime(Date orderHandleTime) {
		this.orderHandleTime = orderHandleTime;
	}

	
	public String getOrderContent() {
		return orderContent;
	}

	public void setOrderContent(String orderContent) {
		this.orderContent = orderContent;
	}

	@Override
	public String toString() {
		return "OrderDoing [orderdoingId=" + orderdoingId + ", orderNum="
				+ orderNum + ", orderPs=" + orderPs + ", orderTime="
				+ orderTime + ", orderStat=" + orderStat + ", orderKcom="
				+ orderKcom + ", orderKnum=" + orderKnum + "]";
	}

}