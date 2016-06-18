package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;


/**
 * 正在进行的订单 管理员处理中
 * 
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class OrderDoing  implements java.io.Serializable {


    // Fields    
 	private Integer orderdoingId; // 正在进行的订单id
 	// private Goodsinfo goodsinfo; // 关联的商品类型 old
 	private String orderContent;//商品号以及商品数量
 	private String orderNum; // 订单编号
 	private String orderPs; // 订单注释
 	private Timestamp orderTime; // 订单下单时间
 	private Timestamp orderHandleTime; // 订单开始处理时间+++
 	private Integer orderStat; // 订单受理状态(0 无人受理 1正在受理 2受理完毕 起初默认为0)
 	private String orderKcom; // 订单快递公司
 	private String orderKnum; // 订单快递订单
    private Integer addressId;
    private String userId;
    private String admId;
    private Integer expressId;
    private Toaddress toaddress; // 1:1 关联收货地址
    private Todolist todolist; // 1:1 管理员处理list
 	private Users users; // 关联的用户
 	private Express express; // 关联的物流信息
 	private Admins admins; // 处理订单的管理员
 	
    // Constructors

    /** default constructor */
    public OrderDoing() {
    }

    
    /** full constructor */
    public OrderDoing(String orderNum, String orderPs, Timestamp orderTime, Integer addressId, Timestamp orderHandleTime, Integer orderStat, String orderKcom, String orderKnum, String userId, String admId, String orderContent, Integer expressId) {
        this.orderNum = orderNum;
        this.orderPs = orderPs;
        this.orderTime = orderTime;
        this.addressId = addressId;
        this.orderHandleTime = orderHandleTime;
        this.orderStat = orderStat;
        this.orderKcom = orderKcom;
        this.orderKnum = orderKnum;
        this.userId = userId;
        this.admId = admId;
        this.orderContent = orderContent;
        this.expressId = expressId;
    }

   
    // Property accessors

    public Integer getOrderdoingId() {
        return this.orderdoingId;
    }
    
    public void setOrderdoingId(Integer orderdoingId) {
        this.orderdoingId = orderdoingId;
    }

    public String getOrderNum() {
        return this.orderNum;
    }
    
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderPs() {
        return this.orderPs;
    }
    
    public void setOrderPs(String orderPs) {
        this.orderPs = orderPs;
    }

    public Timestamp getOrderTime() {
        return this.orderTime;
    }
    
    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Timestamp getOrderHandleTime() {
        return this.orderHandleTime;
    }
    
    public void setOrderHandleTime(Timestamp orderHandleTime) {
        this.orderHandleTime = orderHandleTime;
    }

    public Integer getOrderStat() {
        return this.orderStat;
    }
    
    public void setOrderStat(Integer orderStat) {
        this.orderStat = orderStat;
    }

    public String getOrderKcom() {
        return this.orderKcom;
    }
    
    public void setOrderKcom(String orderKcom) {
        this.orderKcom = orderKcom;
    }

    public String getOrderKnum() {
        return this.orderKnum;
    }
    
    public void setOrderKnum(String orderKnum) {
        this.orderKnum = orderKnum;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAdmId() {
        return this.admId;
    }
    
    public void setAdmId(String admId) {
        this.admId = admId;
    }

    public String getOrderContent() {
        return this.orderContent;
    }
    
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    public Integer getExpressId() {
        return this.expressId;
    }
    
    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }


	public Toaddress getToaddress() {
		return toaddress;
	}


	public void setToaddress(Toaddress toaddress) {
		this.toaddress = toaddress;
	}


	public Todolist getTodolist() {
		return todolist;
	}


	public void setTodolist(Todolist todolist) {
		this.todolist = todolist;
	}


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	public Express getExpress() {
		return express;
	}


	public void setExpress(Express express) {
		this.express = express;
	}


	public Admins getAdmins() {
		return admins;
	}


	public void setAdmins(Admins admins) {
		this.admins = admins;
	}


	@Override
	public String toString() {
		return "OrderDoing [orderdoingId=" + orderdoingId + ", orderContent="
				+ orderContent + ", orderNum=" + orderNum + ", orderPs="
				+ orderPs + ", orderTime=" + orderTime + ", orderHandleTime="
				+ orderHandleTime + ", orderStat=" + orderStat + ", orderKcom="
				+ orderKcom + ", orderKnum=" + orderKnum + ", addressId="
				+ addressId + ", userId=" + userId + ", admId=" + admId
				+ ", expressId=" + expressId + "]";
	}
   


}