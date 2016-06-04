package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 商品种类
 * @author huhong
 *
 */
public class Goodstype implements java.io.Serializable {

	// Fields

	private Integer typeId; // id
	private String typeName; // 类型名称
	private String typeStat; // 类型描述
	private Set goodsinfos = new HashSet(0); // 关联商品信息

	// Constructors

	/** default constructor */
	public Goodstype() {
	}

	/** full constructor */
	public Goodstype(String typeName, String typeStat, Set goodsinfos) {
		this.typeName = typeName;
		this.typeStat = typeStat;
		this.goodsinfos = goodsinfos;
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

	public Set getGoodsinfos() {
		return this.goodsinfos;
	}

	public void setGoodsinfos(Set goodsinfos) {
		this.goodsinfos = goodsinfos;
	}

}