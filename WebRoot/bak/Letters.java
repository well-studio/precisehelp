package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;

/**
 * 站内信表实体
 * @author huhong
 *
 */
public class Letters {
	
	int let_id; // 信id
	String let_title; // 信标题
	String let_content; // 信内容
	Timestamp let_time; // 发信时间
	int let_stat; // 是否已读 (0 收信人未读  1 收信人已读)
	User user1; // 发信人 关联用户
	User user2; // 收信人 关联用户
	
	public Letters(){}

	public Letters(int let_id, String let_title, String let_content,
			Timestamp let_time, int let_stat, User user1, User user2) {
		super();
		this.let_id = let_id;
		this.let_title = let_title;
		this.let_content = let_content;
		this.let_time = let_time;
		this.let_stat = let_stat;
		this.user1 = user1;
		this.user2 = user2;
	}

	public int getLet_id() {
		return let_id;
	}

	public void setLet_id(int let_id) {
		this.let_id = let_id;
	}

	public String getLet_title() {
		return let_title;
	}

	public void setLet_title(String let_title) {
		this.let_title = let_title;
	}

	public String getLet_content() {
		return let_content;
	}

	public void setLet_content(String let_content) {
		this.let_content = let_content;
	}

	public Timestamp getLet_time() {
		return let_time;
	}

	public void setLet_time(Timestamp let_time) {
		this.let_time = let_time;
	}

	public int getLet_stat() {
		return let_stat;
	}

	public void setLet_stat(int let_stat) {
		this.let_stat = let_stat;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	@Override
	public String toString() {
		return "Letters [let_id=" + let_id + ", let_title=" + let_title
				+ ", let_content=" + let_content + ", let_time=" + let_time
				+ ", let_stat=" + let_stat + ", user1=" + user1 + ", user2="
				+ user2 + "]";
	}
	
	
}
