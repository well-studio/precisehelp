package cn.wellstudio.precisehelp.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderDoing entity. @author MyEclipse Persistence Tools
 */

public class OrderDoing implements java.io.Serializable {

	// Fields

	private Integer orderdoingId;
	private Users users;
	private Express express;
	private Admins admins;
	private Goodsinfo goodsinfo;
	private String orderNum;
	private String orderPs;
	private Date orderTime;
	private Date orderHandleTime;
	private Integer orderStat;
	private String orderKcom;
	private String orderKnum;
	private Set todolists = new HashSet(0);

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