package cn.wellstudio.precisehelp.sqlhelp;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Toaddress;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 收获地址的增删改查
 * @author xxmodd 
 */
public class ToaddressManage extends ObjectManage {

	//用户获取自己的收货地址
	@SuppressWarnings("unchecked")
	public static List<Toaddress> toaddressQuery(Users user){
		List<Toaddress> toaddress= null;
		String sql = "select * from toaddress where user_id = ?";
		toaddress = Operation.sqlQuery(sql,new Toaddress(),user.getUserId());
		return toaddress;
	}
	
	
}