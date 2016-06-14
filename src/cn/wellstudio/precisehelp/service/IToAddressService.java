package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Toaddress;
import cn.wellstudio.precisehelp.entity.Users;


/**
 * 收货地址业务接口设计
 * @author huhong
 *
 */
public interface IToAddressService {
	
	/**
	 * 添加收货地址
	 * @param toAddress
	 * @return
	 */
	public boolean addAddress(Toaddress toAddress);
	
	/**
	 * 根据id删除收货地址
	 * @param addressId
	 * @return
	 */
	public boolean removeAddress(int addressId);

	/**
	 * 根据用户删除收货地址
	 * @param userAccount
	 * @return
	 */
	public boolean removeAllAddress(Users user);
	
	/**
	 * 更新收货地址
	 * @param toAddress
	 * @return
	 */
	public boolean updateAddress(Toaddress toAddress);

	/**
	 * 根据id查询收货地址
	 * @param addressId
	 * @return
	 */
	public Toaddress findAddressById(int addressId);
	
	/**
	 * 根据用户查询收货地址
	 * @param userAccount
	 * @return
	 */
	public List<Toaddress> findAddressByUser(String userAccount);
	

}
