package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;


/**
 * 用户收藏
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Usersfavorite  implements java.io.Serializable {


    // Fields    

     private UsersfavoriteId id;
     private Timestamp addTime;


    // Constructors

    /** default constructor */
    public Usersfavorite() {
    }

	/** minimal constructor */
    public Usersfavorite(UsersfavoriteId id) {
        this.id = id;
    }
    
    /** full constructor */
    public Usersfavorite(UsersfavoriteId id, Timestamp addTime) {
        this.id = id;
        this.addTime = addTime;
    }

   
    // Property accessors

    public UsersfavoriteId getId() {
        return this.id;
    }
    
    public void setId(UsersfavoriteId id) {
        this.id = id;
    }

    public Timestamp getAddTime() {
        return this.addTime;
    }
    
    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }
   








}