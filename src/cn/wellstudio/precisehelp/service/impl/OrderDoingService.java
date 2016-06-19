package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IOrderDoingDao;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.service.IOrderDoingService;
/**
 * 进行订单业务实现
 * @author huhong
 *
 */
public class OrderDoingService implements IOrderDoingService {

	
	private IOrderDoingDao orderDoingDao;
	public void setOrderDoingDao(IOrderDoingDao orderDoingDao) {
		this.orderDoingDao = orderDoingDao;
	}
	@Override
	public boolean createDoingOrder(OrderDoing order) {
		
		return orderDoingDao.createDoingOrder(order);
	}
	@Override
	public List<OrderDoing> findAllDoingOrders() {
		
		return orderDoingDao.findAllDoingOrders();
	}
	@Override
	public List<OrderDoing> findAllDoingOrderByUser(String userId) {
		
		return orderDoingDao.findAllDoingOrderByUser(userId);
	}
	@Override
	public List<OrderDoing> findAllDoingOrderByAdmin(Admins admins) {
		
		return orderDoingDao.findAllDoingOrderByAdmin(admins);
	}
	@Override
	public boolean confirmOrder(OrderDone order) {
		
		return orderDoingDao.confirmOrder(order);
	}
	

}
