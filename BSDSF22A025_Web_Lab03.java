import java.util.Scanner;
import java.time.LocalDate;

interface Product {
    double calculatePrice();
    String getDetails();
    boolean checkStock();  
}

class BaseProduct implements Product {
    protected String name;
    protected double price;
    protected int stock;

    public BaseProduct(String name, double price, int stock) throws Exception {
        if (price < 0) {
            throw new Exception("Price cannot be negative");
        }
        if (stock < 0) {
            throw new Exception("Stock cannot be negative");
        }
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String getDetails() {
        return "Name: " + name + ", Price: " + price + ", Stock: " + stock;
    }

    @Override
    public boolean checkStock() {
        return stock > 0;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}

class Electronics extends BaseProduct {
    private int warrantyMonths;

    public Electronics(String name, double price, int stock, int warrantyMonths) throws Exception {
        super(name, price, stock);
        this.warrantyMonths = warrantyMonths;

        if (price > 1000) {
            this.price *= 0.9;
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Warranty: " + warrantyMonths + " months";
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}

class Clothing extends BaseProduct {
    private String size;
    private String material;

    public Clothing(String name, double price, int stock, String size, String material) throws Exception {
        super(name, price, stock);
        this.size = size;
        this.material = material;

        if (stock < 5) {
            this.price *= 0.95;
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Size: " + size + ", Material: " + material;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}

class Groceries extends BaseProduct {
    private LocalDate expirationDate;

    public Groceries(String name, double price, int stock, LocalDate expirationDate) throws Exception {
        super(name, price, stock);
        this.expirationDate = expirationDate;

        if (expirationDate.isBefore(LocalDate.now())) {
            throw new Exception("Product is expired and cannot be added.");
        }

        if (stock > 5) {
            this.price *= 0.92;
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Expiration Date: " + expirationDate;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}

class Books extends BaseProduct {
    private String author;

    public Books(String name, double price, int stock, String author) throws Exception {
        super(name, price, stock);
        this.author = author;

        if (price > 50) {
            this.price *= 0.93;
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Author: " + author;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}

public class BSDSF22A025_Web_Lab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the product type(Electronics, Clothing, Groceries, Books): ");
            String productType = scanner.nextLine().toLowerCase();

            System.out.print("Enter the product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter the stock: ");
            int stock = scanner.nextInt();
            scanner.nextLine();

            Product product = null;

            switch (productType) {
                case "electronics":
                    System.out.println("Enter warranty months: ");
                    int warranty = scanner.nextInt();
                    product = new Electronics(name, price, stock, warranty);
                    break;

                case "clothing":
                    System.out.println("Enter size (S, M, L, XL): ");
                    String size = scanner.nextLine();
                    System.out.println("Enter material (e.g., Cotton, Polyester): ");
                    String material = scanner.nextLine();
                    product = new Clothing(name, price, stock, size, material);
                    break;

                case "groceries":
                    System.out.println("Enter expiration date (yyyy-mm-dd): ");
                    String expirationDateString = scanner.nextLine();
                    LocalDate expirationDate = LocalDate.parse(expirationDateString);
                    product = new Groceries(name, price, stock, expirationDate);
                    break;

                case "books":
                    System.out.println("Enter author name: ");
                    String author = scanner.nextLine();
                    product = new Books(name, price, stock, author);
                    break;

                default:
                    System.out.println("Invalid product type!");
                    return;
            }
            System.out.println("Product Details: " + product.getDetails());
            if (product.checkStock()) {
                System.out.println("Final Price: " + product.calculatePrice());
            } else {
                System.out.println("Sorry, the product is out of stock.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Product processing complete.");
        }

        scanner.close();
    }
}
