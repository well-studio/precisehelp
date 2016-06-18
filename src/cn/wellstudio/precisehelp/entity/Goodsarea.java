package cn.wellstudio.precisehelp.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 产地实体
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Goodsarea  implements java.io.Serializable {


    // Fields    

	private Integer areaId; // 产地id
	private String areaName; // 产地名称
	private String areaLocation; // 产地具体地址
	private String areaStat; // 产地描述
	private List<Goodsinfo> goodsinfos = new ArrayList<Goodsinfo>(); // 商品信息集合


    // Constructors

    /** default constructor */
    public Goodsarea() {
    }

    
    /** full constructor */
    public Goodsarea(String areaName, String areaLocation, String areaStat) {
        this.areaName = areaName;
        this.areaLocation = areaLocation;
        this.areaStat = areaStat;
    }

   
    // Property accessors

    public Integer getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return this.areaName;
    }
    
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaLocation() {
        return this.areaLocation;
    }
    
    public void setAreaLocation(String areaLocation) {
        this.areaLocation = areaLocation;
    }

    public String getAreaStat() {
        return this.areaStat;
    }
    
    public void setAreaStat(String areaStat) {
        this.areaStat = areaStat;
    }


	public List<Goodsinfo> getGoodsinfos() {
		return goodsinfos;
	}


	public void setGoodsinfos(List<Goodsinfo> goodsinfos) {
		this.goodsinfos = goodsinfos;
	}


	@Override
	public String toString() {
		return "Goodsarea [areaId=" + areaId + ", areaName=" + areaName
				+ ", areaLocation=" + areaLocation + ", areaStat=" + areaStat
				+ "]";
	}
    

}