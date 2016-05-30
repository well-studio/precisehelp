package cn.wellstudio.precisehelp.entity;

import java.util.List;

/**
 * 商品种类实体
 * @author huhong
 *
 */
public class GoodsType {
	String type_id;
	String type_name; // 商品类型名称
	String type_stat; // 商品类型描述
	List<Goods> goodsList;
	
	
	public GoodsType(){}


	public GoodsType(String type_id, String type_name, String type_stat,
			List<Goods> goodsList) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
		this.type_stat = type_stat;
		this.goodsList = goodsList;
	}


	public String getType_id() {
		return type_id;
	}


	public void setType_id(String type_id) {
		this.type_id = type_id;
	}


	public String getType_name() {
		return type_name;
	}


	public void setType_name(String type_name) {
		this.type_name = type_name;
	}


	public String getType_stat() {
		return type_stat;
	}


	public void setType_stat(String type_stat) {
		this.type_stat = type_stat;
	}


	public List<Goods> getGoodsList() {
		return goodsList;
	}


	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}


	@Override
	public String toString() {
		return "GoodsType [type_id=" + type_id + ", type_name=" + type_name
				+ ", type_stat=" + type_stat + ", goodsList=" + goodsList + "]";
	}

	
	
	
}
