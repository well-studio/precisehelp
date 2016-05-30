package cn.wellstudio.precisehelp.entity;

/**
 * 收货地址实体
 * @author huhong
 *
 */
public class ToAddress {
	
	int address_id; // 收货地址id
	String address_province; // 省份
	String address_city; // 城市
	String address_area; // 区
	String address_road; // 街道
	String address_detail; // 详细地址
	String address_postcode; // 邮编
	String address_name; // 收货人姓名
	String address_phone; // 收货人手机号码
	User user;
	
	public ToAddress(){}

	public ToAddress(int address_id, String address_province,
			String address_city, String address_area, String address_road,
			String address_detail, String address_postcode,
			String address_name, String address_phone, User user) {
		super();
		this.address_id = address_id;
		this.address_province = address_province;
		this.address_city = address_city;
		this.address_area = address_area;
		this.address_road = address_road;
		this.address_detail = address_detail;
		this.address_postcode = address_postcode;
		this.address_name = address_name;
		this.address_phone = address_phone;
		this.user = user;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getAddress_province() {
		return address_province;
	}

	public void setAddress_province(String address_province) {
		this.address_province = address_province;
	}

	public String getAddress_city() {
		return address_city;
	}

	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}

	public String getAddress_area() {
		return address_area;
	}

	public void setAddress_area(String address_area) {
		this.address_area = address_area;
	}

	public String getAddress_road() {
		return address_road;
	}

	public void setAddress_road(String address_road) {
		this.address_road = address_road;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}

	public String getAddress_postcode() {
		return address_postcode;
	}

	public void setAddress_postcode(String address_postcode) {
		this.address_postcode = address_postcode;
	}

	public String getAddress_name() {
		return address_name;
	}

	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}

	public String getAddress_phone() {
		return address_phone;
	}

	public void setAddress_phone(String address_phone) {
		this.address_phone = address_phone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ToAddress [address_id=" + address_id + ", address_province="
				+ address_province + ", address_city=" + address_city
				+ ", address_area=" + address_area + ", address_road="
				+ address_road + ", address_detail=" + address_detail
				+ ", address_postcode=" + address_postcode + ", address_name="
				+ address_name + ", address_phone=" + address_phone + ", user="
				+ user + "]";
	}
	
	
	
}
