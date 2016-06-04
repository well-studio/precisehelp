package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Goodsinfo entity. @author MyEclipse Persistence Tools
 */

public class Goodsinfo implements java.io.Serializable {

	// Fields

	private String goodsId;
	private Goodstype goodstype;
	private Goodsarea goodsarea;
	private String goodsName;
	private String goodsStat;
	private Double goodsLastPrice;
	private Double goodsNowPrice;
	private Double goodsDiscount;
	private String goodsPriceUnit;
	private Set goodsquestions = new HashSet(0);
	private Set orderDoings = new HashSet(0);
	private Set orderDones = new HashSet(0);
	private Set usersfavorites = new HashSet(0);
	private Set shoppingcarts = new HashSet(0);
	private Set orderTodos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goodsinfo() {
	}

	/** full constructor */
	public Goodsinfo(Goodstype goodstype, Goodsarea goodsarea,
			String goodsName, String goodsStat, Double goodsLastPrice,
			Double goodsNowPrice, Double goodsDiscount, String goodsPriceUnit,
			Set goodsquestions, Set orderDoings, Set orderDones,
			Set usersfavorites, Set shoppingcarts, Set orderTodos) {
		this.goodstype = goodstype;
		this.goodsarea = goodsarea;
		this.goodsName = goodsName;
		this.goodsStat = goodsStat;
		this.goodsLastPrice = goodsLastPrice;
		this.goodsNowPrice = goodsNowPrice;
		this.goodsDiscount = goodsDiscount;
		this.goodsPriceUnit = goodsPriceUnit;
		this.goodsquestions = goodsquestions;
		this.orderDoings = orderDoings;
		this.orderDones = orderDones;
		this.usersfavorites = usersfavorites;
		this.shoppingcarts = shoppingcarts;
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

	public Set getGoodsquestions() {
		return this.goodsquestions;
	}

	public void setGoodsquestions(Set goodsquestions) {
		this.goodsquestions = goodsquestions;
	}

	public Set getOrderDoings() {
		return this.orderDoings;
	}

	public void setOrderDoings(Set orderDoings) {
		this.orderDoings = orderDoings;
	}

	public Set getOrderDones() {
		return this.orderDones;
	}

	public void setOrderDones(Set orderDones) {
		this.orderDones = orderDones;
	}

	public Set getUsersfavorites() {
		return this.usersfavorites;
	}

	public void setUsersfavorites(Set usersfavorites) {
		this.usersfavorites = usersfavorites;
	}

	public Set getShoppingcarts() {
		return this.shoppingcarts;
	}

	public void setShoppingcarts(Set shoppingcarts) {
		this.shoppingcarts = shoppingcarts;
	}

	public Set getOrderTodos() {
		return this.orderTodos;
	}

	public void setOrderTodos(Set orderTodos) {
		this.orderTodos = orderTodos;
	}

}