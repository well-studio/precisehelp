package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IOrderDAO;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 正在进行的订单增删改查类
 * @author xxmodd
 */
public class OrderDoingManage extends ObjectManage implements IOrderDAO{

	// 用户查询自己的正在进行处理的订单（用户已付款） 一对多查询
	@SuppressWarnings("unchecked")
	public static List<OrderDoing> OrderDoingByUser(Users user) {
		List<OrderDoing> orderDoings = null;
		// `orderdoing_id`,`order_num`,`order_ps`,`order_time`,`order_stat`,`order_kcom`,`order_knum`
		String sql = "select * from order_doing where user_id = ?";
		orderDoings = Operation.sqlQuery(sql, new OrderDoing(),user.getUserId());
		return orderDoings;
	}

	// 管理员查询自己正在进行处理的订单（用户已付款） 一对多查询
	@SuppressWarnings("unchecked")
	public static List<OrderDoing> OrderDoingByAdmin(Admins admins) {
		List<OrderDoing> orderDoings = null;
		// `orderdoing_id`,`order_num`,`order_ps`,`order_time`,`order_stat`,`order_kcom`,`order_knum`
		String sql = "select * from order_doing where adm_id = ?";
		orderDoings = Operation.sqlQuery(sql, new OrderDoing(),admins.getAdmId());
		return orderDoings;
	}

	@Override
	public boolean createTodoOrder(OrderTodo order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrderTodo> findAllTodoOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderTodo> findAllTodoOrderByUser(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createDoneOrder(OrderDone order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrderDone> findAllDoneOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDone> findAllDoneOrderByUser(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDone> findAllDoneOrderByAdmin(Admins admins) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createDoingOrder(OrderDoing order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrderDoing> findAllDoingOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDoing> findAllDoingOrderByUser(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDoing> findAllDoingOrderByAdmin(Admins admins) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllOrdersByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findOrderByNum(String orderNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object updateOrderByNum(String orderNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelOrder(String orderNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelMoney(String orderNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean confirmOrder(OrderDone order) {
		// TODO Auto-generated method stub
		return false;
	}
}
