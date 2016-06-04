package cn.wellstudio.precisehelp.entity;

/**
 * 用户收货地址实体
 * @author huhong
 *
 */
public class Toaddress implements java.io.Serializable {

	// Fields

	private Integer addressId; // id
	private Users users; // 关联用户
	private String addressProvince; // 省份
	private String addressCity; // 城市
	private String addressArea; // 区域
	private String addressRoad; // 街道
	private String addressDetail; // 详细地址
	private String addressPostcode; // 邮编
	private String addressName; // 收货人姓名
	private String addressPhone; // 收货人电话号码

	// Constructors

	/** default constructor */
	public Toaddress() {
	}

	/** full constructor */
	public Toaddress(Users users, String addressProvince, String addressCity,
			String addressArea, String addressRoad, String addressDetail,
			String addressPostcode, String addressName, String addressPhone) {
		this.users = users;
		this.addressProvince = addressProvince;
		this.addressCity = addressCity;
		this.addressArea = addressArea;
		this.addressRoad = addressRoad;
		this.addressDetail = addressDetail;
		this.addressPostcode = addressPostcode;
		this.addressName = addressName;
		this.addressPhone = addressPhone;
	}

	// Property accessors

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getAddressProvince() {
		return this.addressProvince;
	}

	public void setAddressProvince(String addressProvince) {
		this.addressProvince = addressProvince;
	}

	public String getAddressCity() {
		return this.addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressArea() {
		return this.addressArea;
	}

	public void setAddressArea(String addressArea) {
		this.addressArea = addressArea;
	}

	public String getAddressRoad() {
		return this.addressRoad;
	}

	public void setAddressRoad(String addressRoad) {
		this.addressRoad = addressRoad;
	}

	public String getAddressDetail() {
		return this.addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getAddressPostcode() {
		return this.addressPostcode;
	}

	public void setAddressPostcode(String addressPostcode) {
		this.addressPostcode = addressPostcode;
	}

	public String getAddressName() {
		return this.addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddressPhone() {
		return this.addressPhone;
	}

	public void setAddressPhone(String addressPhone) {
		this.addressPhone = addressPhone;
	}

}