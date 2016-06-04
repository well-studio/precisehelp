package cn.wellstudio.precisehelp.entity;

/**
 * Usersfavorite entity. @author MyEclipse Persistence Tools
 */

public class Usersfavorite implements java.io.Serializable {

	// Fields

	private Integer favoId;
	private Users users;
	private Goodsinfo goodsinfo;

	// Constructors

	/** default constructor */
	public Usersfavorite() {
	}

	/** full constructor */
	public Usersfavorite(Users users, Goodsinfo goodsinfo) {
		this.users = users;
		this.goodsinfo = goodsinfo;
	}

	// Property accessors

	public Integer getFavoId() {
		return this.favoId;
	}

	public void setFavoId(Integer favoId) {
		this.favoId = favoId;
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

}