package cn.wellstudio.precisehelp.entity;
/** 
 * 商品信息以及数量实体类
 * @author xxmodd 
 */
public class OrderContent {
	private Goodsinfo goodsinfo;//商品信息
	private Integer goodsnum;//商品数量
	
	
	public OrderContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goodsinfo getGoodsinfo() {
		return goodsinfo;
	}
	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}
	public Integer getGoodsnum() {
		return goodsnum;
	}
	public void setGoodsnum(Integer goodsnum) {
		this.goodsnum = goodsnum;
	}
	@Override
	public String toString() {
		return "OrderContent [goodsinfo=" + goodsinfo + ", goodsnum="
				+ goodsnum + "]";
	}
	
	
	
}
