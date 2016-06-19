package cn.wellstudio.precisehelp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.service.IOrderDoneService;

/**
 * 订单完成控制
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class OrderDoneAction extends ActionSupport implements ModelDriven<OrderDone>{

	private IOrderDoneService orderDoneService;
	public void setOrderDoneService(IOrderDoneService orderDoneService) {
		this.orderDoneService = orderDoneService;
	}
	private OrderDone orderDone = new OrderDone();
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
	
	@Override
	public OrderDone getModel() {
		return orderDone;
	}
	
	
	/**
	 * 查询全部处理完毕订单
	 * @return
	 */
	public String findAllDoneOrders() {
		
		List<OrderDone> doneList = orderDoneService.findAllDoneOrders();
		if( doneList.size() != 0) {
			valueMap.put("doneList", doneList);
		} else {
			valueMap.put("Msg", "查询订单失败~");
		}
		
		return "valueMap";
	}
	

	/**
	 * 根据用户查询完成订单信息
	 * @return
	 */
	public String findDoneOrdersByUser() {
		
		List<OrderDone> doneList = orderDoneService.findAllDoneOrderByUser(orderDone.getUserId());
		if( doneList.size() != 0) {
			valueMap.put("doneList", doneList);
		} else {
			valueMap.put("Msg", "查询已完成订单失败");
		}
		return "valueMap";
	}
	
	
}
