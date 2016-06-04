package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * Letters entity. @author MyEclipse Persistence Tools
 */

public class Letters implements java.io.Serializable {

	// Fields

	private Integer letId;
	private Users usersByLetFrom;
	private Users usersByLetTo;
	private String letTitle;
	private String letContent;
	private Date letTime;
	private Integer letStat;
	private Integer letSys;

	// Constructors

	/** default constructor */
	public Letters() {
	}

	/** full constructor */
	public Letters(Users usersByLetFrom, Users usersByLetTo, String letTitle,
			String letContent, Date letTime, Integer letStat, Integer letSys) {
		this.usersByLetFrom = usersByLetFrom;
		this.usersByLetTo = usersByLetTo;
		this.letTitle = letTitle;
		this.letContent = letContent;
		this.letTime = letTime;
		this.letStat = letStat;
		this.letSys = letSys;
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
		return this.letSys;
	}

	public void setLetSys(Integer letSys) {
		this.letSys = letSys;
	}

}