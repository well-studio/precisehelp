package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Couponstype entity. @author MyEclipse Persistence Tools
 */

public class Couponstype implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String typeName;
	private String typeGoods;
	private Integer typeCandis;
	private Double typeRequire;
	private Double typeValue;
	private Double typePercent;
	private Set couponses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Couponstype() {
	}

	/** full constructor */
	public Couponstype(String typeName, String typeGoods, Integer typeCandis,
			Double typeRequire, Double typeValue, Double typePercent,
			Set couponses) {
		this.typeName = typeName;
		this.typeGoods = typeGoods;
		this.typeCandis = typeCandis;
		this.typeRequire = typeRequire;
		this.typeValue = typeValue;
		this.typePercent = typePercent;
		this.couponses = couponses;
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

	public String getTypeGoods() {
		return this.typeGoods;
	}

	public void setTypeGoods(String typeGoods) {
		this.typeGoods = typeGoods;
	}

	public Integer getTypeCandis() {
		return this.typeCandis;
	}

	public void setTypeCandis(Integer typeCandis) {
		this.typeCandis = typeCandis;
	}

	public Double getTypeRequire() {
		return this.typeRequire;
	}

	public void setTypeRequire(Double typeRequire) {
		this.typeRequire = typeRequire;
	}

	public Double getTypeValue() {
		return this.typeValue;
	}

	public void setTypeValue(Double typeValue) {
		this.typeValue = typeValue;
	}

	public Double getTypePercent() {
		return this.typePercent;
	}

	public void setTypePercent(Double typePercent) {
		this.typePercent = typePercent;
	}

	public Set getCouponses() {
		return this.couponses;
	}

	public void setCouponses(Set couponses) {
		this.couponses = couponses;
	}

}