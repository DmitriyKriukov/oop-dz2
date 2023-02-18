public class Main {
    public static void main(String[] args) {
        VendingMachine vendy = new VendingMachine(10);
        vendy.add(new Product("Snickers", 12));
        vendy.add(new Product("Mars", 8));
        vendy.add(new Product("MilkyWay", 34));
        vendy.add(new Product("Twiks", 6));
        try {
            System.out.println(vendy.getProductByCost(34));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(vendy.getProductByName("Snickers"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}