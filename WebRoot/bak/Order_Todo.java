package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;


/**
 * 待处理订单实体(付款之后)
 * @author huhong
 *
 */
public class Order_Todo {
	int ordertodo_id; // 订单id
	String order_number; // 订单编号
	String order_ps; // 订单备注
	Timestamp order_time; // 订单下单时间
	User user;
	Goods goods;
	
	public Order_Todo(){}

	public Order_Todo(int ordertodo_id, String order_number, String order_ps,
			Timestamp order_time, User user, Goods goods) {
		super();
		this.ordertodo_id = ordertodo_id;
		this.order_number = order_number;
		this.order_ps = order_ps;
		this.order_time = order_time;
		this.user = user;
		this.goods = goods;
	}

	public int getOrdertodo_id() {
		return ordertodo_id;
	}

	public void setOrdertodo_id(int ordertodo_id) {
		this.ordertodo_id = ordertodo_id;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
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

	@Override
	public String toString() {
		return "Order_Todo [ordertodo_id=" + ordertodo_id + ", order_number="
				+ order_number + ", order_ps=" + order_ps + ", order_time="
				+ order_time + ", user=" + user + ", goods=" + goods + "]";
	}
	
	
	
	
	
}
