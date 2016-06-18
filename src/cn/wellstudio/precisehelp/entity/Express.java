package cn.wellstudio.precisehelp.entity;


/**
 * 物流表
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Express  implements java.io.Serializable {


    // Fields    
 	private Integer expressId; // 物流id
 	private String expressKcom; // 物流快递公司
 	private String expressKnum; // 物流快递单号
 	private String expressContent; // 物流具体内容
 	private OrderDoing orderDoing;// 正在进行的订单
 	private OrderDone orderDone; // 处理完的订单
 	
    // Constructors

    /** default constructor */
    public Express() {
    }

    
    /** full constructor */
    public Express(String expressKcom, String expressKnum, String expressContent) {
        this.expressKcom = expressKcom;
        this.expressKnum = expressKnum;
        this.expressContent = expressContent;
    }

   
    // Property accessors

    public Integer getExpressId() {
        return this.expressId;
    }
    
    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public String getExpressKcom() {
        return this.expressKcom;
    }
    
    public void setExpressKcom(String expressKcom) {
        this.expressKcom = expressKcom;
    }

    public String getExpressKnum() {
        return this.expressKnum;
    }
    
    public void setExpressKnum(String expressKnum) {
        this.expressKnum = expressKnum;
    }

    public String getExpressContent() {
        return this.expressContent;
    }
    
    public void setExpressContent(String expressContent) {
        this.expressContent = expressContent;
    }


	public OrderDoing getOrderDoing() {
		return orderDoing;
	}


	public void setOrderDoing(OrderDoing orderDoing) {
		this.orderDoing = orderDoing;
	}


	public OrderDone getOrderDone() {
		return orderDone;
	}


	public void setOrderDone(OrderDone orderDone) {
		this.orderDone = orderDone;
	}


	@Override
	public String toString() {
		return "Express [expressId=" + expressId + ", expressKcom="
				+ expressKcom + ", expressKnum=" + expressKnum
				+ ", expressContent=" + expressContent + "]";
	}
   
    

}