package cn.wellstudio.precisehelp.service.impl;

import java.sql.Timestamp;
import java.util.List;

import cn.wellstudio.precisehelp.dao.IOrderDAO;
import cn.wellstudio.precisehelp.service.IOrderService;

/**
 * 订单业务实现类
 * @author huhong
 *
 */
public class OrderService implements IOrderService {

	
	IOrderDAO orderDao;
	public void setOrderDao(IOrderDAO orderDao) {
		this.orderDao = orderDao;
	}
	
	@Override
	public List<?> findAllOrdersByUser(String userId) {
		
		return orderDao.findAllOrdersByUser(userId);
	}
	@Override
	public Object findOrderByNum(String orderNum) {
		
		return orderDao.findOrderByNum(orderNum);
	}

	@Override
	public List<?> findOrdersByTime(Timestamp startTime, Timestamp endTime) {
		
		return orderDao.findOrdersByTime(startTime, endTime);
	}
	
	
}
