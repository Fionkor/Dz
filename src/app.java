public class app {

    static void main(String[] args) {
        System.out.println("Shop-online for pokupatel");
        orderNr1();
        System.out.println();

        System.out.println("===================");
        System.out.println("===================");
        orderNr2();

    }

    public static void orderNr2(){
        double laptopCost = 625.53;
        double daySale = 35 * laptopCost;
        double sevenDaySale = 7 * daySale;
        System.out.printf("total sales for 7 days is EUR %.2f", sevenDaySale);
        System.out.println();
        System.out.printf("sales by day is EUR %.2f", daySale);
    }

    public static void orderNr1(){
        double laptopCost = 513.48;
        double daySale = 14 * laptopCost;
        double fiveDaySale = 5 * daySale;
        System.out.printf("total sales for 5 days is EUR %.2f", fiveDaySale);
        System.out.println();
        System.out.printf("sales by day is EUR %.2f", daySale);
    }
}