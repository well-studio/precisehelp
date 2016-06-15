package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IExpressDAO;
import cn.wellstudio.precisehelp.entity.Express;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 物流表管理类，增删改查
 * @author xxmodd
 */
public class ExpressManage extends ObjectManage implements IExpressDAO{
	
	
	// 可以直接调用父类方法，添加或修改物流表
//	public static boolean saveOrUpdateExpress(Express express){
//		return Operation.addOrUpdate(express);
//	}
	
	// 根据*正在进行的订单*查询物流表，一个订单对应一个物流表 test true
	public static Express expressByOrderDoingQuery(OrderDoing orderDoing) {
		String hql = "from Express as exp where exp.orderDoing.orderdoingId = "
				+ orderDoing.getOrderdoingId();
		@SuppressWarnings("unchecked")
		List<Express> expList = Operation.hqlQuery(hql);
		if (expList.size() == 0) {
			return null;
		}
		return expList.get(0);
	}

	// 根据*已完成的订单*查询物流表，一个订单对应一个物流表 test true
	public static Express expressByOrderDoneQuery(OrderDone orderDone) {
		String hql = "from Express as exp where exp.orderDone.orderdoneId = "
				+ orderDone.getOrderdoneId();
		@SuppressWarnings("unchecked")
		List<Express> expList = Operation.hqlQuery(hql);
		if (expList.size() == 0) {
			return null;
		}
		return expList.get(0);
	}

	@Override
	public Express findExpressByOrder(String expressNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addExpress(Express express) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateExpress(Express express) {
		// TODO Auto-generated method stub
		return false;
	}
}
