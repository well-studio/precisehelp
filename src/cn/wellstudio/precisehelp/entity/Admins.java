package cn.wellstudio.precisehelp.entity;

import java.util.ArrayList;
import java.util.List;


/**
 * 管理员实体
 * @author huhong
 *
 */
public class Admins  implements java.io.Serializable {


    // Fields    
 	private String admId; // 用户id
 	private String admAccount; // 管理员账号
 	private Integer admPower; // 权限标记
 	private String admPsw; // 管理员密码
 	private Adminsinfo adminsinfo; // 管理员资料
 	private List<OrderDoing> orderDoings = new ArrayList<OrderDoing>(); // 正在处理的订单
 	private List<Todolist> todolists = new ArrayList<Todolist>(0); // 该管理员正在处理的订单
 	private List<OrderDone> orderDones = new ArrayList<OrderDone>(); // 管理员处理过的订单

    // Constructors

    /** default constructor */
    public Admins() {
    }

    
    /** full constructor */
    public Admins(String admAccount, Integer admPower, String admPsw) {
        this.admAccount = admAccount;
        this.admPower = admPower;
        this.admPsw = admPsw;
    }

   
    // Property accessors

    public String getAdmId() {
        return this.admId;
    }
    
    public void setAdmId(String admId) {
        this.admId = admId;
    }

    public String getAdmAccount() {
        return this.admAccount;
    }
    
    public void setAdmAccount(String admAccount) {
        this.admAccount = admAccount;
    }

    public Integer getAdmPower() {
        return this.admPower;
    }
    
    public void setAdmPower(Integer admPower) {
        this.admPower = admPower;
    }

    public String getAdmPsw() {
        return this.admPsw;
    }
    
    public void setAdmPsw(String admPsw) {
        this.admPsw = admPsw;
    }


	public Adminsinfo getAdminsinfo() {
		return adminsinfo;
	}


	public void setAdminsinfo(Adminsinfo adminsinfo) {
		this.adminsinfo = adminsinfo;
	}


	public List<OrderDoing> getOrderDoings() {
		return orderDoings;
	}


	public void setOrderDoings(List<OrderDoing> orderDoings) {
		this.orderDoings = orderDoings;
	}


	public List<Todolist> getTodolists() {
		return todolists;
	}


	public void setTodolists(List<Todolist> todolists) {
		this.todolists = todolists;
	}


	public List<OrderDone> getOrderDones() {
		return orderDones;
	}


	public void setOrderDones(List<OrderDone> orderDones) {
		this.orderDones = orderDones;
	}


	@Override
	public String toString() {
		return "Admins [admId=" + admId + ", admAccount=" + admAccount
				+ ", admPower=" + admPower + ", admPsw=" + admPsw + "]";
	}
    

}