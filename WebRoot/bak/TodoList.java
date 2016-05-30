package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;

/**
 * 管理员任务实体
 * @author huhong
 *
 */
public class TodoList {
	
	int todo_id; // 任务id
	Timestamp todo_time; // 加入队列的时间(队列按时间排序优先处理) 方便程序处理超时
	Order_Doing order_Doing;
	
	public TodoList(){}

	public TodoList(int todo_id, Timestamp todo_time, Order_Doing order_Doing) {
		super();
		this.todo_id = todo_id;
		this.todo_time = todo_time;
		this.order_Doing = order_Doing;
	}

	public int getTodo_id() {
		return todo_id;
	}

	public void setTodo_id(int todo_id) {
		this.todo_id = todo_id;
	}

	public Timestamp getTodo_time() {
		return todo_time;
	}

	public void setTodo_time(Timestamp todo_time) {
		this.todo_time = todo_time;
	}

	public Order_Doing getOrder_Doing() {
		return order_Doing;
	}

	public void setOrder_Doing(Order_Doing order_Doing) {
		this.order_Doing = order_Doing;
	}

	@Override
	public String toString() {
		return "TodoList [todo_id=" + todo_id + ", todo_time=" + todo_time
				+ ", order_Doing=" + order_Doing + "]";
	}
	
	
	
}
