package cn.wellstudio.precisehelp.entity;

/**
 * Shoppingcart entity. @author MyEclipse Persistence Tools
 */

public class Shoppingcart implements java.io.Serializable {

	// Fields

	private ShoppingcartId id;
	private Users users;
	private Goodsinfo goodsinfo;
	private Integer goodsNum;

	// Constructors

	/** default constructor */
	public Shoppingcart() {
	}

	/** minimal constructor */
	public Shoppingcart(ShoppingcartId id, Users users, Goodsinfo goodsinfo) {
		this.id = id;
		this.users = users;
		this.goodsinfo = goodsinfo;
	}

	/** full constructor */
	public Shoppingcart(ShoppingcartId id, Users users, Goodsinfo goodsinfo,
			Integer goodsNum) {
		this.id = id;
		this.users = users;
		this.goodsinfo = goodsinfo;
		this.goodsNum = goodsNum;
	}

	// Property accessors

	public ShoppingcartId getId() {
		return this.id;
	}

	public void setId(ShoppingcartId id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Goodsinfo getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

}