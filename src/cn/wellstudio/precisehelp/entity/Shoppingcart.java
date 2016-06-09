package cn.wellstudio.precisehelp.entity;

/**
 * 购物车实体
 * @author huhong
 *
 */
public class Shoppingcart implements java.io.Serializable {

	// Fields

	private ShoppingcartId id; // id
	
	private Integer goodsNum; // 商品数量
	//+++
//	private Goodsinfo goodsinfo; // 关联商品
//	private Users users; // 关联用户

	// Constructors

	/** default constructor */
	public Shoppingcart() {
	}

	/** minimal constructor */
//	public Shoppingcart(ShoppingcartId id) {
//		this.id = id;
//	}

	/** full constructor */
//	public Shoppingcart(ShoppingcartId id, Integer goodsNum) {
//		this.id = id;
//		this.goodsNum = goodsNum;
//	}

	// Property accessors

	public ShoppingcartId getId() {
		return this.id;
	}

	public void setId(ShoppingcartId id) {
		this.id = id;
	}

	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	@Override
	public String toString() {
		return "Shoppingcart [id=" + id + ", goodsNum=" + goodsNum + "]";
	}

	
	
	

}