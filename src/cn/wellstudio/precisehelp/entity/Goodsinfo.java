package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 商品信息的增删改查
 * @author huhong
 *
 */
public class Goodsinfo implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private String goodsId; // 商品id
	private Goodstype goodstype; // 商品类型
	private Goodsarea goodsarea; // 商品产地
	private String goodsName; // 商品姓名
	private String goodsStat; // 商品描述
	private Double goodsLastPrice; // 商品上一次价格
	private Double goodsNowPrice; // 商品现在的价格
	private Double goodsDiscount; // 商品折扣率(默认为1)
	private String goodsPriceUnit; // 商品单位
	private Set orderDoings = new HashSet(0); // 该商品正在处理的订单
	private Set commentses = new HashSet(0); // 该商品对应的评论列表
	private Set orderDones = new HashSet(0); // 该商品已完成的订单
	private Set orderTodos = new HashSet(0); // 该商品待处理的订单
	// +++
	private Set goodsquestions = new HashSet(0); // 关联商品提问
	private Set usersfavorites = new HashSet(0); // 关联用户喜欢
	private Set shoppingcarts = new HashSet(0); // 关联购物车

	// Constructors

	/** default constructor */
	public Goodsinfo() {
	}

	public Goodsinfo(String goodsName, String goodsStat, Double goodsLastPrice,
			Double goodsNowPrice, Double goodsDiscount, String goodsPriceUnit) {
		super();
		this.goodsName = goodsName;
		this.goodsStat = goodsStat;
		this.goodsLastPrice = goodsLastPrice;
		this.goodsNowPrice = goodsNowPrice;
		this.goodsDiscount = goodsDiscount;
		this.goodsPriceUnit = goodsPriceUnit;
	}

	public Goodsinfo(String goodsId) {
		super();
		this.goodsId = goodsId;
	}

	/** full constructor */
	public Goodsinfo(Goodstype goodstype, Goodsarea goodsarea,
			String goodsName, String goodsStat, Double goodsLastPrice,
			Double goodsNowPrice, Double goodsDiscount, String goodsPriceUnit,
			Set orderDoings, Set commentses, Set orderDones, Set orderTodos) {
		this.goodstype = goodstype;
		this.goodsarea = goodsarea;
		this.goodsName = goodsName;
		this.goodsStat = goodsStat;
		this.goodsLastPrice = goodsLastPrice;
		this.goodsNowPrice = goodsNowPrice;
		this.goodsDiscount = goodsDiscount;
		this.goodsPriceUnit = goodsPriceUnit;
		this.orderDoings = orderDoings;
		this.commentses = commentses;
		this.orderDones = orderDones;
		this.orderTodos = orderTodos;
	}

	// Property accessors

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Goodstype getGoodstype() {
		return this.goodstype;
	}

	public void setGoodstype(Goodstype goodstype) {
		this.goodstype = goodstype;
	}

	public Goodsarea getGoodsarea() {
		return this.goodsarea;
	}

	public void setGoodsarea(Goodsarea goodsarea) {
		this.goodsarea = goodsarea;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsStat() {
		return this.goodsStat;
	}

	public void setGoodsStat(String goodsStat) {
		this.goodsStat = goodsStat;
	}

	public Double getGoodsLastPrice() {
		return this.goodsLastPrice;
	}

	public void setGoodsLastPrice(Double goodsLastPrice) {
		this.goodsLastPrice = goodsLastPrice;
	}

	public Double getGoodsNowPrice() {
		return this.goodsNowPrice;
	}

	public void setGoodsNowPrice(Double goodsNowPrice) {
		this.goodsNowPrice = goodsNowPrice;
	}

	public Double getGoodsDiscount() {
		return this.goodsDiscount;
	}

	public void setGoodsDiscount(Double goodsDiscount) {
		this.goodsDiscount = goodsDiscount;
	}

	public String getGoodsPriceUnit() {
		return this.goodsPriceUnit;
	}

	public void setGoodsPriceUnit(String goodsPriceUnit) {
		this.goodsPriceUnit = goodsPriceUnit;
	}

	public Set getOrderDoings() {
		return this.orderDoings;
	}

	public void setOrderDoings(Set orderDoings) {
		this.orderDoings = orderDoings;
	}

	public Set getCommentses() {
		return this.commentses;
	}

	public void setCommentses(Set commentses) {
		this.commentses = commentses;
	}

	public Set getOrderDones() {
		return this.orderDones;
	}

	public void setOrderDones(Set orderDones) {
		this.orderDones = orderDones;
	}

	public Set getOrderTodos() {
		return this.orderTodos;
	}

	public void setOrderTodos(Set orderTodos) {
		this.orderTodos = orderTodos;
	}

	public Set getGoodsquestions() {
		return goodsquestions;
	}

	public void setGoodsquestions(Set goodsquestions) {
		this.goodsquestions = goodsquestions;
	}

	public Set getUsersfavorites() {
		return usersfavorites;
	}

	public void setUsersfavorites(Set usersfavorites) {
		this.usersfavorites = usersfavorites;
	}

	public Set getShoppingcarts() {
		return shoppingcarts;
	}

	public void setShoppingcarts(Set shoppingcarts) {
		this.shoppingcarts = shoppingcarts;
	}

	@Override
	public String toString() {
		return "Goodsinfo [goodsId=" + goodsId + ", goodsName=" + goodsName
				+ ", goodsStat=" + goodsStat + ", goodsLastPrice="
				+ goodsLastPrice + ", goodsNowPrice=" + goodsNowPrice
				+ ", goodsDiscount=" + goodsDiscount + ", goodsPriceUnit="
				+ goodsPriceUnit + "]";
	}
}