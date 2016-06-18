package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;


/**
 * 处理订单列表
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Todolist  implements java.io.Serializable {

     
 	private Integer todoId; // 待做订单id
 	private Timestamp todoTime; // 管理员接单时间
 	private Integer orderdoingId;
    private String admId;
 	private OrderDoing orderDoing; // 处理中订单
 	private Admins admins; // 关联处理的管理员


    // Constructors

    /** default constructor */
    public Todolist() {
    }

    
    /** full constructor */
    public Todolist(Timestamp todoTime, String admId, Integer orderdoingId) {
        this.todoTime = todoTime;
        this.admId = admId;
        this.orderdoingId = orderdoingId;
    }

   
    // Property accessors

    public Integer getTodoId() {
        return this.todoId;
    }
    
    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public Timestamp getTodoTime() {
        return this.todoTime;
    }
    
    public void setTodoTime(Timestamp todoTime) {
        this.todoTime = todoTime;
    }

    public String getAdmId() {
        return this.admId;
    }
    
    public void setAdmId(String admId) {
        this.admId = admId;
    }

    public Integer getOrderdoingId() {
        return this.orderdoingId;
    }
    
    public void setOrderdoingId(Integer orderdoingId) {
        this.orderdoingId = orderdoingId;
    }


	public OrderDoing getOrderDoing() {
		return orderDoing;
	}


	public void setOrderDoing(OrderDoing orderDoing) {
		this.orderDoing = orderDoing;
	}


	public Admins getAdmins() {
		return admins;
	}


	public void setAdmins(Admins admins) {
		this.admins = admins;
	}


	@Override
	public String toString() {
		return "Todolist [todoId=" + todoId + ", todoTime=" + todoTime
				+ ", orderdoingId=" + orderdoingId + ", admId=" + admId + "]";
	}
   


}