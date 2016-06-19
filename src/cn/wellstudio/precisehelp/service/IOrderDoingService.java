package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;

/**
 * 处理中订单业务接口设计
 * @author huhong
 *
 */
public interface IOrderDoingService {
	
	
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
	public List<OrderDoing> findAllDoingOrderByUser(String userId);
	
	/**
	 * 根据admin查询正在处理的订单
	 * @param admins
	 * @return
	 */
	public List<OrderDoing> findAllDoingOrderByAdmin(Admins admins);
	
	
	/**
	 * 完成订单
	 * @param order
	 * @return
	 */
	public boolean confirmOrder(OrderDone order);
}
