package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;

/**
 * 完成订单实体
 * @author huhong
 *
 */
public class Order_Done {
		
	int orderdone_id; // 订单id
	String order_num; // 订单编号
	String order_ps; // 订单备注
	Timestamp order_time; // 订单下单时间
	String order_kcom; // 快递公司名称
	String order_knum; // 快递单号
	Timestamp order_donetime; // 订单完成时间(++++)  订单完成后  即可评价该商品
	int order_comment; // 是否评价(++++) 0 尚未评价 1 已评价
	User user;
	Goods goods;
	Admin admin;
	Express express;
	
	public Order_Done(){}

	public Order_Done(int orderdone_id, String order_num, String order_ps,
			Timestamp order_time, String order_kcom, String order_knum,
			Timestamp order_donetime, int order_comment, User user,
			Goods goods, Admin admin, Express express) {
		super();
		this.orderdone_id = orderdone_id;
		this.order_num = order_num;
		this.order_ps = order_ps;
		this.order_time = order_time;
		this.order_kcom = order_kcom;
		this.order_knum = order_knum;
		this.order_donetime = order_donetime;
		this.order_comment = order_comment;
		this.user = user;
		this.goods = goods;
		this.admin = admin;
		this.express = express;
	}

	public int getOrderdone_id() {
		return orderdone_id;
	}

	public void setOrderdone_id(int orderdone_id) {
		this.orderdone_id = orderdone_id;
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

	public Timestamp getOrder_donetime() {
		return order_donetime;
	}

	public void setOrder_donetime(Timestamp order_donetime) {
		this.order_donetime = order_donetime;
	}

	public int getOrder_comment() {
		return order_comment;
	}

	public void setOrder_comment(int order_comment) {
		this.order_comment = order_comment;
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

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Express getExpress() {
		return express;
	}

	public void setExpress(Express express) {
		this.express = express;
	}

	@Override
	public String toString() {
		return "Order_Done [orderdone_id=" + orderdone_id + ", order_num="
				+ order_num + ", order_ps=" + order_ps + ", order_time="
				+ order_time + ", order_kcom=" + order_kcom + ", order_knum="
				+ order_knum + ", order_donetime=" + order_donetime
				+ ", order_comment=" + order_comment + ", user=" + user
				+ ", goods=" + goods + ", admin=" + admin + ", express="
				+ express + "]";
	}
	
	
}
