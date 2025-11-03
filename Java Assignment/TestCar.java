class Car {
    String model;
    String brand;
    double price;
    String color;
    String fuelType;
    int capacity;

    void setModel(String m) {
        this.model = m;
    }

    void setBrand(String b) {
        this.brand = b;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setColor(String c) {
        this.color = c;
    }

    void setFuelType(String f) {
        this.fuelType = f;
    }

    void setCapacity(int cap) {
        this.capacity = cap;
    }
} // Car class ends here


class TestCar {
    public static void main(String[] args) {
        Car c1;
        c1 = new Car();  

        c1.setModel("Swift");
        c1.setBrand("Maruti Suzuki");
        c1.setPrice(850000.00);
        c1.setColor("Red");
        c1.setFuelType("Petrol");
        c1.setCapacity(5);

        
        System.out.println("Car Details: " +
                           "Model=" + c1.model + ", " +
                           "Brand=" + c1.brand + ", " +
                           "Price=" + c1.price + ", " +
                           "Color=" + c1.color + ", " +
                           "Fuel Type=" + c1.fuelType + ", " +
                           "Capacity=" + c1.capacity + " persons");
    }//Main Class ends here
} // TestCar class ends here
