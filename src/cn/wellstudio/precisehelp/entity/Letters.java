package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * 站内信实体
 * @author huhong
 *
 */
public class Letters implements java.io.Serializable {

	// Fields

	private Integer letId; // 信id
	private Users usersByLetFrom; // 信来自哪
	private Users usersByLetTo; // 信去哪
	private String letTitle; // 信标题
	private String letContent; // 信内容
	private Date letTime; // 信时间
	private Integer letStat; // 信的状态(0 未看 1已看)
	private Integer letSys; // 是否是系统消息(0 不是 1 是)
	// Constructors

	/** default constructor */
	public Letters() {
	}

	/** full constructor */
	public Letters(Users usersByLetFrom, Users usersByLetTo, String letTitle,
			String letContent, Date letTime, Integer letStat) {
		this.usersByLetFrom = usersByLetFrom;
		this.usersByLetTo = usersByLetTo;
		this.letTitle = letTitle;
		this.letContent = letContent;
		this.letTime = letTime;
		this.letStat = letStat;
	}

	// Property accessors

	public Integer getLetId() {
		return this.letId;
	}

	public void setLetId(Integer letId) {
		this.letId = letId;
	}

	public Users getUsersByLetFrom() {
		return this.usersByLetFrom;
	}

	public void setUsersByLetFrom(Users usersByLetFrom) {
		this.usersByLetFrom = usersByLetFrom;
	}

	public Users getUsersByLetTo() {
		return this.usersByLetTo;
	}

	public void setUsersByLetTo(Users usersByLetTo) {
		this.usersByLetTo = usersByLetTo;
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

	public Date getLetTime() {
		return this.letTime;
	}

	public void setLetTime(Date letTime) {
		this.letTime = letTime;
	}

	public Integer getLetStat() {
		return this.letStat;
	}

	public void setLetStat(Integer letStat) {
		this.letStat = letStat;
	}

	
	public Integer getLetSys() {
		return letSys;
	}

	public void setLetSys(Integer letSys) {
		this.letSys = letSys;
	}

	@Override
	public String toString() {
		return "Letters [letId=" + letId + ", letTitle=" + letTitle
				+ ", letContent=" + letContent + ", letTime=" + letTime
				+ ", letStat=" + letStat + ", letSys=" + letSys + "]";
	}

	
}