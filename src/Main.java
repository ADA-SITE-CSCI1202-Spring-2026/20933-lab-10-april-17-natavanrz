import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Phone", 1800, true));
        list.add(new Product("Computer", 1500, true));
        list.add(new Product("Headphones", 600, true));

        Predicate<Product> isAffordable =
                p -> p.price < 50 && p.inStock;
        list.removeIf(p -> !isAffordable.test(p));
        for (Product p : list) {
            System.out.println(p);
        }
    }
}