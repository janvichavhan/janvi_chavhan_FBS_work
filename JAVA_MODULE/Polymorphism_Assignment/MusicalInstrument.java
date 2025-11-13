package Polymorphism;


	public class MusicalInstrument {

	    String name;
	    String type;
	    String originCountry;
	    String material;
	    double price;
	    String brand;
	    boolean isElectric;

	    // Default Constructor
	    MusicalInstrument() {
	        System.out.println("Default MusicalInstrument Constructor Called");
	        this.name = "Unknown";
	        this.type = "Not Specified";
	        this.originCountry = "Unknown";
	        this.material = "Not Specified";
	        this.price = 0.0;
	        this.brand = "Generic";
	        this.isElectric = false;
	    }

	    // Parameterized Constructor
	    MusicalInstrument(String name, String type, String originCountry, String material,
	                      double price, String brand, boolean isElectric) {
	        System.out.println("Parameterized MusicalInstrument Constructor Called");
	        this.name = name;
	        this.type = type;
	        this.originCountry = originCountry;
	        this.material = material;
	        this.price = price;
	        this.brand = brand;
	        this.isElectric = isElectric;
	    }

	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getOriginCountry() {
			return originCountry;
		}

		public void setOriginCountry(String originCountry) {
			this.originCountry = originCountry;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public boolean isElectric() {
			return isElectric;
		}

		public void setElectric(boolean isElectric) {
			this.isElectric = isElectric;
		}

	    void playSound() {
	        System.out.println("The instrument produces a pleasant sound.");
	    }

	    void display() {
	        System.out.println("Instrument Name: " + name);
	        System.out.println("Type: " + type);
	        System.out.println("Origin Country: " + originCountry);
	        System.out.println("Material: " + material);
	        System.out.println("Price: ₹" + price);
	        System.out.println("Brand: " + brand);
	        System.out.println("Electric: " + isElectric);
	    }
	}// MusicalInstrument class end here


	class Guitar extends MusicalInstrument {
	    String guitarType;
	    String shape;
	    boolean hasAmplifier;
	    String pickupType;
	    int fretCount;
	    String woodType;

	    Guitar() {
	        super();
	        System.out.println("Guitar Default Constructor Called");
	        this.guitarType = "Acoustic";
	        this.shape = "Dreadnought";
	        this.hasAmplifier = false;
	        this.pickupType = "None";
	        this.fretCount = 20;
	        this.woodType = "Rosewood";
	    }

	    Guitar(String name, String type, String originCountry, String material, double price, String brand, boolean isElectric,
	           String guitarType, String shape, boolean hasAmplifier, String pickupType, int fretCount, String woodType) {

	        super(name, type, originCountry, material, price, brand, isElectric);
	        System.out.println("Guitar Parameterized Constructor Called");
	        this.guitarType = guitarType;
	        this.shape = shape;
	        this.hasAmplifier = hasAmplifier;
	        this.pickupType = pickupType;
	        this.fretCount = fretCount;
	        this.woodType = woodType;
	    }  
	        

	    public String getGuitarType() {
			return guitarType;
		}

		public void setGuitarType(String guitarType) {
			this.guitarType = guitarType;
		}

		public String getShape() {
			return shape;
		}

		public void setShape(String shape) {
			this.shape = shape;
		}

		public boolean isHasAmplifier() {
			return hasAmplifier;
		}

		public void setHasAmplifier(boolean hasAmplifier) {
			this.hasAmplifier = hasAmplifier;
		}

		public String getPickupType() {
			return pickupType;
		}

		public void setPickupType(String pickupType) {
			this.pickupType = pickupType;
		}

		public int getFretCount() {
			return fretCount;
		}

		public void setFretCount(int fretCount) {
			this.fretCount = fretCount;
		}

		public String getWoodType() {
			return woodType;
		}

		public void setWoodType(String woodType) {
			this.woodType = woodType;
		}

		void playSound() {
	        System.out.println("Guitar strums a melodious tune!");
	    }

	    void display() {
	        super.display();
	        System.out.println("Guitar Type: " + guitarType);
	        System.out.println("Shape: " + shape);
	        System.out.println("Has Amplifier: " + hasAmplifier);
	        System.out.println("Pickup Type: " + pickupType);
	        System.out.println("Fret Count: " + fretCount);
	        System.out.println("Wood Type: " + woodType);
	    }
	}// Guitar class ends here


	class Flute extends MusicalInstrument {
	    String fluteType;
	    int noOfHoles;
	    String key;
	    boolean isTunable;

	    Flute() {
	        super();
	        System.out.println("Flute Default Constructor Called");
	        this.fluteType = "Bansuri";
	        this.noOfHoles = 7;
	        this.key = "C";
	        this.isTunable = false;
	    }

	    Flute(String name, String type, String originCountry, String material, double price, String brand, boolean isElectric,
	          String fluteType, int noOfHoles, String key, boolean isTunable) {

	        super(name, type, originCountry, material, price, brand, isElectric);
	        System.out.println("Flute Parameterized Constructor Called");
	        this.fluteType = fluteType;
	        this.noOfHoles = noOfHoles;
	        this.key = key;
	        this.isTunable = isTunable;
	    }
              
	    public String getFluteType() {
			return fluteType;
		}

		public void setFluteType(String fluteType) {
			this.fluteType = fluteType;
		}

		public int getNoOfHoles() {
			return noOfHoles;
		}

		public void setNoOfHoles(int noOfHoles) {
			this.noOfHoles = noOfHoles;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public boolean isTunable() {
			return isTunable;
		}

		public void setTunable(boolean isTunable) {
			this.isTunable = isTunable;
		}

		void playSound() {
	        System.out.println(" Flute plays a soothing, airy melody!");
	    }

	    void display() {
	        super.display();
	        System.out.println("Flute Type: " + fluteType);
	        System.out.println("Number of Holes: " + noOfHoles);
	        System.out.println("Key: " + key);
	        System.out.println("Is Tunable: " + isTunable);
	    }
	}// Flute class ends here


	class TestInstrument {
	    public static void main(String[] args) {

	       
	        System.out.println("Default Guitar");
	        Guitar g1 = new Guitar();
	        g1.display();
	        g1.playSound();

	        System.out.println("\nParameterized Guitar");
	        Guitar g2 = new Guitar("Guitar", "String", "USA", "Wood", 15000, "Fender", true,
	                "Electric", "Stratocaster", true, "Single Coil", 22, "Maple");
	        g2.display();
	        g2.playSound();

	        System.out.println("\nDefault Flute");
	        Flute f1 = new Flute();
	        f1.display();
	        f1.playSound();

	        System.out.println("\nParameterized Flute");
	        Flute f2 = new Flute("Flute", "Wind", "India", "Bamboo", 2000, "Yamaha", false,
	                "Western Flute", 8, "E", true);
	        f2.display();
	        f2.playSound();

	        System.out.println("\n--- Demonstrating Polymorphism ---");
	        MusicalInstrument ref;

	        ref = new Guitar();
	        ref.playSound(); 

	        ref = new Flute();
	        ref.playSound(); 
	    }
	}


