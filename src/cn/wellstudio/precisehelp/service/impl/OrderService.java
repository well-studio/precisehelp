package cn.wellstudio.precisehelp.service.impl;

import java.util.List;



import cn.wellstudio.precisehelp.dao.factory.DaoFactory;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IOrderService;

public class OrderService implements IOrderService {

	public boolean canceMoney(String orderNum) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canceOrder(String orderNum) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean confirmOrder(OrderDone order) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createDoingOrder(OrderDoing order) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createDoneOrder(OrderDone order) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createTodoOrder(OrderTodo order) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * 用户查询自己已付款的订单
	 */
	public List<OrderDoing> findAllDoingOrderByUser(Users users) {
		List<OrderDoing> doingList  = DaoFactory.getOrderDoing().OrderDoingByUser(users);
		return doingList;
	}
	/**
	 * 管理员查询自己正在处理的订单
	 */
	public List<OrderDoing> findAllDoingOrderByAdmin(Admins admins) {
		List<OrderDoing> doingList2 = DaoFactory.getOrderDoing().OrderDoingByAdmin(admins);
		return doingList2;
	}
	public List<OrderDoing> findAllDoingOrders() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 */
	public List<OrderDone> findAllDoneOrderByUser(Users users) {
		List<OrderDone> doneList = DaoFactory.getOrderDone().OrderDoneByUser(users);
		return doneList;
	}
	/**
	 * 管理员查看自己完成的订单
	 */
	public List<OrderDone> findAllDoneOrderByAdmin(Admins admins) {
		List<OrderDone> doneList2 = DaoFactory.getOrderDone().OrderDoneByAdmin(admins);
		return doneList2;
	}
	public List<OrderDone> findAllDoneOrders() {
		return findAllDoneOrderByAdmin(new Admins());
	}

	public List<?> findAllOrdersByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<?> findAllOrdersByUser(String userAccount) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 用户查看自己未支付的订单，即未做任何处理的订单
	 */
	public List<OrderTodo> findAllTodoOrderByUser(Users users) {
		return null;
	}

	public List<OrderTodo> findAllTodoOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findOrderByNum(String orderNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getOrderByNum(String orderNum) {
		// TODO Auto-generated method stub
		return 0;
	}

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

	
}
