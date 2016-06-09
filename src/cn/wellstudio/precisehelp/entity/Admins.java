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

	private String admId; // 用户id
	private String admAccount; // 管理员账号
	private Integer admPower; // 权限标记
	private String admPsw; // 管理员密码
	private Adminsinfo adminsinfo; // 管理员资料
	private Set orderDoings = new HashSet(0); // 正在处理的订单
	private Set todolists = new HashSet(0); // 该管理员正在处理的订单
	private Set orderDones = new HashSet(0); // 管理员处理过的订单

	// Constructors

	
	
	/** default constructor */
	public Admins() {
	}
	
	public Admins(Integer admId,String admPsw) {
		super();
		this.admPsw = admPsw;
	}

	//admId,admAccount,admPsw
	public Admins(String admId, String admAccount, String admPsw) {
		super();
		this.admId = admId;
		this.admAccount = admAccount;
		this.admPsw = admPsw;
	}
	//admAccount,admPsw
	public Admins(String admAccount, String admPsw) {
		super();
		this.admAccount = admAccount;
		this.admPsw = admPsw;
	}
	//admId
	public Admins(String admId) {
		super();
		this.admId = admId;
	}

	
	/** full constructor */
	public Admins(String admAccount, String admPsw, Set orderDoings,
			Adminsinfo adminsinfo, Set orderDones) {
		this.admAccount = admAccount;
		this.admPsw = admPsw;
		this.orderDoings = orderDoings;
		this.adminsinfo = adminsinfo;
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

//	public Set getAdminsinfos() {
//		return this.adminsinfos;
//	}
//
//	public void setAdminsinfos(Set adminsinfos) {
//		this.adminsinfos = adminsinfos;
//	}
	
	public Set getOrderDones() {
		return this.orderDones;
	}


	public Adminsinfo getAdminsinfo() {
		return adminsinfo;
	}

	public void setAdminsinfo(Adminsinfo adminsinfo) {
		this.adminsinfo = adminsinfo;
	}

	public void setOrderDones(Set orderDones) {
		this.orderDones = orderDones;
	}

	public Integer getAdmPower() {
		return admPower;
	}

	public void setAdmPower(Integer admPower) {
		this.admPower = admPower;
	}

	public Set getTodolists() {
		return todolists;
	}

	public void setTodolists(Set todolists) {
		this.todolists = todolists;
	}

	@Override
	public String toString() {
		return "Admins [admId=" + admId + ", admAccount=" + admAccount + "]";
	}
	
	

}