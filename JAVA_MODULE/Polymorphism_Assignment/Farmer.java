package Polymorphism;

public class Farmer {
    int farmerId;
    String farmerName;
    double landArea;
    String landLocation;
    double annualIncome;
    int noOfEquipment;

    // Default constructor
    public Farmer() {
        this.farmerId = 524;
        this.farmerName = "Default Name";
        this.landArea = 5.06;
        this.landLocation = "Default Location";
        this.annualIncome = 5552;
        this.noOfEquipment = 54;
    }

    // Parameterized constructor
    public Farmer(int farmerId, String farmerName, double landArea, String landLocation, double annualIncome, int noOfEquipment) {
        this.farmerId = farmerId;
        this.farmerName = farmerName;
        this.landArea = landArea;
        this.landLocation = landLocation;
        this.annualIncome = annualIncome;
        this.noOfEquipment = noOfEquipment;
    }

    // Getters and Setters
    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public String getLandLocation() {
        return landLocation;
    }

    public void setLandLocation(String landLocation) {
        this.landLocation = landLocation;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public int getNoOfEquipment() {
        return noOfEquipment;
    }

    public void setNoOfEquipment(int noOfEquipment) {
        this.noOfEquipment = noOfEquipment;
    }

    void calSubsidy() {
        System.out.println("General Farmer Subsidy Received...");
    }

    void display() {
        System.out.println("Farmer ID: " + farmerId);
        System.out.println("Farmer Name: " + farmerName);
        System.out.println("Land Area (in acres): " + landArea);
        System.out.println("Land Location: " + landLocation);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("Number of Equipment: " + noOfEquipment);
    }
}

class DairyFarmer extends Farmer {
    int noOfCattles;
    int milkProduceAmount;
    int dairyLicenseNo;

    public DairyFarmer() {
        super();
        this.noOfCattles = 5;
        this.milkProduceAmount = 54;
        this.dairyLicenseNo = 15485;
    }

    public DairyFarmer(int farmerId, String farmerName, double landArea, String landLocation,
                       double annualIncome, int noOfEquipment, int noOfCattles,
                       int milkProduceAmount, int dairyLicenseNo) {
        super(farmerId, farmerName, landArea, landLocation, annualIncome, noOfEquipment);
        this.noOfCattles = noOfCattles;
        this.milkProduceAmount = milkProduceAmount;
        this.dairyLicenseNo = dairyLicenseNo;
    }

    
    void calSubsidy() {
        System.out.println("Dairy Farmer Subsidy Received Based on Number of Cattles...");
    }
 
    
    public int getNoOfCattles() {
		return noOfCattles;
	}

	public void setNoOfCattles(int noOfCattles) {
		this.noOfCattles = noOfCattles;
	}

	public int getMilkProduceAmount() {
		return milkProduceAmount;
	}

	public void setMilkProduceAmount(int milkProduceAmount) {
		this.milkProduceAmount = milkProduceAmount;
	}

	public int getDairyLicenseNo() {
		return dairyLicenseNo;
	}

	public void setDairyLicenseNo(int dairyLicenseNo) {
		this.dairyLicenseNo = dairyLicenseNo;
	}

	void display() {
        super.display();
        System.out.println("Number of Cattles: " + noOfCattles);
        System.out.println("Milk Produced (in liters): " + milkProduceAmount);
        System.out.println("Dairy License Number: " + dairyLicenseNo);
    }
}// Farmer class ends here

class PoultryFarmer extends Farmer {
    String poultryName;
    int noOfChickens;
    int shedCapacity;
    int eggsProducedPerDay;

    public PoultryFarmer() {
        super();
        this.poultryName = "Default Poultry";
        this.noOfChickens = 50;
        this.shedCapacity = 5000;
        this.eggsProducedPerDay = 200;
    }

    public PoultryFarmer(int farmerId, String farmerName, double landArea, String landLocation,
                         double annualIncome, int noOfEquipment, String poultryName,
                         int noOfChickens, int shedCapacity, int eggsProducedPerDay) {
        super(farmerId, farmerName, landArea, landLocation, annualIncome, noOfEquipment);
        this.poultryName = poultryName;
        this.noOfChickens = noOfChickens;
        this.shedCapacity = shedCapacity;
        this.eggsProducedPerDay = eggsProducedPerDay;
    }

    
    void calSubsidy() {
        System.out.println("Poultry Farmer Subsidy Received Based on Number of Chickens...");
    }

    
    public String getPoultryName() {
		return poultryName;
	}

	public void setPoultryName(String poultryName) {
		this.poultryName = poultryName;
	}

	public int getNoOfChickens() {
		return noOfChickens;
	}

	public void setNoOfChickens(int noOfChickens) {
		this.noOfChickens = noOfChickens;
	}

	public int getShedCapacity() {
		return shedCapacity;
	}

	public void setShedCapacity(int shedCapacity) {
		this.shedCapacity = shedCapacity;
	}

	public int getEggsProducedPerDay() {
		return eggsProducedPerDay;
	}

	public void setEggsProducedPerDay(int eggsProducedPerDay) {
		this.eggsProducedPerDay = eggsProducedPerDay;
	}

	void display() {
        super.display();
        System.out.println("Poultry Farm Name: " + poultryName);
        System.out.println("Number of Chickens: " + noOfChickens);
        System.out.println("Shed Capacity: " + shedCapacity);
        System.out.println("Eggs Produced Per Day: " + eggsProducedPerDay);
    }
}//PoultryFarmer class ends here

class OrganicFarmer extends Farmer {
    int orgId;
    String cropType;
    boolean fertilizerUsed;

    public OrganicFarmer() {
        super();
        this.orgId = 45;
        this.cropType = "Default Crop";
        this.fertilizerUsed = true;
    }

     OrganicFarmer(int farmerId, String farmerName, double landArea, String landLocation,
                         double annualIncome, int noOfEquipment, int orgId, String cropType,
                         boolean fertilizerUsed) {
        super(farmerId, farmerName, landArea, landLocation, annualIncome, noOfEquipment);
        this.orgId = orgId;
        this.cropType = cropType;
        this.fertilizerUsed = fertilizerUsed;
    }

    void calSubsidy() {
        System.out.println("Organic Farmer Subsidy Received Based on Crop Type...");
    }
            
    public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public boolean isFertilizerUsed() {
		return fertilizerUsed;
	}

	public void setFertilizerUsed(boolean fertilizerUsed) {
		this.fertilizerUsed = fertilizerUsed;
	}

	void display() {
        super.display();
        System.out.println("Organization ID: " + orgId);
        System.out.println("Crop Type: " + cropType);
        System.out.println("Fertilizer Used: " + fertilizerUsed);
    }
}//OrganicFarmer class ends here

class RegisterFarmer {
    public static void main(String[] args) {

        Farmer f1;

        f1 = new DairyFarmer();
        f1.calSubsidy();

        f1 = new PoultryFarmer();
        f1.calSubsidy();

        f1 = new OrganicFarmer();
        f1.calSubsidy();

        System.out.println("\n=== Individual Farmer Details ===\n");

        DairyFarmer farmer1 = new DairyFarmer(101, "Yogeshwar Kadam", 10.5, "Pune", 500000.0, 5, 20, 150, 12345);
        farmer1.display();

        System.out.println("\n\n");

        PoultryFarmer pf1 = new PoultryFarmer(102, "Rahul Sharma", 8.0, "Nagpur", 300000.0, 4,
                "Layer Farm", 50, 60, 120);
        pf1.display();

        System.out.println("\n\n");

        OrganicFarmer of1 = new OrganicFarmer(103, "Sita Patil", 12.0, "Solapur", 400000.0, 6, 501, "Wheat", true);
        of1.display();
    }
}
