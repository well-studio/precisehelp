package cn.wellstudio.precisehelp.sqlhelp;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 用户账号管理
 * @author xxmodd 
 */
public class UsersManage extends ObjectManage{

	//管理员获取全部用户账号,不包含关联信息
	@SuppressWarnings("unchecked")
	public static List<Users> getAllUsersMeg(){
		List<Users> userList= null;
		String hql = "from Users";
		userList = Operation.hqlQuery(hql);
		return  userList;
	}
	
	
}
