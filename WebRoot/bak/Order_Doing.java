package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;

/**
 * 处理中订单实体(包括快递派送)
 * @author huhong
 *
 */
public class Order_Doing {
	
	int orderdoing_id; // 订单id
	String order_num; // 订单编号
	String order_ps; // 订单备注
	Timestamp order_time; // 订单下单时间
	int order_stat; // 订单受理状态(0 无人受理 1正在受理 2受理完毕 起初默认为0)(++++)
	String order_kcom; // 快递公司名称(+++)
	String order_knum; // 快递单号(+++)
	User user;
	Goods goods;
	Express express;
	Admin admin;
	
	
	public Order_Doing(){}


	public Order_Doing(int orderdoing_id, String order_num, String order_ps,
			Timestamp order_time, int order_stat, String order_kcom,
			String order_knum, User user, Goods goods, Express express,
			Admin admin) {
		super();
		this.orderdoing_id = orderdoing_id;
		this.order_num = order_num;
		this.order_ps = order_ps;
		this.order_time = order_time;
		this.order_stat = order_stat;
		this.order_kcom = order_kcom;
		this.order_knum = order_knum;
		this.user = user;
		this.goods = goods;
		this.express = express;
		this.admin = admin;
	}


	public int getOrderdoing_id() {
		return orderdoing_id;
	}


	public void setOrderdoing_id(int orderdoing_id) {
		this.orderdoing_id = orderdoing_id;
	}


	public String getOrder_num() {
		return order_num;
	}


	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}


	public String getOrder_ps() {
		return order_ps;
	}


	public void setOrder_ps(String order_ps) {
		this.order_ps = order_ps;
	}


	public Timestamp getOrder_time() {
		return order_time;
	}


	public void setOrder_time(Timestamp order_time) {
		this.order_time = order_time;
	}


	public int getOrder_stat() {
		return order_stat;
	}


	public void setOrder_stat(int order_stat) {
		this.order_stat = order_stat;
	}


	public String getOrder_kcom() {
		return order_kcom;
	}


	public void setOrder_kcom(String order_kcom) {
		this.order_kcom = order_kcom;
	}


	public String getOrder_knum() {
		return order_knum;
	}


	public void setOrder_knum(String order_knum) {
		this.order_knum = order_knum;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Goods getGoods() {
		return goods;
	}


	public void setGoods(Goods goods) {
		this.goods = goods;
	}


	public Express getExpress() {
		return express;
	}


	public void setExpress(Express express) {
		this.express = express;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Order_Doing [orderdoing_id=" + orderdoing_id + ", order_num="
				+ order_num + ", order_ps=" + order_ps + ", order_time="
				+ order_time + ", order_stat=" + order_stat + ", order_kcom="
				+ order_kcom + ", order_knum=" + order_knum + ", user=" + user
				+ ", goods=" + goods + ", express=" + express + ", admin="
				+ admin + "]";
	}
	
	
	
}
