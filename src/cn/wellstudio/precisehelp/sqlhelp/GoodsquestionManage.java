package cn.wellstudio.precisehelp.sqlhelp;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodsquestion;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 用户对商品的提问的增删改查类
 * @author xxmodd 
 */
public class GoodsquestionManage extends ObjectManage {
	
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
	
}
