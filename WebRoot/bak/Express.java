package cn.wellstudio.precisehelp.entity;

/**
 * 物流(快递)实体
 * @author huhong
 *
 */
public class Express {
	
	int express_id; // 物流id
	String express_kcom; // 快递公司名称
	String express_knum; // 快递单号
	String express_content; // 物流信息(第三方查询)
	
	
	public Express(){}


	public Express(int express_id, String express_kcom, String express_knum,
			String express_content) {
		super();
		this.express_id = express_id;
		this.express_kcom = express_kcom;
		this.express_knum = express_knum;
		this.express_content = express_content;
	}


	public int getExpress_id() {
		return express_id;
	}


	public void setExpress_id(int express_id) {
		this.express_id = express_id;
	}


	public String getExpress_kcom() {
		return express_kcom;
	}


	public void setExpress_kcom(String express_kcom) {
		this.express_kcom = express_kcom;
	}


	public String getExpress_knum() {
		return express_knum;
	}


	public void setExpress_knum(String express_knum) {
		this.express_knum = express_knum;
	}


	public String getExpress_content() {
		return express_content;
	}


	public void setExpress_content(String express_content) {
		this.express_content = express_content;
	}


	@Override
	public String toString() {
		return "Express [express_id=" + express_id + ", express_kcom="
				+ express_kcom + ", express_knum=" + express_knum
				+ ", express_content=" + express_content + "]";
	}
	
	
	
	
}
