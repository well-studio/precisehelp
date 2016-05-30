package cn.wellstudio.precisehelp.entity;

/**
 * 管理员资料卡实体
 * @author huhong
 *
 */
public class AdminInfo {
	
	int adminfo_id; // 管理员资料id
	String adm_num; // 管理员员工编号
	String adm_nickname; // 管理员昵称
	String adm_name; // 管理员真实姓名
	String adm_phone; // 管理员电话号码
	String adm_idnum; // 管理员身份证号码
	Admin admin;
	
	public AdminInfo(){}

	public AdminInfo(int adminfo_id, String adm_num, String adm_nickname,
			String adm_name, String adm_phone, String adm_idnum, Admin admin) {
		super();
		this.adminfo_id = adminfo_id;
		this.adm_num = adm_num;
		this.adm_nickname = adm_nickname;
		this.adm_name = adm_name;
		this.adm_phone = adm_phone;
		this.adm_idnum = adm_idnum;
		this.admin = admin;
	}

	public int getAdminfo_id() {
		return adminfo_id;
	}

	public void setAdminfo_id(int adminfo_id) {
		this.adminfo_id = adminfo_id;
	}

	public String getAdm_num() {
		return adm_num;
	}

	public void setAdm_num(String adm_num) {
		this.adm_num = adm_num;
	}

	public String getAdm_nickname() {
		return adm_nickname;
	}

	public void setAdm_nickname(String adm_nickname) {
		this.adm_nickname = adm_nickname;
	}

	public String getAdm_name() {
		return adm_name;
	}

	public void setAdm_name(String adm_name) {
		this.adm_name = adm_name;
	}

	public String getAdm_phone() {
		return adm_phone;
	}

	public void setAdm_phone(String adm_phone) {
		this.adm_phone = adm_phone;
	}

	public String getAdm_idnum() {
		return adm_idnum;
	}

	public void setAdm_idnum(String adm_idnum) {
		this.adm_idnum = adm_idnum;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "AdminInfo [adminfo_id=" + adminfo_id + ", adm_num=" + adm_num
				+ ", adm_nickname=" + adm_nickname + ", adm_name=" + adm_name
				+ ", adm_phone=" + adm_phone + ", adm_idnum=" + adm_idnum
				+ ", admin=" + admin + "]";
	}
	
	
	
}
