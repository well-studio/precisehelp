package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 物流实体
 * @author huhong
 *
 */
public class Express implements java.io.Serializable {

	// Fields

	private Integer expressId; // id
	private String expressKcom; // 快递公司名称
	private String expressKnum; // 快递单号
	private String expressContent; // 快递物流信息
	private Set orderDoings = new HashSet(0); // 1:1 正在处理中的订单
	private Set orderDones = new HashSet(0); // 1:1 处理完的订单

	// Constructors

	/** default constructor */
	public Express() {
	}

	/** full constructor */
	public Express(String expressKcom, String expressKnum,
			String expressContent, Set orderDoings, Set orderDones) {
		this.expressKcom = expressKcom;
		this.expressKnum = expressKnum;
		this.expressContent = expressContent;
		this.orderDoings = orderDoings;
		this.orderDones = orderDones;
	}

	// Property accessors

	public Integer getExpressId() {
		return this.expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	public String getExpressKcom() {
		return this.expressKcom;
	}

	public void setExpressKcom(String expressKcom) {
		this.expressKcom = expressKcom;
	}

	public String getExpressKnum() {
		return this.expressKnum;
	}

	public void setExpressKnum(String expressKnum) {
		this.expressKnum = expressKnum;
	}

	public String getExpressContent() {
		return this.expressContent;
	}

	public void setExpressContent(String expressContent) {
		this.expressContent = expressContent;
	}

	public Set getOrderDoings() {
		return this.orderDoings;
	}

	public void setOrderDoings(Set orderDoings) {
		this.orderDoings = orderDoings;
	}

	public Set getOrderDones() {
		return this.orderDones;
	}

	public void setOrderDones(Set orderDones) {
		this.orderDones = orderDones;
	}

}