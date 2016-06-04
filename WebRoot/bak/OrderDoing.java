package cn.wellstudio.precisehelp.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 正在处理的订单
 * @author huhong
 *
 */
public class OrderDoing implements java.io.Serializable {

	// Fields

	private Integer orderdoingId; // id
	private Users users; // 关联用户
	private Express express; // 关联物流
	private Admins admins; // 关联管理员
	private Goodsinfo goodsinfo; // 关联商品
	private String orderNum; // 订单编号
	private String orderPs; // 订单备注
	private Date orderTime; // 订单下单时间
	private Date orderHandleTime; // 订单开始处理时间
	private Integer orderStat; // 订单受理状态(0 无人受理 1正在受理 2受理完毕 起初默认为0)(++++)
	private String orderKcom; // 订单快递公司
	private String orderKnum; // 订单快递单号
	private Set todolists = new HashSet(0); // 1:1 管理员处理list

	// Constructors

	/** default constructor */
	public OrderDoing() {
	}

	/** full constructor */
	public OrderDoing(Users users, Express express, Admins admins,
			Goodsinfo goodsinfo, String orderNum, String orderPs,
			Date orderTime, Date orderHandleTime, Integer orderStat,
			String orderKcom, String orderKnum, Set todolists) {
		this.users = users;
		this.express = express;
		this.admins = admins;
		this.goodsinfo = goodsinfo;
		this.orderNum = orderNum;
		this.orderPs = orderPs;
		this.orderTime = orderTime;
		this.orderHandleTime = orderHandleTime;
		this.orderStat = orderStat;
		this.orderKcom = orderKcom;
		this.orderKnum = orderKnum;
		this.todolists = todolists;
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

	public Goodsinfo getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

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

	public Date getOrderHandleTime() {
		return this.orderHandleTime;
	}

	public void setOrderHandleTime(Date orderHandleTime) {
		this.orderHandleTime = orderHandleTime;
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

	public Set getTodolists() {
		return this.todolists;
	}

	public void setTodolists(Set todolists) {
		this.todolists = todolists;
	}

}