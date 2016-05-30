package cn.wellstudio.precisehelp.entity;

/**
 * Comments entity. @author MyEclipse Persistence Tools
 */

public class Comments implements java.io.Serializable {

	// Fields

	private Integer comId;
	private OrderDone orderDone;
	private Goodsinfo goodsinfo;
	private String comContent;

	// Constructors

	/** default constructor */
	public Comments() {
	}

	/** full constructor */
	public Comments(OrderDone orderDone, Goodsinfo goodsinfo, String comContent) {
		this.orderDone = orderDone;
		this.goodsinfo = goodsinfo;
		this.comContent = comContent;
	}

	// Property accessors

	public Integer getComId() {
		return this.comId;
	}

	public void setComId(Integer comId) {
		this.comId = comId;
	}

	public OrderDone getOrderDone() {
		return this.orderDone;
	}

	public void setOrderDone(OrderDone orderDone) {
		this.orderDone = orderDone;
	}

	public Goodsinfo getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public String getComContent() {
		return this.comContent;
	}

	public void setComContent(String comContent) {
		this.comContent = comContent;
	}

}