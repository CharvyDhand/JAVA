import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Product {
    int id;
    String name;
    double price;
    String category;
    Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class HardLevel {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 80000, "Electronics"),
            new Product(2, "Mobile", 30000, "Electronics"),
            new Product(3, "Office Chair", 12000, "Furniture"),
            new Product(4, "Table", 7000, "Furniture"),
            new Product(5, "Headphones", 5000, "Electronics"),
            new Product(6, "Sofa", 25000, "Furniture")
        );
        Map<String, Optional<Product>> mostExpensive =
            products.stream().collect(groupingBy(
                p -> p.category,
                maxBy(Comparator.comparingDouble(p -> p.price))
            ));
        double avgPrice = products.stream().collect(averagingDouble(p -> p.price));
        System.out.println("Most Expensive Product in Each Category:");
        mostExpensive.forEach((category, product) ->
            System.out.println(category + " → Most Expensive: " + product.get().name + " (₹" + product.get().price + ")"));
        System.out.println("Average Price of All Products: ₹" + avgPrice);
    }
}
