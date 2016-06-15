package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IGoodsQuestionDAO;
import cn.wellstudio.precisehelp.dao.factory.DaoFactory;
import cn.wellstudio.precisehelp.entity.Goodsquestion;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IGoodsQuestionService;

/**
 * 商品提问业务实现
 * @author huhong
 *
 */
public class GoodsQuestionService implements IGoodsQuestionService {

	IGoodsQuestionDAO goodsQuestionDao;
	public void setGoodsQuestionDao(IGoodsQuestionDAO goodsQuestionDao) {
		this.goodsQuestionDao = goodsQuestionDao;
	}
	
	@Override
	public boolean createQuestion(Goodsquestion goodsQuestion) {
		
		boolean res = goodsQuestionDao.createQuestion(goodsQuestion);
		
		return res;
	}
	
	@Override
	public boolean updateQuestion(Goodsquestion goodsQuestion) {
		
		boolean res = goodsQuestionDao.updateQuestion(goodsQuestion);
		
		return res;
	}
	
	@Override
	public boolean removeQuestion(int quesId) {
		
		boolean res = goodsQuestionDao.removeQuestion(quesId);
		
		return res;
	}
	
	@Override
	public Goodsquestion findQuesById(int quesId) {
		
		Goodsquestion question = goodsQuestionDao.findQuesById(quesId);
		
		return question;
	}
	
	@Override
	public List<Goodsquestion> findQuesBygoods() {
		
		List<Goodsquestion> queList = goodsQuestionDao.findQuesBygoods();
		
		return queList;
	}
	
	@Override
	public List<Goodsquestion> findQuesByUser(Users users) {

		List<Goodsquestion> queList = goodsQuestionDao.findQuesBygoods();
		
		return queList;
	}
	
	
}
