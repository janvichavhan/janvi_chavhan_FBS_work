package Inheritance;

public class Electronic {

	    String brand;
	    double price;
	    int warranty;
	    String model;
	    String powerSource;
	    double weight;
	    String color;

	    Electronic()// Default Constructor
 
	    {
	        System.out.println("Electronics Default Constructor Called");
	        this.brand = "Unknown";
	        this.price = 0.0;
	        this.warranty = 1;
	        this.model = "Not Given";
	        this.powerSource = "AC";
	        this.weight = 0.0;
	        this.color = "Black";
	    }
	 // Parameterized Constructor
	    Electronic(String brand, double price, int warranty, String model, String powerSource, double weight, String color)// Parameterized Constructor

	    {
	        System.out.println("Electronics Parameterized Constructor Called");
	        this.brand = brand;
	        this.price = price;
	        this.warranty = warranty;
	        this.model = model;
	        this.powerSource = powerSource;
	        this.weight = weight;
	        this.color = color;
	    }
		 String getBrand() {
			return brand;
		}
		 void setBrand(String brand) {
			this.brand = brand;
		}
		 double getPrice() {
			return price;
		}
		 void setPrice(double price) {
			this.price = price;
		}
		 int getWarranty() {
			return warranty;
		}
		 void setWarranty(int warranty) {
			this.warranty = warranty;
		}
		 String getModel() {
			return model;
		}
		 void setModel(String model) {
			this.model = model;
		}
		 String getPowerSource() {
			return powerSource;
		}
		 void setPowerSource(String powerSource) {
			this.powerSource = powerSource;
		}
		 double getWeight() {
			return weight;
		}
		 void setWeight(double weight) {
			this.weight = weight;
		}
		 String getColor() {
			return color;
		}
		 void setColor(String color) {
			this.color = color;
		}
		 void display() {
		        System.out.println("Brand: " + this.brand);
		        System.out.println("Price: " + this.price);
		        System.out.println("Warranty: " + this.warranty);
		        System.out.println("Model: " + this.model);
		        System.out.println("Power Source: " + this.powerSource);
		        System.out.println("Weight: " + this.weight );
		        System.out.println("Color: " + this.color);
		    }
}//Electronic class ends here
class Laptop extends Electronic {
    String processor;
    int ram; 

    Laptop() //Default Constructor
    {
        super();
        System.out.println("Laptop Default Constructor Called");
        this.processor = "Intel i5";
        this.ram = 8;
        this.brand = "Generic Laptop";
    }

    Laptop(String brand, double price, int warranty, String model, String powerSource, double weight, String color,
           String processor, int ram)// Parameterized Constructor 
    {
        super(brand, price, warranty, model, powerSource, weight, color);
        System.out.println("Laptop Parameterized Constructor Called");
        this.processor = processor;
        this.ram = ram;
    }
     

     String getProcessor() {
		return processor;
	}

	 void setProcessor(String processor) {
		this.processor = processor;
	}

	 int getRam() {
		return ram;
	}

	 void setRam(int ram) {
		this.ram = ram;
	}

	void display() {
        super.display();
        System.out.println("Processor: " + this.processor);
        System.out.println("RAM: " + this.ram );
    }
}//Laptop class end here 

class Smartphone extends Electronic {
    String os;
    double screenSize; 

    Smartphone()//Default Constructor 
    {
        super();
        System.out.println("Smartphone Default Constructor Called");
        this.os = "Android";
        this.screenSize = 6.0;
        this.brand = "Generic Phone";
    }

    Smartphone(String brand, double price, int warranty, String model, String powerSource, double weight, String color,
               String os, double screenSize)//Parameterized Constructor 
    {
        super(brand, price, warranty, model, powerSource, weight, color);
        System.out.println("Smartphone Parameterized Constructor Called");
        this.os = os;
        this.screenSize = screenSize;
    }
      
     String getOs() {
		return os;
	}

	 void setOs(String os) {
		this.os = os;
	}

	 double getScreenSize() {
		return screenSize;
	}

	 void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	void display() {
        super.display();
        System.out.println("Operating System: " + this.os);
        System.out.println("Screen Size: " + this.screenSize + " inches");
    }
} // Smartphone class ends here
class DemoElectronics {
    public static void main(String[] args) {

        System.out.println("Laptop Default Constructor:");
        Laptop l1 = new Laptop();
        l1.display();
        System.out.println("\n");

        System.out.println("Laptop Parameterized Constructor:");
        Laptop l2 = new Laptop("Dell", 1200.0, 2, "Inspiron 15", "AC", 2.5, "Silver", "Intel i7", 16);
        l2.display();
        System.out.println("\n");

        System.out.println("Smartphone Default Constructor:");
        Smartphone s1 = new Smartphone();
        s1.display();
        System.out.println("\n");

        System.out.println("Smartphone Parameterized Constructor:");
        Smartphone s2 = new Smartphone("Samsung", 800.0, 1, "Galaxy S22", "Battery", 0.18, "Black", "Android", 6.5);
        s2.display();
    }
}// DemoElectronics class ends here


