package cn.wellstudio.precisehelp.entity;

/**
 * 评论实体
 * @author huhong
 *
 */
public class Comments {
	
	int com_id; // 评论id
	String com_content; // 评论内容
	Order_Done order_Done; // 关联订单
	User user; // 关联用户
	Goods goods; // 关联商品
	
	public Comments(){}

	public Comments(int com_id, String com_content, Order_Done order_Done,
			User user, Goods goods) {
		super();
		this.com_id = com_id;
		this.com_content = com_content;
		this.order_Done = order_Done;
		this.user = user;
		this.goods = goods;
	}

	public int getCom_id() {
		return com_id;
	}

	public void setCom_id(int com_id) {
		this.com_id = com_id;
	}

	public String getCom_content() {
		return com_content;
	}

	public void setCom_content(String com_content) {
		this.com_content = com_content;
	}

	public Order_Done getOrder_Done() {
		return order_Done;
	}

	public void setOrder_Done(Order_Done order_Done) {
		this.order_Done = order_Done;
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
		return "Comments [com_id=" + com_id + ", com_content=" + com_content
				+ ", order_Done=" + order_Done + ", user=" + user + ", goods="
				+ goods + "]";
	}
	
	
	
	
}
