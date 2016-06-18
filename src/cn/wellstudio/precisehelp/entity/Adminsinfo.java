package cn.wellstudio.precisehelp.entity;


/**
 * 管理员资料实体
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Adminsinfo  implements java.io.Serializable {


    // Fields    
 	private Integer adminfoId; // 资料id
 	private String admNum; // 管理员编号
 	private String admNickname; // 管理员昵称
 	private String admName; // 管理姓名
 	private String admPhone; // 管理员电话号码
 	private String admImg; // 头像
 	private String admIdnum; // 管理员身份证号码
    private String admId;
    private Admins admins; // 管理员
    // Constructors

    /** default constructor */
    public Adminsinfo() {
    }

    
    /** full constructor */
    public Adminsinfo(String admNum, String admNickname, String admImg, String admName, String admPhone, String admIdnum, String admId) {
        this.admNum = admNum;
        this.admNickname = admNickname;
        this.admImg = admImg;
        this.admName = admName;
        this.admPhone = admPhone;
        this.admIdnum = admIdnum;
        this.admId = admId;
    }

   
    // Property accessors

    public Integer getAdminfoId() {
        return this.adminfoId;
    }
    
    public void setAdminfoId(Integer adminfoId) {
        this.adminfoId = adminfoId;
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

    public String getAdmImg() {
        return this.admImg;
    }
    
    public void setAdmImg(String admImg) {
        this.admImg = admImg;
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

    public String getAdmId() {
        return this.admId;
    }
    
    public void setAdmId(String admId) {
        this.admId = admId;
    }


	public Admins getAdmins() {
		return admins;
	}


	public void setAdmins(Admins admins) {
		this.admins = admins;
	}


	@Override
	public String toString() {
		return "Adminsinfo [adminfoId=" + adminfoId + ", admNum=" + admNum
				+ ", admNickname=" + admNickname + ", admName=" + admName
				+ ", admPhone=" + admPhone + ", admImg=" + admImg
				+ ", admIdnum=" + admIdnum + ", admId=" + admId + "]";
	}
   
    

}