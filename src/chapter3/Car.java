package chapter3;

public class Car {

    private String model;
    private  String year;
    private  double price;


    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0){
        this.price = price;}
        else {throw new ArithmeticException("price is less than zero");}
    }

    public double displayPrice() {
        price= getPrice();
        System.out.printf("%s %f", "price is ", price);
        return price;
    }

    public double withDiscount(double discount) {
        double newPrice=price-(discount*getPrice());
        System.out.println();
        System.out.printf("%s %f", "price with discount is ", newPrice);
        return newPrice;
    }
}
