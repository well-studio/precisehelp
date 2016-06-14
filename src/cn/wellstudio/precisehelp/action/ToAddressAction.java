package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.IToAddressService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 收货地址控制器
 * @author huhong
 *
 */
public class ToAddressAction extends ActionSupport{
	
	IToAddressService toAddressService;
	public void setToAddressService(IToAddressService toAddressService) {
		this.toAddressService = toAddressService;
	}
	
	/**
	 * 添加一个收货地址
	 * @return
	 */
	public String addAddress() {
		
		return null;
	}
	
	/**
	 * 删除一个收货地址
	 * @return
	 */
	public String removeAddress() {
		
		return null;
	}
	
	/**
	 * 更新一个收货地址
	 * @return
	 */
	public String updateAddress() {
		
		return null;
	}
	
	/**
	 * 根据id查询收货地址
	 * @return
	 */
	public String findAddressById() {
		
		return null;
	}
	
	
	/**
	 * 根据用户查询收货地址
	 * @return
	 */
	public String findAddressByUserw() {
		
		return null;
	}
}
