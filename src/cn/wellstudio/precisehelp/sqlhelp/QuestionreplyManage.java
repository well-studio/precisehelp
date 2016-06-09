package cn.wellstudio.precisehelp.sqlhelp;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodsquestion;
import cn.wellstudio.precisehelp.entity.Questionreply;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 提问回应增删改查类
 * @author xxmodd 
 */
public class QuestionreplyManage extends ObjectManage {
	
	//用户查看自己对提问的回应
	@SuppressWarnings("unchecked")
	public static List<Questionreply> userQuestionreplyQuery(Users user){
		List<Questionreply> questionreplyList= null;
		String sql = "select * from questionreply where user_id = '" + user.getUserId() + "'";
		questionreplyList = Operation.sqlQuery(sql,new Questionreply());
		return questionreplyList;
	}
	
	//管理员查看自己对提问的回应
	
	
	//根据提问查看所有回复
	@SuppressWarnings("unchecked")
	public static List<Questionreply>questionReplyQuery(Goodsquestion goodsquestion){
		List<Questionreply> questionreplyList= null;
		String sql = "select * from questionreply where ques_id = '" + goodsquestion.getQuesId() + "'";
		questionreplyList = Operation.sqlQuery(sql,new Questionreply());
		return questionreplyList;
	}
}
