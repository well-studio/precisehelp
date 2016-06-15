package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IGoodsQuestionDAO;
import cn.wellstudio.precisehelp.entity.Goodsquestion;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 用户对商品的提问的增删改查类
 * @author xxmodd 
 */
public class GoodsquestionManage extends ObjectManage implements IGoodsQuestionDAO{
	
	//用户查询自己的提问
	@SuppressWarnings("unchecked")
	public static List<Goodsquestion> userGoodsQuestionQuery(Users user){
		List<Goodsquestion> questionList= null;
		String sql = "select * from goodsquestion where user_id = '" + user.getUserId() + "'";
		questionList = Operation.sqlQuery(sql,new Goodsquestion());
		return questionList;
	}
	
	//管理员查看所有未关闭的提问
	@SuppressWarnings("unchecked")
	public static List<Goodsquestion> adminGetAllGoodsquestion(){
		List<Goodsquestion> questionList= null;
		String hql = "from Goodsquestion as gq where gq.quesClose=0";
		questionList = Operation.hqlQuery(hql);
		return questionList;
	}

	@Override
	public boolean createQuestion(Goodsquestion goodsQuestion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateQuestion(Goodsquestion goodsQuestion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeQuestion(int quesId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Goodsquestion findQuesById(int quesId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goodsquestion> findQuesBygoods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goodsquestion> findQuesByUser(Users users) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
