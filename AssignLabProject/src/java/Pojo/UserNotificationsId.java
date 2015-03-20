package Pojo;
// Generated Mar 19, 2015 8:46:14 AM by Hibernate Tools 3.6.0



/**
 * UserNotificationsId generated by hbm2java
 */
public class UserNotificationsId  implements java.io.Serializable {


     private int userSenderId;
     private int userRecieverId;

    public UserNotificationsId() {
    }

    public UserNotificationsId(int userSenderId, int userRecieverId) {
       this.userSenderId = userSenderId;
       this.userRecieverId = userRecieverId;
    }
   
    public int getUserSenderId() {
        return this.userSenderId;
    }
    
    public void setUserSenderId(int userSenderId) {
        this.userSenderId = userSenderId;
    }
    public int getUserRecieverId() {
        return this.userRecieverId;
    }
    
    public void setUserRecieverId(int userRecieverId) {
        this.userRecieverId = userRecieverId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserNotificationsId) ) return false;
		 UserNotificationsId castOther = ( UserNotificationsId ) other; 
         
		 return (this.getUserSenderId()==castOther.getUserSenderId())
 && (this.getUserRecieverId()==castOther.getUserRecieverId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserSenderId();
         result = 37 * result + this.getUserRecieverId();
         return result;
   }   


}


