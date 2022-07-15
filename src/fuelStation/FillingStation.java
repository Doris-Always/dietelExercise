package fuelStation;

public class FillingStation {


   private double fuelPricePerLitre = 200;

   private double discountPercentPerLitre;
   private  double amountAfterDiscount;
   private double discountAmount;
   private double actualPrice;
  private int numberOfLitre;



   private String location;


   public void checkLocation(String location) {
      this.location = location;

   }

   public String getLocation(){
      return location;
   }
   public void setLitre(int numberOfLitre){
       this.numberOfLitre = numberOfLitre;
   }

   public int getNumberOfLitre() {
       return numberOfLitre;
   }

   public void calculateDiscountPercentage(double numberOfLitre,double fuelPricePerLitre){


        discountPercentPerLitre = (numberOfLitre * fuelPricePerLitre) / 100;


   }

   public double getDiscountPercentage(){
       return discountPercentPerLitre;
   }


    public double setActualPrice(){

       this.actualPrice = (numberOfLitre * fuelPricePerLitre) -getDiscountPercentage();


        return actualPrice;
    }
}
