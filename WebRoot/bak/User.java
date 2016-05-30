package cn.wellstudio.precisehelp.entity;

import java.util.List;

/**
 * 用户实体
 * @author huhong
 *
 */
public class User {
	
	int user_id; // 用户id
	String user_account; // 用户账号
	String user_psw; // 用户登录密码
	String user_zf_psw; // 用户支付密码
	UserInfo userinfo; // 用户个人资料
	List<ToAddress> toAddressList;
	List<Letters> letterList;
	List<Order_Todo> orderToDoList;
	List<Order_Doing> orderDoingList;
	List<Order_Done> orderDoneList;
	List<Comments> commentsList;
	
	public User(){}

	public User(int user_id, String user_account, String user_psw,
			String user_zf_psw, UserInfo userinfo,
			List<ToAddress> toAddressList, List<Letters> letterList,
			List<Order_Todo> orderToDoList, List<Order_Doing> orderDoingList,
			List<Order_Done> orderDoneList, List<Comments> commentsList) {
		super();
		this.user_id = user_id;
		this.user_account = user_account;
		this.user_psw = user_psw;
		this.user_zf_psw = user_zf_psw;
		this.userinfo = userinfo;
		this.toAddressList = toAddressList;
		this.letterList = letterList;
		this.orderToDoList = orderToDoList;
		this.orderDoingList = orderDoingList;
		this.orderDoneList = orderDoneList;
		this.commentsList = commentsList;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getUser_psw() {
		return user_psw;
	}

	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}

	public String getUser_zf_psw() {
		return user_zf_psw;
	}

	public void setUser_zf_psw(String user_zf_psw) {
		this.user_zf_psw = user_zf_psw;
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	public List<ToAddress> getToAddressList() {
		return toAddressList;
	}

	public void setToAddressList(List<ToAddress> toAddressList) {
		this.toAddressList = toAddressList;
	}

	public List<Letters> getLetterList() {
		return letterList;
	}

	public void setLetterList(List<Letters> letterList) {
		this.letterList = letterList;
	}

	public List<Order_Todo> getOrderToDoList() {
		return orderToDoList;
	}

	public void setOrderToDoList(List<Order_Todo> orderToDoList) {
		this.orderToDoList = orderToDoList;
	}

	public List<Order_Doing> getOrderDoingList() {
		return orderDoingList;
	}

	public void setOrderDoingList(List<Order_Doing> orderDoingList) {
		this.orderDoingList = orderDoingList;
	}

	public List<Order_Done> getOrderDoneList() {
		return orderDoneList;
	}

	public void setOrderDoneList(List<Order_Done> orderDoneList) {
		this.orderDoneList = orderDoneList;
	}

	public List<Comments> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comments> commentsList) {
		this.commentsList = commentsList;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_account=" + user_account
				+ ", user_psw=" + user_psw + ", user_zf_psw=" + user_zf_psw
				+ ", userinfo=" + userinfo + ", toAddressList=" + toAddressList
				+ ", letterList=" + letterList + ", orderToDoList="
				+ orderToDoList + ", orderDoingList=" + orderDoingList
				+ ", orderDoneList=" + orderDoneList + ", commentsList="
				+ commentsList + "]";
	}
	
	
	
	
	
	
}
