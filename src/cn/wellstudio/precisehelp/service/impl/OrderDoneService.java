package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IOrderDoneDao;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.service.IOrderDoneService;

/**
 * 完成订单业务实现
 * @author huhong
 *
 */
public class OrderDoneService implements IOrderDoneService {

	
	private IOrderDoneDao orderDoneDao;
	public void setOrderDoneDao(IOrderDoneDao orderDoneDao) {
		this.orderDoneDao = orderDoneDao;
	}
	
	@Override
	public List<OrderDone> findAllDoneOrders() {
		
		return orderDoneDao.findAllDoneOrders();
	}

	@Override
	public List<OrderDone> findAllDoneOrderByUser(String userId) {
		
		return orderDoneDao.findAllDoneOrderByUser(userId);
	}

	@Override
	public List<OrderDone> findAllDoneOrderByAdmin(Admins admins) {
		
		return orderDoneDao.findAllDoneOrderByAdmin(admins);
	}

}
