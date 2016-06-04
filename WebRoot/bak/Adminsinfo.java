package cn.wellstudio.precisehelp.entity;

/**
 * 管理员信息
 * @author huhong
 *
 */
public class Adminsinfo implements java.io.Serializable {

	// Fields

	private Integer adminfoId; // id
	private Admins admins; // 关联管理员
	private String admNum; // 管理员编号
	private String admNickname; // 管理员昵称
	private String admName; // 管理员名称
	private String admPhone; // 管理员电话号码
	private String admIdnum; // 管理员身份证号码

	// Constructors

	/** default constructor */
	public Adminsinfo() {
	}

	/** full constructor */
	public Adminsinfo(Admins admins, String admNum, String admNickname,
			String admName, String admPhone, String admIdnum) {
		this.admins = admins;
		this.admNum = admNum;
		this.admNickname = admNickname;
		this.admName = admName;
		this.admPhone = admPhone;
		this.admIdnum = admIdnum;
	}

	// Property accessors

	public Integer getAdminfoId() {
		return this.adminfoId;
	}

	public void setAdminfoId(Integer adminfoId) {
		this.adminfoId = adminfoId;
	}

	public Admins getAdmins() {
		return this.admins;
	}

	public void setAdmins(Admins admins) {
		this.admins = admins;
	}

	public String getAdmNum() {
		return this.admNum;
	}

	public void setAdmNum(String admNum) {
		this.admNum = admNum;
	}

	public String getAdmNickname() {
		return this.admNickname;
	}

	public void setAdmNickname(String admNickname) {
		this.admNickname = admNickname;
	}

	public String getAdmName() {
		return this.admName;
	}

	public void setAdmName(String admName) {
		this.admName = admName;
	}

	public String getAdmPhone() {
		return this.admPhone;
	}

	public void setAdmPhone(String admPhone) {
		this.admPhone = admPhone;
	}

	public String getAdmIdnum() {
		return this.admIdnum;
	}

	public void setAdmIdnum(String admIdnum) {
		this.admIdnum = admIdnum;
	}

}