package cn.wellstudio.precisehelp.entity;

import java.util.List;

/**
 * 管理员实体
 * @author huhong
 *
 */
public class Admin {
	
	
	int adm_id; // 管理员id
	String adm_account; // 账号
	String adm_psw; // 密码
	List<Order_Doing> order_DoingList;
	List<Order_Done> order_DoneList;
	
	
	public Admin(){}

	

	public Admin(int adm_id, String adm_account, String adm_psw,
			List<Order_Doing> order_DoingList, List<Order_Done> order_DoneList) {
		super();
		this.adm_id = adm_id;
		this.adm_account = adm_account;
		this.adm_psw = adm_psw;
		this.order_DoingList = order_DoingList;
		this.order_DoneList = order_DoneList;
	}



	public int getAdm_id() {
		return adm_id;
	}

	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}

	public String getAdm_account() {
		return adm_account;
	}

	public void setAdm_account(String adm_account) {
		this.adm_account = adm_account;
	}

	public String getAdm_psw() {
		return adm_psw;
	}

	public void setAdm_psw(String adm_psw) {
		this.adm_psw = adm_psw;
	}
	
	

	public List<Order_Doing> getOrder_DoingList() {
		return order_DoingList;
	}
	public void setOrder_DoingList(List<Order_Doing> order_DoingList) {
		this.order_DoingList = order_DoingList;
	}



	public List<Order_Done> getOrder_DoneList() {
		return order_DoneList;
	}
	public void setOrder_DoneList(List<Order_Done> order_DoneList) {
		this.order_DoneList = order_DoneList;
	}



	@Override
	public String toString() {
		return "Admin [adm_id=" + adm_id + ", adm_account=" + adm_account
				+ ", adm_psw=" + adm_psw + ", order_DoingList="
				+ order_DoingList + ", order_DoneList=" + order_DoneList + "]";
	}
	
	
	
	
}
