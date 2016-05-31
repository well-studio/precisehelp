package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 商品信息
 * @author huhong
 *
 */
public class Goodsinfo implements java.io.Serializable {

	// Fields

	private Integer goodsId; // 商品id
	private Goodstype goodstype; // 商品类型
	private Goodsarea goodsarea; // 商品产地
	private String goodsName; // 商品姓名
	private String goodsStat; // 商品描述
	private Double goodsLastPrice; // 订单上次的价格
	private Double goodsNowPrice; // 订单现在价格
	private Double goodsDiscount; // 商品折扣
	private String goodsPriceUnit; // 单位
	private Set orderDoings = new HashSet(0);
	private Set commentses = new HashSet(0);
	private Set orderDones = new HashSet(0);
	private Set orderTodos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goodsinfo() {
	}

	/** full constructor */
	public Goodsinfo(Integer goodsId, Goodstype goodstype, Goodsarea goodsarea,
			String goodsName, String goodsStat, Double goodsLastPrice,
			Double goodsNowPrice, Double goodsDiscount, String goodsPriceUnit,
			Set orderDoings, Set commentses, Set orderDones, Set orderTodos) {
		super();
		this.goodsId = goodsId;
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
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
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

	public Double getGoodsDiscount() {
		return goodsDiscount;
	}

	public void setGoodsDiscount(Double goodsDiscount) {
		this.goodsDiscount = goodsDiscount;
	}
	

}