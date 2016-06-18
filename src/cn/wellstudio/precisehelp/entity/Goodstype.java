package cn.wellstudio.precisehelp.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品类型实体
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Goodstype implements java.io.Serializable {

	// Fields

	private Integer typeId; // 类型id
	private String typeName; // 类型名称
	private String typeStat; // 类型描述
	private List<Goodsinfo> goodsinfos = new ArrayList<Goodsinfo>(); // 该商品类型对应的商品信息列表

	// Constructors

	/** default constructor */
	public Goodstype() {
	}

	

	public Goodstype(Integer typeId, String typeName, String typeStat) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.typeStat = typeStat;
	}



	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeStat() {
		return this.typeStat;
	}

	public void setTypeStat(String typeStat) {
		this.typeStat = typeStat;
	}

	

	public List<Goodsinfo> getGoodsinfos() {
		return goodsinfos;
	}

	public void setGoodsinfos(List<Goodsinfo> goodsinfos) {
		this.goodsinfos = goodsinfos;
	}



	@Override
	public String toString() {
		return "Goodstype [typeId=" + typeId + ", typeName=" + typeName
				+ ", typeStat=" + typeStat + "]";
	}

	
}