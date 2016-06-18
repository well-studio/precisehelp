package cn.wellstudio.precisehelp.entity;

/**
 * 用户 购物车 中间实体
 * 
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class ShoppingcartId implements java.io.Serializable {

	// Fields
	private String userId;
	private String goodsId;
	private Users users; // 关联用户
	private Goodsinfo goodsinfo; // 关联商品

	// Constructors

	/** default constructor */
	public ShoppingcartId() {
	}

	/** full constructor */
	public ShoppingcartId(String userId, String goodsId) {
		this.userId = userId;
		this.goodsId = goodsId;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Goodsinfo getGoodsinfo() {
		return goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	@Override
	public String toString() {
		return "ShoppingcartId [userId=" + userId + ", goodsId=" + goodsId
				+ "]";
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShoppingcartId))
			return false;
		ShoppingcartId castOther = (ShoppingcartId) other;

		return ((this.getUserId() == castOther.getUserId()) || (this
				.getUserId() != null && castOther.getUserId() != null && this
				.getUserId().equals(castOther.getUserId())))
				&& ((this.getGoodsId() == castOther.getGoodsId()) || (this
						.getGoodsId() != null && castOther.getGoodsId() != null && this
						.getGoodsId().equals(castOther.getGoodsId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result
				+ (getGoodsId() == null ? 0 : this.getGoodsId().hashCode());
		return result;
	}

}