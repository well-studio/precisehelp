package cn.wellstudio.precisehelp.entity;

/**
 * 用户个人资料实体
 * @author huhong
 *
 */
public class UserInfo {
	int usersinfo_id; // 用户资料id
	String user_img; // 用户头像
	String user_sex; // 用户性别
	String user_nickname; // 用户昵称
	String user_sign; // 用户个性签名
	String user_idnum; // 用户身份证号码
	String user_rname; // 用户真实姓名
	User user;
	
	public UserInfo(){}

	public UserInfo(int usersinfo_id, String user_img, String user_sex,
			String user_nickname, String user_sign, String user_idnum,
			String user_rname, User user) {
		super();
		this.usersinfo_id = usersinfo_id;
		this.user_img = user_img;
		this.user_sex = user_sex;
		this.user_nickname = user_nickname;
		this.user_sign = user_sign;
		this.user_idnum = user_idnum;
		this.user_rname = user_rname;
		this.user = user;
	}

	public int getUsersinfo_id() {
		return usersinfo_id;
	}

	public void setUsersinfo_id(int usersinfo_id) {
		this.usersinfo_id = usersinfo_id;
	}

	public String getUser_img() {
		return user_img;
	}

	public void setUser_img(String user_img) {
		this.user_img = user_img;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public String getUser_sign() {
		return user_sign;
	}

	public void setUser_sign(String user_sign) {
		this.user_sign = user_sign;
	}

	public String getUser_idnum() {
		return user_idnum;
	}

	public void setUser_idnum(String user_idnum) {
		this.user_idnum = user_idnum;
	}

	public String getUser_rname() {
		return user_rname;
	}

	public void setUser_rname(String user_rname) {
		this.user_rname = user_rname;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserInfo [usersinfo_id=" + usersinfo_id + ", user_img="
				+ user_img + ", user_sex=" + user_sex + ", user_nickname="
				+ user_nickname + ", user_sign=" + user_sign + ", user_idnum="
				+ user_idnum + ", user_rname=" + user_rname + ", user=" + user
				+ "]";
	}
	
	
}
