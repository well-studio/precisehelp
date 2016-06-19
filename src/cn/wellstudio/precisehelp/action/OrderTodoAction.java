package cn.wellstudio.precisehelp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.service.IOrderTodoService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 带处理订单控制
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class OrderTodoAction extends ActionSupport implements ModelDriven<OrderTodo> {
	
	private IOrderTodoService orderTodoService;
	public void setOrderTodoService(IOrderTodoService orderTodoService) {
		this.orderTodoService = orderTodoService;
	}

	OrderTodo orderTodo = new OrderTodo();
	public void setOrderTodo(OrderTodo orderTodo) {
		this.orderTodo = orderTodo;
	}
	public OrderTodo getOrderTodo() {
		return orderTodo;
	}
	Map<String,Object> valueMap = new HashMap<String,Object>();
	
	public Map<String, Object> getValueMap() {
		return valueMap;
	}
	public void setValueMap(Map<String, Object> valueMap) {
		this.valueMap = valueMap;
	}
	
	@Override
	public OrderTodo getModel() {
		return orderTodo;
	}
	
	/**
	 * 创建订单
	 * @return
	 */
	public String createOrder() {
		
		if(orderTodoService.createTodoOrder(orderTodo)) {
			valueMap.put("orderTodo", orderTodo);
		} else {
			valueMap.put("Msg", "创建订单失败");
		}
		return "valueMap";
	}
	

	
	/**
	 * 查询全部待处理订单
	 * @return
	 */
	public String findAllTodoOrders() {
		
		List<OrderTodo> orderTodoList = orderTodoService.findAllTodoOrders();
		if(orderTodoList.size() != 0) {
			valueMap.put("orderTodoList", orderTodoList);
		} else {
			valueMap.put("Msg", "管理员~待处理订单为空哦");
		}
		
		return "valueMap";
	}

	/**
	 * 根据用户查询待做订单信息
	 * @return
	 */
	public String findTodoOrdersByUser() {
		
		List<OrderTodo> orderTodoList = orderTodoService.findAllTodoOrderByUser(orderTodo.getUserId());
		if(orderTodoList.size() != 0) {
			valueMap.put("orderTodoList", orderTodoList);
		} else {
			valueMap.put("Msg", "您的待处理订单为空哦");
		}
		
		return "valueMap";
	}
	
	
	/**
	 * 根据订单编号修改订单信息
	 * @return
	 */
	public String updateOrderByNum() {
		
		OrderTodo orderTodo2 = orderTodoService.updateOrderByNum(orderTodo.getOrderNumber());
		if( orderTodo2 != null) {
			valueMap.put("orderTodo", orderTodo2);
			return "";
		} else {
			valueMap.put("Msg", "对不起更新订单失败~");
		}
		return "valueMap";
	}
	
	/**
	 * 取消订单 - 删除 or 标识
	 * @return
	 */
	public String cancelOrder() {
		
		boolean res = orderTodoService.cancelOrder(orderTodo.getOrderNumber());
		if(res) {
			valueMap.put("Msg", "取消订单成功");
		} else {
			valueMap.put("Msg", "取消订单失败");
		}
		
		return "valueMap";
	}
	
	
	/**
	 * 申请退款
	 * @return
	 */
	public String cancelMoney() {
		
		boolean res = orderTodoService.cancelMoney(orderTodo.getOrderNumber());
		if(res) {
			valueMap.put("Msg", "退款成功");
		} else {
			valueMap.put("Msg", "退款失败");
		}
		return "valueMap";
	}
	
	
}
