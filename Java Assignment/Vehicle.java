package Inheritance;

 class Vehicle {
	 
	    String RegNumber;
	    String brand;
	    int speed;
	    double price;
	    String color;
	    
	    Vehicle() // Default Constructor

	    {
	        System.out.println("Vehicle Default Constructor Called");
	        RegNumber = "MH00XX0000";
	        brand = "Unknown";
	        speed = 0;
	        price = 0.0;
	        color = "White";
	    }
	    Vehicle(String regNumber, String brand, int speed, double price, String color)// Parameterized Constructor

	    {
	        System.out.println("Vehicle Parameterized Constructor Called");
	        this.RegNumber = regNumber;
	        this.brand = brand;
	        this.speed = speed;
	        this.price = price;
	        this.color = color;
	    }
		    String getRegNumber() {
			return RegNumber;
		}
		     void setRegNumber(String regNumber) {
			RegNumber = regNumber;
		}
		     String getBrand() {
			return brand;
		}
		    void setBrand(String brand) {
			this.brand = brand;
		}
		     int getSpeed() {
			return speed;
		}
		    void setSpeed(int speed) {
			this.speed = speed;
		}
		    double getPrice() {
			return price;
		}
		   void setPrice(double price) {
			this.price = price;
		}
		   String getColor() {
			return color;
		}
		   void setColor(String color) {
			this.color = color;
		}
		   void display() {
		        System.out.println("Registration Number: " +this.RegNumber);
		        System.out.println("Brand: " +this. brand);
		        System.out.println("Speed: " +this. speed);
		        System.out.println("Price: ₹" +this. price);
		        System.out.println("Color: " +this. color);
		    } 
		
         }//vehicle class ends here 
      class Car extends Vehicle
      {
    	    String fuelType;
    	    int capacity;
    	    boolean hasGear;
    	    boolean hasSunRoof;
    	    
    	    
    	    Car()//  Default Constructor
    	    {
    	        super(); 
    	        System.out.println("Car Default Constructor Called");
    	        this.fuelType = "Petrol";
    	        this.capacity = 5;
    	        this.hasGear = true;
    	        this.hasSunRoof = false;
    	    }
    	    Car(String regNumber, String brand, int speed, double price, String color,
    	    	    String fuelType, int capacity, boolean hasGear, boolean hasSunRoof)
    	        {
    	        	 super(regNumber, brand, speed, price, color);
    	             System.out.println("Car Parameterized Constructor Called");
    	             this.fuelType = fuelType;
    	             this.capacity = capacity;
    	             this.hasGear = hasGear;
    	             this.hasSunRoof = hasSunRoof;
    	         }
				    String getFuelType() {
					return fuelType;
				}
				   void setFuelType(String fuelType) {
					this.fuelType = fuelType;
				}
				   int getCapacity() {
					return capacity;
				}
				   void setCapacity(int capacity) {
					this.capacity = capacity;
				}
				   boolean isHasGear() {
					return hasGear;
				}
				   void setHasGear(boolean hasGear) {
					this.hasGear = hasGear;
				}
				   boolean isHasSunRoof() {
					return hasSunRoof;
				}
				   void setHasSunRoof(boolean hasSunRoof) {
					this.hasSunRoof = hasSunRoof;
				}
				   void display() {
				        super.display();
				        System.out.println("Fuel Type: " + this.fuelType);
				        System.out.println("Capacity: " + this.capacity);
				        System.out.println("Has Gear: " + this.hasGear);
				        System.out.println("Has Sunroof: " + this.hasSunRoof);
				    }
                   }// car class ends here
      
      class Bike extends Vehicle {
    	    String type;      
    	    boolean hasABS;
    	    boolean hasGear;

    	    Bike() // Default Constructor
    	    {
    	        super(); 
    	        System.out.println("Bike Default Constructor Called");
    	        this.type = "Commuter";
    	        this.hasABS = false;
    	        this.hasGear = true;
    	    }

    	    Bike(String regNumber, String brand, int speed, double price, String color,
    	         String type, boolean hasABS, boolean hasGear)// Parameterized Constructor
 
    	    {
    	        super(regNumber, brand, speed, price, color);
    	        System.out.println("Bike Parameterized Constructor Called");
    	        this.type = type;
    	        this.hasABS = hasABS;
    	        this.hasGear = hasGear;
    	    }

			  String getType() {
				return type;
			}

			  void setType(String type) {
				this.type = type;
			}

			 boolean isHasABS() {
				return hasABS;
			}

			 void setHasABS(boolean hasABS) {
				this.hasABS = hasABS;
			}

			 boolean isHasGear() {
				return hasGear;
			}

			 void setHasGear(boolean hasGear) {
				this.hasGear = hasGear;
			}
			 void display() {
			        super.display();
			        System.out.println("Type: " + this.type);
			        System.out.println("Has ABS: " + this.hasABS);
			        System.out.println("Has Gear: " + this.hasGear);
			    }
      }// bike class ends here
      class Truck extends Vehicle {
    	    double loadCapacity;     
    	    int noOfWheels;
    	    boolean hasTrailer;
    	    String fuelType;

    	    Truck()// Default Constructor

    	    {
    	        super(); 
    	        System.out.println("Truck Default Constructor Called");
    	        this.loadCapacity = 10000; 
    	        this.noOfWheels = 6;
    	        this.hasTrailer = false;
    	        this.fuelType = "Diesel";
    	    }

    	    Truck(String regNumber, String brand, int speed, double price, String color,
    	          double loadCapacity, int noOfWheels, boolean hasTrailer, String fuelType)// Parameterized Constructor
 
    	    {
    	        super(regNumber, brand, speed, price, color); 
    	        System.out.println("Truck Parameterized Constructor Called");
    	        this.loadCapacity = loadCapacity;
    	        this.noOfWheels = noOfWheels;
    	        this.hasTrailer = hasTrailer;
    	        this.fuelType = fuelType;
    	    }

			 double getLoadCapacity() {
				return loadCapacity;
			}

			 void setLoadCapacity(double loadCapacity) {
				this.loadCapacity = loadCapacity;
			}

			 int getNoOfWheels() {
				return noOfWheels;
			}

			 void setNoOfWheels(int noOfWheels) {
				this.noOfWheels = noOfWheels;
			}

			 boolean isHasTrailer() {
				return hasTrailer;
			}

			 void setHasTrailer(boolean hasTrailer) {
				this.hasTrailer = hasTrailer;
			}

			 String getFuelType() {
				return fuelType;
			}

			 void setFuelType(String fuelType) {
				this.fuelType = fuelType;
			}
			 void display() {
			        super.display();
			        System.out.println("Load Capacity: " + this.loadCapacity );
			        System.out.println("No. of Wheels: " + this.noOfWheels);
			        System.out.println("Has Trailer: " + this.hasTrailer);
			        System.out.println("Fuel Type: " + this.fuelType);
			    }
    	   
    	}// truck class end here
      class RegisterVehicle {
    	    public static void main(String[] args) {
    	        Car c1 = new Car();
    	        c1.display();

    	        System.out.println("\n\n");

    	        Car c2 = new Car("MH12AB1234", "Hyundai", 180, 900000, "Black", "Petrol", 5, true, true);
    	        c2.display();

    	        System.out.println("\n\n");

    	        Bike b1 = new Bike();
    	        b1.display();

    	        System.out.println("\n\n");

    	        Bike b2 = new Bike("MH26YZ9999", "Yamaha", 150, 120000, "Blue", "Sport", true, true);
    	        b2.display();

    	        System.out.println("\n\n");

    	        Truck t1 = new Truck();
    	        t1.display();

    	        System.out.println("\n\n");

    	        Truck t2 = new Truck("MH04TR8888", "Tata", 80, 2500000, "Red", 20000, 10, true, "Diesel");
    	        t2.display();
    	    }
    	}//RegisterVehicle class ends here



         

      
