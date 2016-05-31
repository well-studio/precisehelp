package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * 处理订单列表
 * @author huhong
 *
 */
public class Todolist implements java.io.Serializable {

	// Fields

	private Integer todoId; // 待做订单id
	private OrderDoing orderDoing; // 处理中订单
	private Date todoTime; // 管理员接单时间

	// Constructors

	/** default constructor */
	public Todolist() {
	}

	/** full constructor */
	public Todolist(OrderDoing orderDoing, Date todoTime) {
		this.orderDoing = orderDoing;
		this.todoTime = todoTime;
	}

	// Property accessors

	public Integer getTodoId() {
		return this.todoId;
	}

	public void setTodoId(Integer todoId) {
		this.todoId = todoId;
	}

	public OrderDoing getOrderDoing() {
		return this.orderDoing;
	}

	public void setOrderDoing(OrderDoing orderDoing) {
		this.orderDoing = orderDoing;
	}

	public Date getTodoTime() {
		return this.todoTime;
	}

	public void setTodoTime(Date todoTime) {
		this.todoTime = todoTime;
	}

}