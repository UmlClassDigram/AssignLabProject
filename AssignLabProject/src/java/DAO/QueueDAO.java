/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaces.QueueInt;
import Pojo.Course;
import Pojo.Lab;
import Pojo.Trainee;
import Pojo.User;
import Pojo.UsersDelivery;
import java.util.List;

/**
 *
 * @author rania
 */
public class QueueDAO  extends GenericDAO {
    
    
    
 /*public List<Trainee>  createAssistanceQueue(Lab lab, Course course )
   {
     
         
       
       return
              
   }*/
    
    
    public void insertTraineeInDeliveryQueue(User user ,Lab lab)
    {
      beginTransaction();
        UsersDelivery usersDelivery=new  UsersDelivery();
        usersDelivery.setLab(lab);
            usersDelivery.setUser(user);
       user.getUsersDeliveries().add(usersDelivery);
        
    }
}
