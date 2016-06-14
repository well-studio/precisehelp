package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.IOrderService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 订单控制器
 * @author huhong
 *
 */
public class OrderAction extends ActionSupport{
	
	IOrderService orderService;
	public void setOrderService(IOrderService orderService) {
		this.orderService = orderService;
	}
	
	/**
	 * 创建订单
	 * @return
	 */
	public String createOrder() {
		
		return null;
	}
	
	/**
	 * 查询全部待处理订单
	 * @return
	 */
	public String findAllTodoOrders() {
		
		return null;
	}
	
	/**
	 * 查询全部待处理中订单
	 * @return
	 */
	public String findAllDoingOrders() {
		
		return null;
	}
	
	/**
	 * 查询全部待处理完毕订单
	 * @return
	 */
	public String findAllDoneOrders() {
		
		return null;
	}
	
	
	/**
	 * 根据用户查 询全部订单信息
	 * @return
	 */
	public String findOrdersByUser() {
		
		return null;
	}
	
	
	/**
	 * 根据用户查询待做订单信息
	 * @return
	 */
	public String findTodoOrdersByUser() {
		
		return null;
	}
	
	
	
	/**
	 * 根据用户查询正在进行订单信息
	 * @return
	 */
	public String findDoingOrdersByUser() {
		
		return null;
	}
	
	
	/**
	 * 根据用户查询完成订单信息
	 * @return
	 */
	public String findDoneOrdersByUser() {
		
		return null;
	}
	
	
	
	/**
	 * 根据订单编号查询订单信息 - 包括关联的商品/用户等信息
	 * @return
	 */
	public String findOrderByNum() {
		
		return null;
	}
	
	
	
	/**
	 * 根据订单编号修改订单信息
	 * @return
	 */
	public String updateOrderByNum() {
		
		return null;
	}
	
	
	/**
	 * 取消订单 - 删除 or 标识
	 * @return
	 */
	public String cancelOrder() {
		
		return null;
	}
	
	
	/**
	 * 申请退款
	 * @return
	 */
	public String cancelMoney() {
		
		return null;
	}
	
	
	
	/**
	 * 确认收货
	 * @return
	 */
	public String confirmOrder() {
		
		return null;
	}
	
	
	
	
	
	

}
