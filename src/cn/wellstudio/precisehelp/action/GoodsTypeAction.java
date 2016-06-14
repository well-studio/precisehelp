package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.IGoodsTypeService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 商品类型控制器
 * @author huhong
 *
 */
public class GoodsTypeAction extends ActionSupport{
	
	IGoodsTypeService goodsTypeService;
	public void setGoodsTypeService(IGoodsTypeService goodsTypeService) {
		this.goodsTypeService = goodsTypeService;
	}
	
	/**
	 * 添加商品种类
	 * @return
	 */
	public String addType() {
		
		return null;
	}
	
	/**
	 * 更新商品种类
	 * @return
	 */
	public String updateType() {
		
		return null;
	}
	
	/**
	 * 删除商品种类
	 * @return
	 */
	public String removeType() {
		
		return null;
	}
	
	/**
	 * 查询全部的商品种类
	 * @return
	 */
	public String findAllType() {
		
		return null;
	}
	
	/**
	 * 根据id查询商品种类
	 * @return
	 */
	public String findTypeById() {
		
		return null;
	}
	
	/**
	 * 根据name查询商品种类
	 * @return
	 */
	public String findTypeByName() {
		
		return null;
	}
}
