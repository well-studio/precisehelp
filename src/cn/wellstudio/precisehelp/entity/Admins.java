package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 管理员实体
 * @author huhong
 *
 */
public class Admins implements java.io.Serializable {

	// Fields

	private Integer admId; // 用户id
	private String admAccount; // 管理员账号
	private String admPsw; // 管理员密码
	private Set orderDoings = new HashSet(0); // 正在处理的订单
	private Set adminsinfos = new HashSet(0); // 管理员资料
	private Set orderDones = new HashSet(0); // 管理员处理过的订单

	// Constructors

	/** default constructor */
	public Admins() {
	}

	/** full constructor */
	public Admins(String admAccount, String admPsw, Set orderDoings,
			Set adminsinfos, Set orderDones) {
		this.admAccount = admAccount;
		this.admPsw = admPsw;
		this.orderDoings = orderDoings;
		this.adminsinfos = adminsinfos;
		this.orderDones = orderDones;
	}

	// Property accessors

	public Integer getAdmId() {
		return this.admId;
	}

	public void setAdmId(Integer admId) {
		this.admId = admId;
	}

	public String getAdmAccount() {
		return this.admAccount;
	}

	public void setAdmAccount(String admAccount) {
		this.admAccount = admAccount;
	}

	public String getAdmPsw() {
		return this.admPsw;
	}

	public void setAdmPsw(String admPsw) {
		this.admPsw = admPsw;
	}

	public Set getOrderDoings() {
		return this.orderDoings;
	}

	public void setOrderDoings(Set orderDoings) {
		this.orderDoings = orderDoings;
	}

	public Set getAdminsinfos() {
		return this.adminsinfos;
	}

	public void setAdminsinfos(Set adminsinfos) {
		this.adminsinfos = adminsinfos;
	}

	public Set getOrderDones() {
		return this.orderDones;
	}

	public void setOrderDones(Set orderDones) {
		this.orderDones = orderDones;
	}

}