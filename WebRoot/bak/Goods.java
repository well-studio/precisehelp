package cn.wellstudio.precisehelp.entity;

import java.util.List;

/**
 * 商品实体
 * @author huhong
 *
 */
public class Goods {
	
	int goods_id; // 商品id
	String goods_name; // 商品名称
	String goods_stat; // 商品描述
	String goods_last_price; // 商品上一次价格
	Double goods_now_price; // 商品现在的价格
	String goods_price_unit; // 单价对应的商品重量(数量)单位
	GoodsArea goodsarea; // 关联生产地
	GoodsType goodstype; // 关联商品类型
	List<Comments> commentsList; // 评论
	List<Order_Done> orderList; // 该商品的订单
	
	public Goods(){}

	

	public Goods(int goods_id, String goods_name, String goods_stat,
			String goods_last_price, Double goods_now_price,
			String goods_price_unit, GoodsArea goodsarea, GoodsType goodstype,
			List<Comments> commentsList, List<Order_Done> orderList) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_stat = goods_stat;
		this.goods_last_price = goods_last_price;
		this.goods_now_price = goods_now_price;
		this.goods_price_unit = goods_price_unit;
		this.goodsarea = goodsarea;
		this.goodstype = goodstype;
		this.commentsList = commentsList;
		this.orderList = orderList;
	}



	public int getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_stat() {
		return goods_stat;
	}

	public void setGoods_stat(String goods_stat) {
		this.goods_stat = goods_stat;
	}

	public String getGoods_last_price() {
		return goods_last_price;
	}

	public void setGoods_last_price(String goods_last_price) {
		this.goods_last_price = goods_last_price;
	}

	public Double getGoods_now_price() {
		return goods_now_price;
	}

	public void setGoods_now_price(Double goods_now_price) {
		this.goods_now_price = goods_now_price;
	}

	public String getGoods_price_unit() {
		return goods_price_unit;
	}

	public void setGoods_price_unit(String goods_price_unit) {
		this.goods_price_unit = goods_price_unit;
	}

	public GoodsArea getGoodsarea() {
		return goodsarea;
	}

	public void setGoodsarea(GoodsArea goodsarea) {
		this.goodsarea = goodsarea;
	}

	public GoodsType getGoodstype() {
		return goodstype;
	}

	public void setGoodstype(GoodsType goodstype) {
		this.goodstype = goodstype;
	}



	public List<Comments> getCommentsList() {
		return commentsList;
	}



	public void setCommentsList(List<Comments> commentsList) {
		this.commentsList = commentsList;
	}



	public List<Order_Done> getOrderList() {
		return orderList;
	}



	public void setOrderList(List<Order_Done> orderList) {
		this.orderList = orderList;
	}



	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", goods_name=" + goods_name
				+ ", goods_stat=" + goods_stat + ", goods_last_price="
				+ goods_last_price + ", goods_now_price=" + goods_now_price
				+ ", goods_price_unit=" + goods_price_unit + ", goodsarea="
				+ goodsarea + ", goodstype=" + goodstype + ", commentsList="
				+ commentsList + ", orderList=" + orderList + "]";
	}

	
	
	
	
	
}
