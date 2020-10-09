import java.util.*;

class Product implements Comparable<Product> {
    private final String name;
    private final double price;
    private final double discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Double getDiscountPrice() {
        return price * discount / 100;
    }

    @Override
    public int compareTo(Product other) {
        return this.getDiscountPrice().compareTo(other.getDiscountPrice());
    }

    @Override
    public String toString() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            String[] inputs = scanner.next().split(",");
            String name = inputs[0];
            double price = Double.parseDouble(inputs[1]);
            double discount = Double.parseDouble(inputs[2]);

            Product product = new Product(name, price, discount);
            products.add(product);
        }

        products.stream()
                .filter((product) -> product.getDiscountPrice().equals(Collections.min(products).getDiscountPrice()))
                .forEach(System.out::println);
    }
}
