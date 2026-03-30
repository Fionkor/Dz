public class app {

     static void main(String[] args) {
         System.out.println("Shop-online for customers");
         orderNr1();
         System.out.println("===================");
         System.out.println("===================");
         orderNr2();

    }

    public static void orderNr1(){
        String part1_of_orderClient = "Order No ";
        int numberClient = 1;
        String part2_of_orderClient = " Client: Alice.";
        System.out.println(part1_of_orderClient + numberClient + part2_of_orderClient);


        String product = "smartphone.";
        System.out.println("Product: " + product);

        double price = 399.99;
        System.out.println("price EUR " + price);

        String adress = "Moon Street, ";
        int numberOfAdress = 10;
        System.out.println("Adress: " + adress + numberOfAdress);
    }

    public static void orderNr2(){
        String part1_of_orderClient = "Order No ";
        int numberClient = 2;
        String part2_of_orderClient = " Client: Tom.";
        System.out.println(part1_of_orderClient + numberClient + part2_of_orderClient);


        String product = "laptop.";
        System.out.println("Product: " + product);

        double price = 570.95;
        System.out.println("price EUR " + price);

        String adress = "Terra Street, ";
        int numberOfAdress = 17;
        System.out.println("Adress: " + adress + numberOfAdress);
    }
}
