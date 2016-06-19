package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDone;

/**
 * 已完成订单业务接口
 * @author huhong
 *
 */
public interface IOrderDoneService {
	
	/**
	 * 查询全部已完成订单
	 * @return
	 */
	public List<OrderDone> findAllDoneOrders();
	
	/**
	 * 根据用户查询已完成订单
	 * @param users
	 * @return
	 */
	public List<OrderDone> findAllDoneOrderByUser(String userId);
	
	/**
	 * 根据管理员查询全部已完成订单
	 * @param admins
	 * @return
	 */
	public List<OrderDone> findAllDoneOrderByAdmin(Admins admins);
}
