package cn.wellstudio.precisehelp.entity;

/**
 * 用户 购物车 中间实体
 * @author huhong
 *
 */
public class ShoppingcartId implements java.io.Serializable {

	// Fields

	private Users users; // 关联用户
	private Goodsinfo goodsinfo; // 关联商品

	// Constructors

	/** default constructor */
	public ShoppingcartId() {
	}

	/** full constructor */
	public ShoppingcartId(Users users, Goodsinfo goodsinfo) {
		this.users = users;
		this.goodsinfo = goodsinfo;
	}

	// Property accessors

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShoppingcartId))
			return false;
		ShoppingcartId castOther = (ShoppingcartId) other;

		return ((this.getUsers() == castOther.getUsers()) || (this.getUsers() != null
				&& castOther.getUsers() != null && this.getUsers().equals(
				castOther.getUsers())))
				&& ((this.getGoodsinfo() == castOther.getGoodsinfo()) || (this
						.getGoodsinfo() != null
						&& castOther.getGoodsinfo() != null && this
						.getGoodsinfo().equals(castOther.getGoodsinfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUsers() == null ? 0 : this.getUsers().hashCode());
		result = 37 * result
				+ (getGoodsinfo() == null ? 0 : this.getGoodsinfo().hashCode());
		return result;
	}

}