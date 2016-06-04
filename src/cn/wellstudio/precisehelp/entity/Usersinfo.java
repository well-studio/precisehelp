package cn.wellstudio.precisehelp.entity;

/**
 * 用户资料实体
 * @author huhong
 *
 */
public class Usersinfo implements java.io.Serializable {

	// Fields

	private Integer usersinfoId; // id
	private Users users; // 关联用户
	private String userImg; // 用户头像
	private String userSex; // 用户性别
	private String userNickname; // 用户昵称
	private String userSign; // 用户个性签名
	private String userPhone; // 用户电话号码
	private String userIdnum; // 用户身份证号码
	private String userRname; // 用户真实姓名

	// Constructors

	/** default constructor */
	public Usersinfo() {
	}

	/** full constructor */
	public Usersinfo(Users users, String userImg, String userSex,
			String userNickname, String userSign, String userPhone,
			String userIdnum, String userRname) {
		this.users = users;
		this.userImg = userImg;
		this.userSex = userSex;
		this.userNickname = userNickname;
		this.userSign = userSign;
		this.userPhone = userPhone;
		this.userIdnum = userIdnum;
		this.userRname = userRname;
	}

	// Property accessors

	public Integer getUsersinfoId() {
		return this.usersinfoId;
	}

	public void setUsersinfoId(Integer usersinfoId) {
		this.usersinfoId = usersinfoId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
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

}