package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * Todolist entity. @author MyEclipse Persistence Tools
 */

public class Todolist implements java.io.Serializable {

	// Fields

	private Integer todoId;
	private OrderDoing orderDoing;
	private Admins admins;
	private Date todoTime;

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