package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * 购物券实体
 * @author huhong
 *
 */
public class Coupons implements java.io.Serializable {

	// Fields

	private String couId; // 购物券id
	private Couponstype couponstype; // 购物券种类
	private Users users; // 关联的用户
	private String couNumber; // 购物券编号
	private Date couStartTime; // 购物券的开始时间
	private Date couEndTime; // 购物券的结束时间
	private Date couUseTime; // 购物券的使用时间

	// Constructors

	/** default constructor */
	public Coupons() {
	}

	/** full constructor */
	public Coupons(Couponstype couponstype, Users users, String couNumber,
			Date couStartTime, Date couEndTime, Date couUseTime) {
		this.couponstype = couponstype;
		this.users = users;
		this.couNumber = couNumber;
		this.couStartTime = couStartTime;
		this.couEndTime = couEndTime;
		this.couUseTime = couUseTime;
	}

	// Property accessors

	public String getCouId() {
		return this.couId;
	}

	public void setCouId(String couId) {
		this.couId = couId;
	}

	public Couponstype getCouponstype() {
		return this.couponstype;
	}

	public void setCouponstype(Couponstype couponstype) {
		this.couponstype = couponstype;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getCouNumber() {
		return this.couNumber;
	}

	public void setCouNumber(String couNumber) {
		this.couNumber = couNumber;
	}

	public Date getCouStartTime() {
		return this.couStartTime;
	}

	public void setCouStartTime(Date couStartTime) {
		this.couStartTime = couStartTime;
	}

	public Date getCouEndTime() {
		return this.couEndTime;
	}

	public void setCouEndTime(Date couEndTime) {
		this.couEndTime = couEndTime;
	}

	public Date getCouUseTime() {
		return this.couUseTime;
	}

	public void setCouUseTime(Date couUseTime) {
		this.couUseTime = couUseTime;
	}

}