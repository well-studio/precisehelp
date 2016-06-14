package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.entity.Users;

/**
 * 订单业务接口设计
 * @author huhong
 *
 */
public interface IOrderService {
	
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
	public List<OrderTodo> findAllTodoOrderByUser(Users users);
	
	/**
	 * 创建一个已完成订单
	 * @param order
	 * @return
	 */
	public boolean createDoneOrder(OrderDone order);
	
	/**
	 * 查询全部已完成订单
	 * @return
	 */
	public List<OrderDone> findAllDoneOrders();
	
	/**
	 * 根据用户查询已完成订单
	 * @param users
	 * @return
	 */
	public List<OrderDone> findAllDoneOrderByUser(Users users);
	
	/**
	 * 根据管理员查询全部已完成订单
	 * @param admins
	 * @return
	 */
	public List<OrderDone> findAllDoneOrderByAdmin(Admins admins);
	
	/**
	 * 创建正在处理订单
	 * @param order
	 * @return
	 */
	public boolean createDoingOrder(OrderDoing order);
	
	/**
	 * 查询全部doing订单
	 * @return
	 */
	public List<OrderDoing> findAllDoingOrders();
	
	/**
	 * 根据用户查询全部doing订单
	 * @param users
	 * @return
	 */
	public List<OrderDoing> findAllDoingOrderByUser(Users users);
	
	/**
	 * 根据admin查询正在处理的订单
	 * @param admins
	 * @return
	 */
	public List<OrderDoing> findAllDoingOrderByAdmin(Admins admins);
	
	
	/**
	 * 根据userid查询全部订单
	 * @param userId
	 * @return
	 */
	public List<?> findAllOrdersByUser(int userId);
	

	
	/**
	 * 根据订单编号查询订单
	 * @param orderNum
	 * @return
	 */
	public Object findOrderByNum(String orderNum);

	/**
	 * 根据订单编号更新订单
	 * @param orderNum
	 * @return
	 */
	public Object updateOrderByNum(String orderNum);
	
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
	
	/**
	 * 完成订单
	 * @param order
	 * @return
	 */
	public boolean confirmOrder(OrderDone order);
}
