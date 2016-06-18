package cn.wellstudio.precisehelp.entity;

/**
 * 收藏夹id
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class UsersfavoriteId implements java.io.Serializable {

	// Fields

	private String userId;
	private String goodsId;
	private Users user;
	private Goodsinfo goods;

	// Constructors

	/** default constructor */
	public UsersfavoriteId() {
	}

	/** full constructor */
	public UsersfavoriteId(String userId, String goodsId) {
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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Goodsinfo getGoods() {
		return goods;
	}

	public void setGoods(Goodsinfo goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "UsersfavoriteId [userId=" + userId + ", goodsId=" + goodsId
				+ "]";
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UsersfavoriteId))
			return false;
		UsersfavoriteId castOther = (UsersfavoriteId) other;

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