import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int maxCapasity;
    private List<Product> list = new ArrayList<>();

    public VendingMachine(int maxCapasity, List<Product> list) {
        this.maxCapasity = maxCapasity;
        this.list = list;
    }

    public VendingMachine(int maxCapasity) {
        this.maxCapasity = maxCapasity;
    }

    public void add(Product product) {
        if (list.size() < maxCapasity) {
            list.add(product);
        } else {
            System.out.println("The vending machine is full, you cannot add products");
        }
    }
    public Product getProductByCost(double price) throws Exception{
        for (Product product: list) {
            if (product.getPrice() == price){
                return product;
            }

        }
        throw new Exception("I didn't find anything");
    }

    public Product getProductByName(String name) throws Exception{
        for (Product product: list) {
            if (product.getName().equals(name)){
                return product;
            }

        }
        throw new Exception("I didn't find anything");
    }
}
