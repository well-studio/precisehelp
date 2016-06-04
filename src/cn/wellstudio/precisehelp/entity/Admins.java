package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Admins entity. @author MyEclipse Persistence Tools
 */

public class Admins implements java.io.Serializable {

	// Fields

	private String admId;
	private String admAccount;
	private Integer admPower;
	private String admPsw;
	private Set orderDoings = new HashSet(0);
	private Set adminsinfos = new HashSet(0);
	private Set todolists = new HashSet(0);
	private Set orderDones = new HashSet(0);

	// Constructors

	/** default constructor */
	public Admins() {
	}

	/** full constructor */
	public Admins(String admAccount, Integer admPower, String admPsw,
			Set orderDoings, Set adminsinfos, Set todolists, Set orderDones) {
		this.admAccount = admAccount;
		this.admPower = admPower;
		this.admPsw = admPsw;
		this.orderDoings = orderDoings;
		this.adminsinfos = adminsinfos;
		this.todolists = todolists;
		this.orderDones = orderDones;
	}

	// Property accessors

	public String getAdmId() {
		return this.admId;
	}

	public void setAdmId(String admId) {
		this.admId = admId;
	}

	public String getAdmAccount() {
		return this.admAccount;
	}

	public void setAdmAccount(String admAccount) {
		this.admAccount = admAccount;
	}

	public Integer getAdmPower() {
		return this.admPower;
	}

	public void setAdmPower(Integer admPower) {
		this.admPower = admPower;
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

	public Set getTodolists() {
		return this.todolists;
	}

	public void setTodolists(Set todolists) {
		this.todolists = todolists;
	}

	public Set getOrderDones() {
		return this.orderDones;
	}

	public void setOrderDones(Set orderDones) {
		this.orderDones = orderDones;
	}

}