package cn.wellstudio.precisehelp.service.impl;


import cn.wellstudio.precisehelp.dao.IExpressDAO;
import cn.wellstudio.precisehelp.entity.Express;
import cn.wellstudio.precisehelp.service.IExpressService;

/**
 * 物流业务接口设计
 * @author huhong
 *
 */
public class ExpressService implements IExpressService{

	IExpressDAO expressDao;
	public void setExpressDao(IExpressDAO expressDao) {
		this.expressDao = expressDao;
	}
	
	public Express queryAllExpressInfo() {
		
		return null;
	}

	public boolean addExpress(Express express) {
		
		boolean res = expressDao.addExpress(express);
		
		return res;
	}

	public Express findExpressByOrder(String expressNum) {
		
		Express express = expressDao.findExpressByOrder(expressNum);
		
		return express;
	}

	public boolean updateExpress(Express express) {
		
		boolean res = expressDao.updateExpress(express);
		
		return res;
	}

}
