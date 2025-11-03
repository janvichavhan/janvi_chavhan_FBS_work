class Book {
    String isbn;
    String bookName;
    String category;
    double price;

    
    void setIsbn(String i) {
        this.isbn = i;
    }

    void setBookName(String name) {
        this.bookName = name;
    }

    void setCategory(String c) {
        this.category = c;
    }

    void setPrice(double p) {
        this.price = p;
    }
} // Book class ends here


class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();  // object creation

        
        b1.setIsbn("978-93-325-1234-5");
        b1.setBookName("Java Programming");
        b1.setCategory("Education");
        b1.setPrice(499.50);

        
        System.out.println("Book Details: " +
                           "ISBN=" +"Name=" + b1.bookName + ", " +
                           "Category=" + b1.category + ", " +
                           "Price=" + b1.price);
    }//Main Class ens here
} // TestBook class ends here
