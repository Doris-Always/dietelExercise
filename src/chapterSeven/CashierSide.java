package chapterSeven;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CashierSide {
    //    TODO: collect customer name
//    TODO: collect item name
//    TODO: collect item quantity
//    TODO: collect item price
//    TODO: collect cashier name
//    TODO: apply VAT and discount
//    TODO: print invoice
    private String cashierName;
    private String customerName;
    private double discount;

    private double valueAddedTax = 7.50;
    private double bill;

    private double amountPaid;
    Scanner scanner = new Scanner(System.in);
    private static List<CustomerInvoice> listOfItems = new ArrayList<>();
    private double totalPrice = 0.0;



    public static void main(String[] args) {
        CashierSide cashier = new CashierSide();

        cashier.collectOrderDetails();
        System.out.println(cashier.invoiceIntro());
        System.out.println(cashier.printInvoice());
        System.out.println(cashier.printOtherOutput());

    }

    public void collectOrderDetails() {
        this.customerName = inputHelper("What is the customer's name?");
        collectItemDetails();
        this.cashierName = inputHelper("What is the cashier's name?");
        this.discount = secondInputHelper();
        this.amountPaid = thirdInputHelper();
    }

    public String inputHelper(String s) {
        System.out.println(s);
        return scanner.next();
    }
    public double secondInputHelper(){
        System.out.println("How much is the Discount?");
        return scanner.nextDouble();
    }
    public double thirdInputHelper(){
        System.out.println("How much did the customer give you?");
        return scanner.nextDouble();
    }
    //A METHOD THAT PRINTS THE HEADER OF THE INVOICE
    public String invoiceIntro() {
        StringBuilder intro = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        intro
                .append("DORIS STORES\n")
                .append("LOCATION : 312,HERBERT MACAULEY WAY,SABO YABA,LAGOS.\n")
                .append("Date : ").append(formatter.format(now))
                .append("\nCashier : ").append(cashierName)
                .append("\nCustomer Name : ").append(customerName)
                .append("\n")
                .append(dashRepeater("===", 30))
                .append(String.format("%n%s%n", header()))
                .append(dashRepeater("---", 30));


        return intro.toString();
    }

    private String dashRepeater(String dashFormat, int numberOfRepetition) {
        return dashFormat.repeat(numberOfRepetition);
    }

    public String header(){
        return "ITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)";
    }
    // A METHOD THAT OUTPUT AFTER INTRO
    private String printOtherOutput(){
        StringBuilder output = new StringBuilder();
        output
                .append(dashRepeater("---", 30))
                .append("\nSub Total:\t ").append(calculateSubTotal())
                .append("\nDiscount:\t").append( inputDiscount())
                .append("\nVAT @17.50%:\t").append(calculateVAT())
                .append("\n")
                .append(dashRepeater("---", 30))
                .append("\nBill Total:\t").append(calculateBill())
                .append("\nAmount Paid:").append(getAmountPaid());
        return output.toString();
    }

    private double inputDiscount(){
        return discount;
    }
    private double calculateSubTotal(){

        return totalPrice;
    }

    private double calculateVAT(){
        this.valueAddedTax = (valueAddedTax * calculateSubTotal())/100;
        return valueAddedTax;
    }

    private double calculateBill(){
        this.bill =  calculateSubTotal() + calculateVAT() - inputDiscount();
        return bill;
    }
    private double getAmountPaid(){

        return amountPaid;
    }
    //A METHOD THAT LOOPS THROUGH THE ARRAY OF CUSTOMER PURCHASE
    public String printInvoice() {

        StringBuilder invoice = new StringBuilder();
        for (CustomerInvoice listOfItem : listOfItems) {
            invoice
                    .append(listOfItem.getItem()).append("\t\t")
                    .append(listOfItem.getQuantity()).append("\t\t")
                    .append(listOfItem.getPrice()).append("\t\t")
                    .append(listOfItem.getTotalPerItem()).append("\t\t")
                    .append("\n");

        }
        return invoice.toString();
    }
    //A METHOD THAT COLLECTS ITEM BOUGHT BY CUSTOMER
    private void collectItemDetails() {
        CustomerInvoice invoice = new CustomerInvoice();

        System.out.println("What did the user buy?");
        invoice.setItem(scanner.next());

        System.out.println("How many pieces?");
        int quantity = scanner.nextInt();
        invoice.setQuantity(quantity);

        System.out.println("How much per unit?");
        double price = scanner.nextDouble();
        invoice.setPrice(price);

        listOfItems.add(invoice);
        totalPrice += invoice.getTotalPerItem();

        System.out.println("Do you want to add more?\nEnter y/n");
        String response = scanner.next();

        if (response.toLowerCase().equals("y")) {
            collectItemDetails();
        }
//        else if (response.toLowerCase().equals("n")) {
//            this.cashierName = inputHelper("What is the cashier's name?");
//        }
    }

}
