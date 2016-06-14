package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Toaddress;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IToAddressService;

public class ToAddressService implements IToAddressService {

	public boolean addAddress(Toaddress toAddress) {
		// TODO Auto-generated method stub
		return false;
	}

	public Toaddress findAddressById(int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Toaddress> findAddressByUser(String userAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeAddress(int addressId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAllAddress(String userAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateAddress(Toaddress toAddress) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAllAddress(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

}
