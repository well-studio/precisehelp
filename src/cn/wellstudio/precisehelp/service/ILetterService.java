package cn.wellstudio.precisehelp.service;

import cn.wellstudio.precisehelp.entity.Letters;

/**
 * 站内信表业务接口
 * @author huhong
 *
 */
public interface ILetterService {
	/**
	 * 创建信
	 * @param letters
	 * @return
	 */
	public boolean createLetter(Letters letters);
	
	/**
	 * 更新信
	 * @param letters
	 * @return
	 */
	public boolean updateLetter(Letters letters);
	
	/**
	 * 保存信草稿
	 * @param letters
	 * @return
	 */
	public boolean saveLetter(Letters letters);
	
	/**
	 * 发送信
	 * @param letters
	 * @return
	 */
	public boolean sendLetter(Letters letters);
	
	/**
	 * 根据id查询信
	 * @param lettersId
	 * @return
	 */
	public Letters findLettersById(int lettersId);
	
}
