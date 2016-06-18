package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;


/**
 * 购物券实体
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Coupons  implements java.io.Serializable {


    // Fields    
 	private String couId; // 购物券id
 	private String couNumber; // 购物券编号
 	private Timestamp couStartTime; // 购物券的开始时间
 	private Timestamp couEndTime; // 购物券的结束时间
 	private Timestamp couUseTime; // 购物券的使用时间
    private Integer couponstypeId;
    private String userId;
 	private Couponstype couponstype; // 购物券种类
 	private Users users; // 关联的用户
    // Constructors

    /** default constructor */
    public Coupons() {
    }
    
    

   
    public Coupons(String couId, String couNumber, Timestamp couStartTime,
			Timestamp couEndTime, Timestamp couUseTime, Integer couponstypeId,
			String userId) {
		super();
		this.couId = couId;
		this.couNumber = couNumber;
		this.couStartTime = couStartTime;
		this.couEndTime = couEndTime;
		this.couUseTime = couUseTime;
		this.couponstypeId = couponstypeId;
		this.userId = userId;
	}




	public String getCouId() {
		return couId;
	}




	public void setCouId(String couId) {
		this.couId = couId;
	}




	public String getCouNumber() {
		return couNumber;
	}




	public void setCouNumber(String couNumber) {
		this.couNumber = couNumber;
	}




	public Timestamp getCouStartTime() {
		return couStartTime;
	}




	public void setCouStartTime(Timestamp couStartTime) {
		this.couStartTime = couStartTime;
	}




	public Timestamp getCouEndTime() {
		return couEndTime;
	}




	public void setCouEndTime(Timestamp couEndTime) {
		this.couEndTime = couEndTime;
	}




	public Timestamp getCouUseTime() {
		return couUseTime;
	}




	public void setCouUseTime(Timestamp couUseTime) {
		this.couUseTime = couUseTime;
	}




	public Integer getCouponstypeId() {
		return couponstypeId;
	}




	public void setCouponstypeId(Integer couponstypeId) {
		this.couponstypeId = couponstypeId;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public Couponstype getCouponstype() {
		return couponstype;
	}




	public void setCouponstype(Couponstype couponstype) {
		this.couponstype = couponstype;
	}




	public Users getUsers() {
		return users;
	}




	public void setUsers(Users users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "Coupons [couId=" + couId + ", couNumber=" + couNumber
				+ ", couStartTime=" + couStartTime + ", couEndTime="
				+ couEndTime + ", couUseTime=" + couUseTime
				+ ", couponstypeId=" + couponstypeId + ", userId=" + userId
				+ "]";
	}


}