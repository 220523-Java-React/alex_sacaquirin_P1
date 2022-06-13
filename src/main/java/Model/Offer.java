package Model;

import java.io.Serializable;

public class Offer implements Serializable {
    private int amount;
    private int id;
    private int carId;
    private int userId;

   public Offer(){
   }
   public Offer(int amount, int userId, int carId, int id){
       this. amount = amount;
       this. userId = userId;
       this. carId = carId;
       this. id =  id;
   }
   public int getAmount(){
       return amount;
   }
   public void SetAmount(int amount){
       this.amount = amount;
   }
   public int getUserId(){
       return userId;
   }
   public void setUserId(int userId){
       this.userId = userId;
   }
   public int getCarId(){
       return carId;
   }
   public void setCarId(int carId){
       this.carId = carId;
   }

   public int id(){
       return id;
   }
   public void SetId(int id){
       this.id = id;
   }


}
