package cn.wellstudio.precisehelp.entity;

/**
 * Adminsinfo entity. @author MyEclipse Persistence Tools
 */

public class Adminsinfo implements java.io.Serializable {

	// Fields

	private Integer adminfoId;
	private Admins admins;
	private String admNum;
	private String admNickname;
	private String admName;
	private String admPhone;
	private String admIdnum;

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