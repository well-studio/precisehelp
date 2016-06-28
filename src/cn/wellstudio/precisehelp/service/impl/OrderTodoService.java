package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IOrderTodoDao;
import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.service.IOrderTodoService;

/**
 * 待处理订单业务实现
 * @author huhong
 *
 */
public class OrderTodoService implements IOrderTodoService {

	private IOrderTodoDao orderTodoDao;
	public void setOrderTodoDao(IOrderTodoDao orderTodoDao) {
		this.orderTodoDao = orderTodoDao;
	}
	
	
	@Override
	public boolean createTodoOrder(OrderTodo order) {
		
		return orderTodoDao.createTodoOrder(order);
	}

	@Override
	public List<OrderTodo> findAllTodoOrders() {
		
		return orderTodoDao.findAllTodoOrders();
	}

	@Override
	public List<OrderTodo> findAllTodoOrderByUser(String userId) {
		
		return orderTodoDao.findAllTodoOrderByUser(userId);
	}

	@Override
	public OrderTodo updateOrderByNum(String orderNum) {
		
		return orderTodoDao.updateOrderByNum(orderNum);
	}

	@Override
	public boolean cancelOrder(String orderNum) {
		
		return orderTodoDao.cancelOrder(orderNum);
	}

	@Override
	public boolean cancelMoney(String orderNum) {
		
		return orderTodoDao.cancelMoney(orderNum);
	}


	@Override
	public OrderTodo viewTodoOrder(OrderTodo orderTodo) {
		
		return orderTodoDao.viewTodoOrder(orderTodo);
	}
	
	

}
