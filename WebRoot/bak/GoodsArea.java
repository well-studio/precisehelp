package cn.wellstudio.precisehelp.entity;

import java.util.List;

/**
 * 商品产地实体
 * @author huhong
 *
 */
public class GoodsArea {
	int area_id;
	String area_name; // 产地名
	String area_location; // 产地地理位置
	String area_stat; // 产地描述
	List<Goods> goodsList;
	
	public GoodsArea(){}

	public GoodsArea(int area_id, String area_name, String area_location,
			String area_stat, List<Goods> goodsList) {
		super();
		this.area_id = area_id;
		this.area_name = area_name;
		this.area_location = area_location;
		this.area_stat = area_stat;
		this.goodsList = goodsList;
	}

	public int getArea_id() {
		return area_id;
	}

	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public String getArea_location() {
		return area_location;
	}

	public void setArea_location(String area_location) {
		this.area_location = area_location;
	}

	public String getArea_stat() {
		return area_stat;
	}

	public void setArea_stat(String area_stat) {
		this.area_stat = area_stat;
	}

	public List<Goods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}

	@Override
	public String toString() {
		return "GoodsArea [area_id=" + area_id + ", area_name=" + area_name
				+ ", area_location=" + area_location + ", area_stat="
				+ area_stat + ", goodsList=" + goodsList + "]";
	}

	
}
