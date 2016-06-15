package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IGoodsAreaDAO;
import cn.wellstudio.precisehelp.entity.Goodsarea;
import cn.wellstudio.precisehelp.service.IGoodsAreaService;

/**
 * 商品产地业务实现
 * @author huhong
 *
 */
public class GoodsAreaService implements IGoodsAreaService {

	IGoodsAreaDAO goodsAreaDao;
	public void setGoodsAreaDao(IGoodsAreaDAO goodsAreaDao) {
		this.goodsAreaDao = goodsAreaDao;
	}
	
	@Override
	public boolean addArea(Goodsarea goods) {
		
		boolean res = goodsAreaDao.addArea(goods);
		return res;
	}
	
	@Override
	public boolean updateArea(Goodsarea goods) {
		
		boolean res = goodsAreaDao.updateArea(goods);
		
		return res;
	}
	
	@Override
	public boolean removeArea(Goodsarea goods) {
		
		boolean res = goodsAreaDao.removeArea(goods);
		
		return res;
	}
	
	@Override
	public List<Goodsarea> findAllArea() {
		
		List<Goodsarea> areaList = goodsAreaDao.findAllArea();
		
		return areaList;
	}
	
	@Override
	public Goodsarea findAreaById(int goodsId) {
		
		Goodsarea area = goodsAreaDao.findAreaById(goodsId);
		
		return area;
	}
	
	@Override
	public Goodsarea findAreaByName(String goodsName) {
		
		Goodsarea area = goodsAreaDao.findAreaByName(goodsName);
		
		return area;
	}

	

}
