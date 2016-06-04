package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 购物券的种类实体
 * @author huhong
 *
 */
public class Couponstype implements java.io.Serializable {

	// Fields

	private Integer typeId; // id
	private String typeName; // 类型名称
	private String typeGoods; // 限定购买的商品种类
	private Integer typeCandis; // 能否用于折扣商品(1 能 0 不能)
	private Double typeRequire; // 门槛金额
	private Double typeValue; // 抵用金额
	private Double typePercent; // 抵用折扣率
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