package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.ILetterService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 站内信箱控制器
 * @author huhong
 *
 */
public class LetterAction extends ActionSupport{
	
	
	ILetterService letterService;
	public void setLetterService(ILetterService letterService) {
		this.letterService = letterService;
	}
	
	/**
	 * 新建一个站内信
	 * @return
	 */
	public String createLetter() {
		
		return null;
	}
	
	/**
	 * 更新一个站内信
	 * @return
	 */
	public String updateLetter() {
		
		return null;
	}
	
	/**
	 * 保存一个站内信至草稿箱
	 * @return
	 */
	public String saveLetter() {
		
		return null;
	}
	
	/**
	 * 发送站内信
	 * @return
	 */
	public String sendLetter() {
		
		return null;
	}
	
	/**
	 * 根据id查询站内信
	 * @return
	 */
	public String findLetterById() {
		
		return null;
	}
	
	/**
	 * 根据用户查询站内信
	 * @return
	 */
	public String findLetterByUser() {
		
		return null;
	}
	
	/**
	 * 根据草稿查询站内信
	 * @return
	 */
	public String findLetterByDraft() {
		
		return null;
	}
	
	/**
	 * 删除站内信
	 * @return
	 */
	public String removeLetter() {
		
		return null;
	}
}
