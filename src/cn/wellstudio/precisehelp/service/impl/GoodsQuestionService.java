package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.factory.DaoFactory;
import cn.wellstudio.precisehelp.entity.Goodsquestion;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IGoodsQuestionService;

public class GoodsQuestionService implements IGoodsQuestionService {

	public boolean createQuestion(Goodsquestion goodsQuestion) {
		// TODO Auto-generated method stub
		return false;
	}

	public Goodsquestion findQuesById(int quesId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 用户查询自己提出的问题
	 */
	public List<Goodsquestion> findQuesByUser(Users users) {
		return null;
	}
	/**
	 * 管理员查询自己的问题
	 */
	public List<Goodsquestion> findQuesBygoods() {
		return null;
	}

	public boolean removeQuestion(int quesId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateQuestion(Goodsquestion goodsQuestion) {
		// TODO Auto-generated method stub
		return false;
	}

}
