package cn.wellstudio.precisehelp.entity;

/**
 * Toaddress entity. @author MyEclipse Persistence Tools
 */

public class Toaddress implements java.io.Serializable {

	// Fields

	private Integer addressId;
	private Users users;
	private String addressProvince;
	private String addressCity;
	private String addressArea;
	private String addressRoad;
	private String addressDetail;
	private String addressPostcode;
	private String addressName;
	private String addressPhone;

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