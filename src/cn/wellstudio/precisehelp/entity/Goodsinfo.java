package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Goodsinfo entity. @author MyEclipse Persistence Tools
 */

public class Goodsinfo implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private Goodstype goodstype;
	private Goodsarea goodsarea;
	private String goodsName;
	private String goodsStat;
	private Double goodsLastPrice;
	private Double goodsNowPrice;
	private String goodsPriceUnit;
	private Set orderDoings = new HashSet(0);
	private Set commentses = new HashSet(0);
	private Set orderDones = new HashSet(0);
	private Set orderTodos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goodsinfo() {
	}

	/** full constructor */
	public Goodsinfo(Goodstype goodstype, Goodsarea goodsarea,
			String goodsName, String goodsStat, Double goodsLastPrice,
			Double goodsNowPrice, String goodsPriceUnit, Set orderDoings,
			Set commentses, Set orderDones, Set orderTodos) {
		this.goodstype = goodstype;
		this.goodsarea = goodsarea;
		this.goodsName = goodsName;
		this.goodsStat = goodsStat;
		this.goodsLastPrice = goodsLastPrice;
		this.goodsNowPrice = goodsNowPrice;
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

}