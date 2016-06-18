package cn.wellstudio.precisehelp.entity;



/**
 * 收货地址实体
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Toaddress  implements java.io.Serializable {


    // Fields    
 	private Integer addressId; // 地址id
 	private String addressProvince; // 省份
 	private String addressCity; // 城市
 	private String addressArea; // 区域
 	private String addressRoad; // 街道
 	private String addressDetail; // 地址详情
 	private String addressPostcode; // 邮编
 	private String addressName; // 收货地址人姓名
 	private String addressPhone; // 收货地址人电话
 	private String userId;
 	private Users users; // 用户
    // Constructors

    /** default constructor */
    public Toaddress() {
    }

    
    /** full constructor */
    public Toaddress(String addressProvince, String addressCity, String addressArea, String addressRoad, String addressDetail, String addressPostcode, String addressName, String addressPhone, String userId) {
        this.addressProvince = addressProvince;
        this.addressCity = addressCity;
        this.addressArea = addressArea;
        this.addressRoad = addressRoad;
        this.addressDetail = addressDetail;
        this.addressPostcode = addressPostcode;
        this.addressName = addressName;
        this.addressPhone = addressPhone;
        this.userId = userId;
    }

   
    // Property accessors

    public Integer getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "Toaddress [addressId=" + addressId + ", addressProvince="
				+ addressProvince + ", addressCity=" + addressCity
				+ ", addressArea=" + addressArea + ", addressRoad="
				+ addressRoad + ", addressDetail=" + addressDetail
				+ ", addressPostcode=" + addressPostcode + ", addressName="
				+ addressName + ", addressPhone=" + addressPhone + ", userId="
				+ userId + "]";
	}
    

}