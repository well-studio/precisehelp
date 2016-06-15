package cn.wellstudio.precisehelp.service.impl;

import cn.wellstudio.precisehelp.dao.ILetterDAO;
import cn.wellstudio.precisehelp.entity.Letters;
import cn.wellstudio.precisehelp.service.ILetterService;

/**
 * 站内信业务实现
 * @author huhong
 *
 */
public class LetterService implements ILetterService {

	
	ILetterDAO letterDao;
	public void setLetterDao(ILetterDAO letterDao) {
		this.letterDao = letterDao;
	}
	
	
	public boolean createLetter(Letters letters) {
		
		boolean res = letterDao.createLetter(letters);
		
		return res;
	}

	public Letters findLettersById(int lettersId) {
		
		Letters letters = letterDao.findLettersById(lettersId);
		
		return letters;
	}

	public boolean saveLetter(Letters letters) {
		
		boolean res = letterDao.saveLetter(letters);
		
		return res;
	}

	public boolean sendLetter(Letters letters) {
		
		boolean res = letterDao.sendLetter(letters);
		
		return res;
	}

	public boolean updateLetter(Letters letters) {
		
		boolean res = letterDao.updateLetter(letters);
		
		return res;
	}

}
