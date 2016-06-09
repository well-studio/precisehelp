package cn.wellstudio.precisehelp.sqlhelp;

import java.util.List;

import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 待做订单增删改查
 * @author xxmodd 
 */
public class OrderTodoManage {
	//用户查询自己未支付的订单
	@SuppressWarnings("unchecked")
	public static List<OrderTodo> OrderTodoByUser(Users user) {
		List<OrderTodo> orderTodos = null;
		String sql = "select * from order_todo where user_id = '"
				+ user.getUserId() + "'";
		orderTodos = Operation.sqlQuery(sql, new OrderTodo());
		return orderTodos;
	}
}
