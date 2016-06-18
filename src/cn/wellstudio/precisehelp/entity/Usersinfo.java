package cn.wellstudio.precisehelp.entity;



/**
 * 用户资料
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Usersinfo  implements java.io.Serializable {


    // Fields    

     private Integer usersinfoId;
     private String userImg;
     private String userSex;
     private String userNickname;
     private String userSign;
     private String userPhone;
     private String userIdnum;
     private String userRname;
     private String userId;
     private Users user;


    // Constructors

    /** default constructor */
    public Usersinfo() {
    }

    
    /** full constructor */
    public Usersinfo(String userImg, String userSex, String userNickname, String userSign, String userPhone, String userIdnum, String userRname, String userId) {
        this.userImg = userImg;
        this.userSex = userSex;
        this.userNickname = userNickname;
        this.userSign = userSign;
        this.userPhone = userPhone;
        this.userIdnum = userIdnum;
        this.userRname = userRname;
        this.userId = userId;
    }

    
   
    // Property accessors

    public Usersinfo(String userId) {
		super();
		this.userId = userId;
	}


	public Integer getUsersinfoId() {
        return this.usersinfoId;
    }
    
    public void setUsersinfoId(Integer usersinfoId) {
        this.usersinfoId = usersinfoId;
    }

    public String getUserImg() {
        return this.userImg;
    }
    
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserSex() {
        return this.userSex;
    }
    
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserNickname() {
        return this.userNickname;
    }
    
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserSign() {
        return this.userSign;
    }
    
    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public String getUserPhone() {
        return this.userPhone;
    }
    
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserIdnum() {
        return this.userIdnum;
    }
    
    public void setUserIdnum(String userIdnum) {
        this.userIdnum = userIdnum;
    }

    public String getUserRname() {
        return this.userRname;
    }
    
    public void setUserRname(String userRname) {
        this.userRname = userRname;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
	public Users getUser() {
		return user;
	}


	public void setUser(Users user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Usersinfo [usersinfoId=" + usersinfoId + ", userImg=" + userImg
				+ ", userSex=" + userSex + ", userNickname=" + userNickname
				+ ", userSign=" + userSign + ", userPhone=" + userPhone
				+ ", userIdnum=" + userIdnum + ", userRname=" + userRname
				+ ", userId=" + userId + ", getUsersinfoId()="
				+ getUsersinfoId() + ", getUserImg()=" + getUserImg()
				+ ", getUserSex()=" + getUserSex() + ", getUserNickname()="
				+ getUserNickname() + ", getUserSign()=" + getUserSign()
				+ ", getUserPhone()=" + getUserPhone() + ", getUserIdnum()="
				+ getUserIdnum() + ", getUserRname()=" + getUserRname()
				+ ", getUserId()=" + getUserId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]\n";
	}
   



    




}