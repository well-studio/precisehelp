package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IToaddressDAO;
import cn.wellstudio.precisehelp.entity.Toaddress;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IToAddressService;

/**
 * 收货地址业务实现
 * @author huhong
 *
 */
public class ToAddressService implements IToAddressService {

	
	IToaddressDAO toAddressDao;
	public void setToAddressDao(IToaddressDAO toAddressDao) {
		this.toAddressDao = toAddressDao;
	}
	
	public boolean addAddress(Toaddress toAddress) {
		
		boolean res = toAddressDao.addAddress(toAddress);
		
		return res;
	}

	public Toaddress findAddressById(int addressId) {
		
		Toaddress toaddress = toAddressDao.findAddressById(addressId);
		
		return toaddress;
	}

	public List<Toaddress> findAddressByUser(String userAccount) {
		
		List<Toaddress> addressList = toAddressDao.findAddressByUser(userAccount);
		
		return addressList;
	}

	public boolean removeAddress(int addressId) {
		
		boolean res = toAddressDao.removeAddress(addressId);
		
		return res;
	}

	public boolean updateAddress(Toaddress toAddress) {
		boolean res = toAddressDao.updateAddress(toAddress);
		
		return res;
	}

	@Override
	public boolean removeAllAddress(Users user) {
		
		boolean res = toAddressDao.removeAllAddress(user);
		
		return res;
	}

}
