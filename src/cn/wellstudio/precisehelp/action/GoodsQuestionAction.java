package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.IGoodsQuestionService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 商品提问控制器
 * @author huhong
 *
 */
public class GoodsQuestionAction extends ActionSupport{
	
	IGoodsQuestionService goodsQuestionService;
	public void setGoodsQuestionService(
			IGoodsQuestionService goodsQuestionService) {
		this.goodsQuestionService = goodsQuestionService;
	}

	/**
	 * 添加一个商品提问
	 * @return
	 */
	public String createQuestion() {
		
		return null;
	}
	
	/**
	 * 更新提问内容
	 * @return
	 */
	public String updateQuestion() {
		
		return null;
	}
	
	/**
	 * 删除问题
	 * @return
	 */
	public String removeQuestion() {
		
		return null;
	}
	
	/**
	 * 根据id查询问题
	 * @return
	 */
	public String findQuesById() {
		
		return null;
	}
	
	/**
	 * 根据商品查询对应的问题
	 * @return
	 */
	public String findQuesByGoods() {
		
		return null;
	}
	
	/**
	 * 根据用户查询提问信息
	 * @return
	 */
	public String findQuesByUser() {
		
		return null;
	}
}
