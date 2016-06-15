package cn.wellstudio.precisehelp.service.impl;

import java.util.List;




import java.util.Set;

import cn.wellstudio.precisehelp.dao.IOrderDAO;
import cn.wellstudio.precisehelp.dao.factory.DaoFactory;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IOrderService;

/**
 * 订单业务实现类
 * @author huhong
 *
 */
public class OrderService implements IOrderService {

	
	IOrderDAO orderTodoDao;
	IOrderDAO orderDoingDao;
	IOrderDAO orderDoneDao;
	public void setOrderDoingDao(IOrderDAO orderDoingDao) {
		this.orderDoingDao = orderDoingDao;
	}
	public void setOrderDoneDao(IOrderDAO orderDoneDao) {
		this.orderDoneDao = orderDoneDao;
	}
	public void setOrderTodoDao(IOrderDAO orderTodoDao) {
		this.orderTodoDao = orderTodoDao;
	}
	
	
	
	public boolean canceMoney(String orderNum) {
		
		boolean res = orderTodoDao.cancelMoney(orderNum);
		
		return res;
	}

	public boolean canceOrder(String orderNum) {
		
		boolean res = orderTodoDao.cancelOrder(orderNum);
		
		return res;
	}

	public boolean confirmOrder(OrderDone order) {
		
		boolean res = orderDoingDao.confirmOrder(order);
		
		return res;
	}

	public boolean createDoingOrder(OrderDoing order) {
		
		boolean res = orderTodoDao.createDoingOrder(order);
		
		return res;
	}

	public boolean createDoneOrder(OrderDone order) {
		
		boolean res = orderDoingDao.createDoneOrder(order);
		
		return res;
	}

	public boolean createTodoOrder(OrderTodo order) {
		
		boolean res = orderTodoDao.createTodoOrder(order);
		
		return res;
	}
	
	@Override
	public List<OrderTodo> findAllTodoOrders() {
		
		List<OrderTodo> todoList = orderTodoDao.findAllTodoOrders();
		
		return todoList;
	}
	
	
	@Override
	public List<OrderTodo> findAllTodoOrderByUser(Users users) {
		
		List<OrderTodo> todoList = orderTodoDao.findAllTodoOrderByUser(users);
		
		return todoList;
	}
	
	@Override
	public List<OrderDone> findAllDoneOrders() {
		
		List<OrderDone> doneList = orderDoneDao.findAllDoneOrders();
		
		return doneList;
	}
	
	
	@Override
	public List<OrderDone> findAllDoneOrderByUser(Users users) {
		
		List<OrderDone> doneList = orderDoneDao.findAllDoneOrderByUser(users);
		
		return doneList;
	}
	
	
	@Override
	public List<OrderDone> findAllDoneOrderByAdmin(Admins admins) {
		
		List<OrderDone> doneList = orderDoneDao.findAllDoneOrderByAdmin(admins);
		
		return doneList;
	}
	
	
	@Override
	public List<OrderDoing> findAllDoingOrders() {
		
		List<OrderDoing> doingList = orderDoingDao.findAllDoingOrders();
		
		return doingList;
	}
	
	@Override
	public List<OrderDoing> findAllDoingOrderByUser(Users users) {
		
		List<OrderDoing> doingList = orderDoingDao.findAllDoingOrderByUser(users);
		
		return doingList;
	}
	
	
	@Override
	public List<OrderDoing> findAllDoingOrderByAdmin(Admins admins) {
		
		List<OrderDoing> doingList = orderDoingDao.findAllDoingOrderByAdmin(admins);
		
		return doingList;
	}
	
	@Override
	public Object findOrderByNum(String orderNum) {
		
		OrderDone orderDone = (OrderDone) orderDoneDao.findOrderByNum(orderNum);
		
		return orderDone;
	}
	@Override
	public Object updateOrderByNum(String orderNum) {
		
		boolean res = (Boolean) orderDoneDao.updateOrderByNum(orderNum);
		
		return res;
	}
	@Override
	public boolean cancelOrder(String orderNum) {
		
		boolean res = orderTodoDao.cancelOrder(orderNum);
		
		return res;
	}
	@Override
	public boolean cancelMoney(String orderNum) {
		
		boolean res = orderTodoDao.cancelMoney(orderNum);
		
		return res;
	}
	
	
	

	
}
