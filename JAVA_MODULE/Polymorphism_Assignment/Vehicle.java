package Polymorphism;

	class Vehicle {

	    String RegNumber;
	    String brand;
	    int speed;
	    double price;
	    String color;

	    Vehicle() {
	        System.out.println("Vehicle Default Constructor Called");
	        RegNumber = "MH00XX0000";
	        brand = "Unknown";
	        speed = 0;
	        price = 0.0;
	        color = "White";
	    }

	    Vehicle(String regNumber, String brand, int speed, double price, String color) {
	        System.out.println("Vehicle Parameterized Constructor Called");
	        this.RegNumber = regNumber;
	        this.brand = brand;
	        this.speed = speed;
	        this.price = price;
	        this.color = color;
	    }

	    public String getRegNumber() {
			return RegNumber;
		}

		public void setRegNumber(String regNumber) {
			RegNumber = regNumber;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		void applyBrake() {
	        System.out.println("Brake applied on Vehicle");
	    }

	    void display() {
	        System.out.println("Registration Number: " + RegNumber);
	        System.out.println("Brand: " + brand);
	        System.out.println("Speed: " + speed);
	        System.out.println("Price: ₹" + price);
	        System.out.println("Color: " + color);
	    }
	}

	class Car extends Vehicle {
	    String fuelType;
	    int capacity;
	    boolean hasGear;
	    boolean hasSunRoof;

	    Car() {
	        super();
	        System.out.println("Car Default Constructor Called");
	        this.fuelType = "Petrol";
	        this.capacity = 5;
	        this.hasGear = true;
	        this.hasSunRoof = false;
	    }

	    Car(String regNumber, String brand, int speed, double price, String color,
	        String fuelType, int capacity, boolean hasGear, boolean hasSunRoof) {
	        super(regNumber, brand, speed, price, color);
	        System.out.println("Car Parameterized Constructor Called");
	        this.fuelType = fuelType;
	        this.capacity = capacity;
	        this.hasGear = hasGear;
	        this.hasSunRoof = hasSunRoof;
	    }

	    
	    public String getFuelType() {
			return fuelType;
		}

		public void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public boolean isHasGear() {
			return hasGear;
		}

		public void setHasGear(boolean hasGear) {
			this.hasGear = hasGear;
		}

		public boolean isHasSunRoof() {
			return hasSunRoof;
		}

		public void setHasSunRoof(boolean hasSunRoof) {
			this.hasSunRoof = hasSunRoof;
		}

		void applyBrake() {
	        System.out.println("Brake applied on Car");
	    }

	    
	    void display() {
	        super.display();
	        System.out.println("Fuel Type: " + fuelType);
	        System.out.println("Capacity: " + capacity);
	        System.out.println("Has Gear: " + hasGear);
	        System.out.println("Has Sunroof: " + hasSunRoof);
	    }
	}

	class Bike extends Vehicle {
	    String type;
	    boolean hasABS;
	    boolean hasGear;

	    Bike() {
	        super();
	        System.out.println("Bike Default Constructor Called");
	        this.type = "Commuter";
	        this.hasABS = false;
	        this.hasGear = true;
	    }

	    Bike(String regNumber, String brand, int speed, double price, String color,
	         String type, boolean hasABS, boolean hasGear) {
	        super(regNumber, brand, speed, price, color);
	        System.out.println("Bike Parameterized Constructor Called");
	        this.type = type;
	        this.hasABS = hasABS;
	        this.hasGear = hasGear;
	    }

	    public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public boolean isHasABS() {
			return hasABS;
		}

		public void setHasABS(boolean hasABS) {
			this.hasABS = hasABS;
		}

		public boolean isHasGear() {
			return hasGear;
		}

		public void setHasGear(boolean hasGear) {
			this.hasGear = hasGear;
		}

		void applyBrake() {
	        System.out.println("Brake applied on Bike");
	    }

	    void display() {
	        super.display();
	        System.out.println("Type: " + type);
	        System.out.println("Has ABS: " + hasABS);
	        System.out.println("Has Gear: " + hasGear);
	    }
	}

	class Truck extends Vehicle {
	    double loadCapacity;
	    int noOfWheels;
	    boolean hasTrailer;
	    String fuelType;

	    Truck() {
	        super();
	        System.out.println("Truck Default Constructor Called");
	        this.loadCapacity = 10000;
	        this.noOfWheels = 6;
	        this.hasTrailer = false;
	        this.fuelType = "Diesel";
	    }

	    Truck(String regNumber, String brand, int speed, double price, String color,
	          double loadCapacity, int noOfWheels, boolean hasTrailer, String fuelType) {
	        super(regNumber, brand, speed, price, color);
	        System.out.println("Truck Parameterized Constructor Called");
	        this.loadCapacity = loadCapacity;
	        this.noOfWheels = noOfWheels;
	        this.hasTrailer = hasTrailer;
	        this.fuelType = fuelType;
	    }

	    public double getLoadCapacity() {
			return loadCapacity;
		}

		public void setLoadCapacity(double loadCapacity) {
			this.loadCapacity = loadCapacity;
		}

		public int getNoOfWheels() {
			return noOfWheels;
		}

		public void setNoOfWheels(int noOfWheels) {
			this.noOfWheels = noOfWheels;
		}

		public boolean isHasTrailer() {
			return hasTrailer;
		}

		public void setHasTrailer(boolean hasTrailer) {
			this.hasTrailer = hasTrailer;
		}

		public String getFuelType() {
			return fuelType;
		}

		public void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}

		void applyBrake() {
	        System.out.println("Brake applied on Truck");
	    }

	    
	    void display() {
	        super.display();
	        System.out.println("Load Capacity: " + loadCapacity);
	        System.out.println("No. of Wheels: " + noOfWheels);
	        System.out.println("Has Trailer: " + hasTrailer);
	        System.out.println("Fuel Type: " + fuelType);
	    }
	}

	class RegisterVehicle {
	    public static void main(String[] args) {
	        Vehicle vehicle;

	        vehicle = new Car("MH12AB1234", "Hyundai", 180, 900000, "Black", "Petrol", 5, true, true);
	        vehicle.display();
	        vehicle.applyBrake();

	        System.out.println("\n\n");

	        vehicle = new Bike("MH26YZ9999", "Yamaha", 150, 120000, "Blue", "Sport", true, true);
	        vehicle.display();
	        vehicle.applyBrake();

	        System.out.println("\n\n");

	        vehicle = new Truck("MH04TR8888", "Tata", 80, 2500000, "Red", 20000, 10, true, "Diesel");
	        vehicle.display();
	        vehicle.applyBrake();
	    }
	}


