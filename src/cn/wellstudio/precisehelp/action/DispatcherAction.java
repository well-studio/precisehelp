package cn.wellstudio.precisehelp.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 总转发类 提供nodejs接口（sgin=?）
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class DispatcherAction extends ActionSupport{
	
	static Map<Integer, String> signMap;
	
	private String sign;
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getSign() {
		return sign;
	}
	
	
	
	
	
	static {
		signMap = new HashMap<Integer, String>();
		signMap.put(0, "");
		signMap.put(1, "");
		signMap.put(2, "");
		signMap.put(3, "");
		signMap.put(4, "");
		signMap.put(5, "");
		signMap.put(6, "");
		signMap.put(7, "");
		signMap.put(8, "");
	}
	
	
	
	
	/**
	 * 内部转发
	 * @return
	 */
	public String doDis() {
		
		if(sign != null && sign != "") {
			
		}
		// signMap.get(key)
		
		return null;
	}
	
}
