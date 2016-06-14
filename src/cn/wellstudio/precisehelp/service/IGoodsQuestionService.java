package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Goodsquestion;
import cn.wellstudio.precisehelp.entity.Users;


/**
 * 用户对商品进行提问的业务层接口
 * @author huhong
 *
 */
public interface IGoodsQuestionService {
	/**
	 * 创建一个问题
	 * @param goodsQuestion
	 * @return
	 */
	public boolean createQuestion(Goodsquestion goodsQuestion);
	
	/**
	 * 更新问题
	 * @param goodsQuestion
	 * @return
	 */
	public boolean updateQuestion(Goodsquestion goodsQuestion);
	
	/**
	 * 删除问题
	 * @param quesId
	 * @return
	 */
	public boolean removeQuestion(int quesId);
	
	/**
	 * 根据id查询问题
	 * @param quesId
	 * @return
	 */
	public Goodsquestion findQuesById(int quesId);
	
	/**
	 * 根据商品查询问题
	 * @return
	 */
	public List<Goodsquestion> findQuesBygoods();
	
	/**
	 * 根据用户查询问题
	 * @param users
	 * @return
	 */
	public List<Goodsquestion> findQuesByUser(Users users);
}
