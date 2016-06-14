package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IExpressService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 物流控制器
 * @author huhong
 *
 */
public class ExpressAction extends ActionSupport{
	
	
	IExpressService expressService;
	public void setExpressService(IExpressService expressService) {
		this.expressService = expressService;
	}
	
	/**
	 * 根据订单快递编号查询物流信息 - 第三方
	 * @return
	 */
	public String findExpressByOrder() {
		
		return null;
	}
	
	/**
	 * 添加物流信息
	 * @return
	 */
	public String addExpress() {
		
		return null;
	}
	
	/**
	 * 更新物流信息
	 * @return
	 */
	public String updateExpress() {
		
		return null;
	}
	
	
	
}
