package cn.wellstudio.precisehelp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.wellstudio.precisehelp.entity.Goodstype;
import cn.wellstudio.precisehelp.service.IGoodsTypeService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 商品类型控制器
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class GoodsTypeAction extends ActionSupport{
	private Map<String,Object> valueMap = new HashMap<String, Object>();
	
	
	IGoodsTypeService goodsTypeService;
	public void setGoodsTypeService(IGoodsTypeService goodsTypeService) {
		this.goodsTypeService = goodsTypeService;
	}
	
	
	public Map<String, Object> getValueMap() {
		return valueMap;
	}


	public void setValueMap(Map<String, Object> valueMap) {
		this.valueMap = valueMap;
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
		List<Goodstype> typeList =  goodsTypeService.findAllType();
		if(typeList!=null){
			valueMap.put("AllType", typeList);
			return "findAllTypeSuccess";
		}
		valueMap.put("Msg", "Fail");
		return "findAllTypeFail";
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
