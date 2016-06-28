package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IToaddressDAO;
import cn.wellstudio.precisehelp.entity.Toaddress;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 收获地址的增删改查
 * @author xxmodd 
 */
public class ToaddressManage extends ObjectManage implements IToaddressDAO{

	//用户获取自己的收货地址
	@SuppressWarnings("unchecked")
	public List<Toaddress> toaddressQuery(Users user){
		List<Toaddress> toaddress= null;
		String sql = "select * from toaddress where user_id = ?";
		toaddress = Operation.sqlQuery(sql,new Toaddress(),user.getUserId());
		return toaddress;
	}

	@Override
	public boolean addAddress(Toaddress toAddress) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAddress(int addressId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAllAddress(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAddress(Toaddress toAddress) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Toaddress findAddressById(int addressId) {
		String hql = "from Toaddress as to where to.addressId = ?";
		List<Toaddress> toaddressList = Operation.hqlQuery(hql, addressId);
		if(toaddressList!=null&&toaddressList.size()!=0){
			return toaddressList.get(0);
		}
		return null;
	}

	@Override
	public List<Toaddress> findAddressByUser(String userAccount) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
