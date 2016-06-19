package cn.wellstudio.precisehelp.dao;

import java.util.List;

import cn.wellstudio.precisehelp.entity.OrderTodo;

/**
 * 待处理订单DAO接口
 * @author huhong
 *
 */
public interface IOrderTodoDao {
	
	/**
	 * 创建todo订单
	 * @param order
	 * @return
	 */
	public boolean createTodoOrder(OrderTodo order);
	
	
	/**
	 * 查询全部todo订单
	 * @return
	 */
	public List<OrderTodo> findAllTodoOrders();
	
	/**
	 * 根据用户查询全部todo订单
	 * @param users
	 * @return
	 */
	public List<OrderTodo> findAllTodoOrderByUser(String userId);
	
	/**
	 * 根据订单编号更新订单
	 * @param orderNum
	 * @return
	 */
	public OrderTodo updateOrderByNum(String orderNum);
	
	/**
	 * 根据订单编号取消订单
	 * @param orderNum
	 * @return
	 */
	public boolean cancelOrder(String orderNum);
	
	/**
	 * 根据订单编号退款
	 * @param orderNum
	 * @return
	 */
	public boolean cancelMoney(String orderNum);
}
