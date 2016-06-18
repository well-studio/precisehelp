package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;

/**
 * 站内信实体
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Letters  implements java.io.Serializable {


    // Fields    
 	private Integer letId; // 信id
 	private String letTitle; // 信标题
 	private String letContent; // 信内容
 	private Timestamp letTime; // 信时间
 	private Integer letStat; // 信的状态(0 未看 1已看)
 	private Integer letSys; // 是否是系统消息(0 不是 1 是)
    private String letFrom;
    private Integer letDraft; // 草稿
    private String letTo;
 	private Users usersByLetFrom; // 信来自哪
 	private Users usersByLetTo; // 信去哪
 	
    
    public Letters(Integer letId, String letTitle, String letContent,
			Timestamp letTime, Integer letStat, Integer letSys, String letFrom,
			Integer letDraft, String letTo) {
		super();
		this.letId = letId;
		this.letTitle = letTitle;
		this.letContent = letContent;
		this.letTime = letTime;
		this.letStat = letStat;
		this.letSys = letSys;
		this.letFrom = letFrom;
		this.letDraft = letDraft;
		this.letTo = letTo;
	}







	// Constructors

    /** default constructor */
    public Letters() {
    }

    
    




    public String getLetTitle() {
        return this.letTitle;
    }
    
    public void setLetTitle(String letTitle) {
        this.letTitle = letTitle;
    }

    public String getLetContent() {
        return this.letContent;
    }
    
    public void setLetContent(String letContent) {
        this.letContent = letContent;
    }

    public Timestamp getLetTime() {
        return this.letTime;
    }
    
    public void setLetTime(Timestamp letTime) {
        this.letTime = letTime;
    }
    public Integer getLetStat() {
        return this.letStat;
    }
    
    public void setLetStat(Integer letStat) {
        this.letStat = letStat;
    }

    public Integer getLetSys() {
        return this.letSys;
    }
    
    public void setLetSys(Integer letSys) {
        this.letSys = letSys;
    }

    public String getLetFrom() {
        return this.letFrom;
    }
    
    public void setLetFrom(String letFrom) {
        this.letFrom = letFrom;
    }

    public String getLetTo() {
        return this.letTo;
    }
    
    public void setLetTo(String letTo) {
        this.letTo = letTo;
    }


	public Integer getLetId() {
		return letId;
	}


	public void setLetId(Integer letId) {
		this.letId = letId;
	}


	public Users getUsersByLetFrom() {
		return usersByLetFrom;
	}


	public void setUsersByLetFrom(Users usersByLetFrom) {
		this.usersByLetFrom = usersByLetFrom;
	}


	public Users getUsersByLetTo() {
		return usersByLetTo;
	}


	public void setUsersByLetTo(Users usersByLetTo) {
		this.usersByLetTo = usersByLetTo;
	}
	

	public Integer getLetDraft() {
		return letDraft;
	}

	public void setLetDraft(Integer letDraft) {
		this.letDraft = letDraft;
	}



	@Override
	public String toString() {
		return "Letters [letId=" + letId + ", letTitle=" + letTitle
				+ ", letContent=" + letContent + ", letTime=" + letTime
				+ ", letStat=" + letStat + ", letSys=" + letSys + ", letFrom="
				+ letFrom + ", letTo=" + letTo + "]";
	}
   

}