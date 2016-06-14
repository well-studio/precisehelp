package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.IGoodsAreaService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 商品产地控制器
 * @author huhong
 *
 */
public class GoodsAreaAction extends ActionSupport{
	
	IGoodsAreaService goodsAreaService;
	public void setGoodsAreaService(IGoodsAreaService goodsAreaService) {
		this.goodsAreaService = goodsAreaService;
	}
	
	/**
	 * 添加商品产地
	 * @return
	 */
	public String addArea() {
		
		return null;
	}
	
	
	/**
	 * 更新商品产地信息
	 * @return
	 */
	public String updateArea() {
		
		return null;
	}
	
	
	/**
	 * 删除商品产地信息
	 * @return
	 */
	public String removeArea() {
		
		return null;
	}
	
	/**
	 * 查询全部商品产地
	 * @return
	 */
	public String findAllArea() {
		
		return null;
	}
	
	/**
	 * 根据id查询商品信息
	 * @return
	 */
	public String findAreaById() {
		
		return null;
	}
	
	/**
	 * 根据name查询商品产地
	 * @return
	 */
	public String findAreaByName() {
		
		return null;
	}
}
