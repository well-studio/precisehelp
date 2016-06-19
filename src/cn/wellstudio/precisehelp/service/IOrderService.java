package cn.wellstudio.precisehelp.service;

import java.sql.Timestamp;
import java.util.List;


/**
 * 订单业务接口设计
 * @author huhong
 *
 */
public interface IOrderService {
	
	
	/**
	 * 根据userid查询全部订单
	 * @param userId
	 * @return
	 */
	public List<?> findAllOrdersByUser(String userId);
	
	
	/**
	 * 根据订单编号查询订单
	 * @param orderNum
	 * @return
	 */
	public Object findOrderByNum(String orderNum);
	
	/**
	 * 根据时间查询订单
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public List<?> findOrdersByTime(Timestamp startTime,Timestamp endTime);


	
	
}
