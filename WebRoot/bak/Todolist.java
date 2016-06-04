package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * 管理员待处理实体
 * @author huhong
 *
 */
public class Todolist implements java.io.Serializable {

	// Fields

	private Integer todoId; // id
	private OrderDoing orderDoing; // 1:1关联正在处理的订单
	private Admins admins; // 关联处理的管理员
	private Date todoTime; // 处理的时间

	// Constructors

	/** default constructor */
	public Todolist() {
	}

	/** full constructor */
	public Todolist(OrderDoing orderDoing, Admins admins, Date todoTime) {
		this.orderDoing = orderDoing;
		this.admins = admins;
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

	public Admins getAdmins() {
		return this.admins;
	}

	public void setAdmins(Admins admins) {
		this.admins = admins;
	}

	public Date getTodoTime() {
		return this.todoTime;
	}

	public void setTodoTime(Date todoTime) {
		this.todoTime = todoTime;
	}

}