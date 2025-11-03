class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    
    void setProductId(int id) {
        this.productId = id;
    }

    void setProductName(String name) {
        this.productName = name;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setQuantity(int q) {
        this.quantity = q;
    }
} // Product class ends here


class TestProduct {
    public static void main(String[] args) {
        Product p1;
        p1 = new Product(); 

        p1.setProductId(113);
        p1.setProductName("Laptop");
        p1.setPrice(55000.75);
        p1.setQuantity(3);

       
        System.out.println("Product Details: " +
                           "ID=" + p1.productId + ", " +
                           "Name=" + p1.productName + ", " +
                           "Price=" + p1.price + ", " +
                           "Quantity=" + p1.quantity);
    }//Main class ends here
} // TestProduct class ends here
