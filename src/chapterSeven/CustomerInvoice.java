package chapterSeven;

public class CustomerInvoice {
//
//    private  String name;
//    private String nameOfCashier;
//
//    private String item;
//
//    private int price;
//
//    private int pieces;
//
//    private double discount;
//    private double total;
//
//    private double subtotal;
//
//    List<CustomerInvoice> receipt  = new ArrayList<>();
//    public CustomerInvoice() {
//    }
//
//    public CustomerInvoice(String item, int pieces, int price, double total) {
//        this.item = item;
//        this.pieces = pieces;
//        this.price = price;
//        this.total = total;
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public void setNameOfCashier(String nameOfCashier) {
//        this.nameOfCashier = nameOfCashier;
//    }
//    public String getNameOfCashier() {
//        return nameOfCashier;
//    }
//
//    public  String requestFromCustomers(){
////        double total=0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is the customer`s name?");
//        name= scanner.next();
//
//
//
//        System.out.println("what did the user buy?");
//         item=scanner.next();
//
//        System.out.println("How many pieces?");
//        pieces= scanner.nextInt();
//
//        System.out.println("How much per unit?");
//        price = scanner.nextInt();
//
//
//        System.out.println("add more items?");
//        String answer = scanner.next();
//
//        CustomerInvoice invoice = new CustomerInvoice( item,pieces,price,total);
//        receipt.add(invoice);
//        for (int i =0;i<= receipt.size()-1;i++){
//            System.out.printf("%n%6s %6s %6s %6s%n", item,pieces,price,total);
////             System.out.println(receipt);
//        }
//
//
//        if (answer.equals("yes")){
//            requestFromCustomers();
//        }
//        else if (answer.equals("no")) {
//            System.out.println("What is your name?");
//            nameOfCashier= scanner.next();
//            System.out.println("How much discount will he get?");
//            discount = scanner.nextDouble();
//
//        }else {
//            System.out.println("invalid input");
//        }
//
//        for (int count =0; count < 9; count++){
//
//             total = price * pieces;
//            subtotal += price;
//
//        }
////
////        for (int count = 0;count < 9;count++){
////
////        }
//
//
//
//        String customerInfo = item+ "   " +pieces+ "     " + "    " +price+ "    "+total;
//        return customerInfo;
//
//    }
//    public  void printInvoice(){
////        Scanner scanner= new Scanner(System.in);
//        requestFromCustomers();
//
//        CustomerInvoice customerInvoice = new CustomerInvoice();
//        System.out.printf("%n%s%n","DORIS STORES");
//        System.out.printf("%n%s%n", "LOCATION: 312,HERBERT MACAULEY WAY,SABO YABA,LAGOS.");
//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("Date: "+formatter.format(now));
//
//        System.out.println("Cashier:" + nameOfCashier);
//
//        System.out.println("Customer Name: "+name);
//
//       for (int count=0;count<30; count++){
//           System.out.print("====");
//       }
//
//        System.out.printf("%n%6s %6s %6s %6s%n",            "ITEM","QTY","PRICE","TOTAL(NGN)");
//
//        for (int count=0;count<40; count++){
//            System.out.print("---");
//        }
//
//        for (int count=0;count<40; count++){
//            System.out.print("---");
//        }
//        System.out.printf("%n%10s","Sub Total:", subtotal);
//
//
//    }
//
//
//
//
//
//
//    public static void main(String[] args) {
//        CustomerInvoice invoice=new CustomerInvoice();
//        invoice.printInvoice();
////       invoice.requestFromCustomers();
//    }
//

//    private String customerName;
    private String item;
    private int quantity;
    private double price;
    private double totalPerItem;

    public CustomerInvoice() {
    }

    public CustomerInvoice(String item, int quantity, double price, double total) {
//        this.customerName = customerName;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        this.totalPerItem = total;
    }

//    public String getCustomerName() {
//        return customerName;
//    }

//    public void setCustomerName(String customerName) {
////        if (customerName.getClass().getName() != "String")
////            throw new IllegalArgumentException("Enter String only");
//        this.customerName = customerName;
//    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
//        if (item.getClass().getName() != "String")
//            throw new IllegalArgumentException("Enter String only");
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.totalPerItem = this.price * this.quantity;
    }

    public double getTotalPerItem() {
        return totalPerItem;
    }


//    public void setTotalPerItem() {
//        this.totalPerItem = price * quantity;
//    }
}
