package cn.wellstudio.precisehelp.action;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.service.IOrderService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 订单控制器
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class OrderAction extends ActionSupport implements ModelDriven<OrderDone>{
	
	IOrderService orderService;
	public void setOrderService(IOrderService orderService) {
		this.orderService = orderService;
	}
	private OrderDone orderDone;
	public void setOrderDone(OrderDone orderDone) {
		this.orderDone = orderDone;
	}
	public OrderDone getOrderDone() {
		return orderDone;
	}
	
	Map<String,Object> valueMap = new HashMap<String,Object>();
	public Map<String, Object> getValueMap() {
		return valueMap;
	}
	public void setValueMap(Map<String, Object> valueMap) {
		this.valueMap = valueMap;
	}
	
	/**
	 * 根据用户查 询全部订单信息
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String findOrdersByUser() {
		
		List<OrderTodo> orderList = (List<OrderTodo>) orderService.findAllOrdersByUser(orderDone.getUserId());
		if( orderList.size() != 0) {
			valueMap.put("orderList", orderList);
			return "success";
		}
		return "failed";
	}
	
	
	/**
	 * 根据订单编号查询订单信息 - 包括关联的商品/用户等信息
	 * @return
	 */
	public String findOrderByNum() {
		
		Object orderInfo = orderService.findOrderByNum(orderDone.getUserId());
		if( orderInfo != null) {
			valueMap.put("orderInfo", orderInfo);
		} else {
			valueMap.put("Msg", "查询订单失败~");
		}
		return "valueMap";
		
	}
	
	/**
	 * 根据时间查询订单信息
	 * @return
	 */
	public String findOrderByTime() {
		Integer IstartTime = Integer.valueOf(startTime);
		Integer IendTime = Integer.valueOf(endTime);
		
		Timestamp startTime = new Timestamp(IstartTime);
		Timestamp endTime = new Timestamp(IendTime);
		
		Object orderInfo = orderService.findOrdersByTime(startTime,endTime);
		if( orderInfo != null) {
			valueMap.put("orderInfo", orderInfo);
		} else {
			valueMap.put("Msg", "查询订单失败~");
		}
		return "valueMap";
		
	}
	
	
	
	
	
	@Override
	public OrderDone getModel() {
		
		return orderDone;
	}
	private String startTime;
	private String endTime;
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime() {
		return endTime;
	}
	

}
