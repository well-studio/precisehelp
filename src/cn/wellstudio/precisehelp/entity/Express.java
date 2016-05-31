package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 物流表
 * @author huhong
 *
 */
public class Express implements java.io.Serializable {

	// Fields

	private Integer expressId; // 物流id
	private String expressKcom; // 物流快递公司
	private String expressKnum; // 物流快递单号
	private String expressContent; // 物流具体内容
	private Set orderDoings = new HashSet(0); // 正在进行的订单
	private Set orderDones = new HashSet(0); // 处理完的订单

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