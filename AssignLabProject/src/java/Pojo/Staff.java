package Pojo;
// Generated Mar 20, 2015 7:49:03 PM by Hibernate Tools 3.6.0



/**
 * Staff generated by hbm2java
 */
public class Staff  implements java.io.Serializable {


     private Integer idStaff;
     private User user;
     private int isAdmin;
     private int position;

    public Staff() {
    }

    public Staff(User user, int isAdmin, int position) {
       this.user = user;
       this.isAdmin = isAdmin;
       this.position = position;
    }
   
    public Integer getIdStaff() {
        return this.idStaff;
    }
    
    public void setIdStaff(Integer idStaff) {
        this.idStaff = idStaff;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public int getIsAdmin() {
        return this.isAdmin;
    }
    
    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
    public int getPosition() {
        return this.position;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }




}


