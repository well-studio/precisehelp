package cn.wellstudio.precisehelp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.service.IOrderDoingService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 处理中订单控制
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class OrderDoingAction extends ActionSupport implements ModelDriven<OrderDone>{
	
	private IOrderDoingService orderDoingService;
	public void setOrderDoingService(IOrderDoingService orderDoingService) {
		this.orderDoingService = orderDoingService;
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
	 * 查询全部处理中订单
	 * @return
	 */
	public String findAllDoingOrders() {
		List<OrderDoing> doingList = orderDoingService.findAllDoingOrders();
		if( doingList.size() != 0) {
			valueMap.put("doingList", doingList);
		} else {
			valueMap.put("Msg", "查询全部正在处理订单失败~");
		}
		return "valueMap";
	}
	
	
	/**
	 * 根据用户查询正在进行订单信息
	 * @return
	 */
	public String findDoingOrdersByUser() {
		
		List<OrderDoing> doingList = orderDoingService.findAllDoingOrderByUser(orderDone.getUserId());
		if( doingList.size() != 0) {
			valueMap.put("doingList", doingList);
		} else {
			valueMap.put("Msg", "查询全部正在处理订单失败~");
		}
		return "valueMap";
		
	}
	
	
	/**
	 * 确认收货
	 * @return
	 */
	public String confirmOrder() {
		
		boolean res = orderDoingService.confirmOrder(orderDone);
		if( res) {
			valueMap.put("Msg", "确认收货成功~");
		} else {
			valueMap.put("Msg", "确认收货失败!");
		}
		
		return "valueMap";
	}
	
	
	
	@Override
	public OrderDone getModel() {
		
		return orderDone;
	}
	
}
