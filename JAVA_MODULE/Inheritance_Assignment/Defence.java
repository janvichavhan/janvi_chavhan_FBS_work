package Inheritance;

public class Defence {
	
	    String nameOfHead;
	    String countryName;
	    int noOfVehicles;
	    String locationOfHeadQuarter;
	    int noOfCasualties;
	    int noOfBasses;
	    int noOfPowerCount;
	    double budget;
	    int noOfDepartments;
	    int noOfMissionsPerformed;
	    int noOfTroops;

	
                 Defence()// Default Constructor 
                 
             {
                     
                	 
                 System.out.println("Default Defence Constructor Called");
                 this.nameOfHead = "not given";
                 this.countryName = "not given";
                 this.noOfVehicles = 0;
                 this.locationOfHeadQuarter = "not given";
                 this.noOfCasualties = 0;
                 this.noOfBasses = 1;
                 this.noOfPowerCount = 0;
                 this.budget = 0.0;
                 this.noOfDepartments = 0;
                 this.noOfMissionsPerformed = 0;
                 this.noOfTroops = 0;


             }
                 Defence(String nameOfHead, String countryName, int noOfVehicles, String locationOfHeadQuarter,
                         int noOfCasualties, int noOfBasses, int noOfPowerCount, double budget,
                         int noOfDepartments, int noOfMissionsPerformed, int noOfTroops)// Parameterized Constructor

                 {

                     this.nameOfHead = nameOfHead;
                     this.countryName = countryName;
                     this.noOfVehicles = noOfVehicles;
                     this.locationOfHeadQuarter = locationOfHeadQuarter;
                     this.noOfCasualties = noOfCasualties;
                     this.noOfBasses = noOfBasses;
                     this.noOfPowerCount = noOfPowerCount;
                     this.budget = budget;
                     this.noOfDepartments = noOfDepartments;
                     this.noOfMissionsPerformed = noOfMissionsPerformed;
                     this.noOfTroops = noOfTroops;

                     System.out.println("Parameterized Defence Constructor Called");
                 }
				 public String getNameOfHead() {
					 return nameOfHead;
				 }
				 public void setNameOfHead(String nameOfHead) {
					 this.nameOfHead = nameOfHead;
				 }
				 public String getCountryName() {
					 return countryName;
				 }
				 public void setCountryName(String countryName) {
					 this.countryName = countryName;
				 }
				 public int getNoOfVehicles() {
					 return noOfVehicles;
				 }
				 public void setNoOfVehicles(int noOfVehicles) {
					 this.noOfVehicles = noOfVehicles;
				 }
				 public String getLocationOfHeadQuarter() {
					 return locationOfHeadQuarter;
				 }
				 public void setLocationOfHeadQuarter(String locationOfHeadQuarter) {
					 this.locationOfHeadQuarter = locationOfHeadQuarter;
				 }
				 public int getNoOfCasualties() {
					 return noOfCasualties;
				 }
				 public void setNoOfCasualties(int noOfCasualties) {
					 this.noOfCasualties = noOfCasualties;
				 }
				 public int getNoOfBasses() {
					 return noOfBasses;
				 }
				 public void setNoOfBasses(int noOfBasses) {
					 this.noOfBasses = noOfBasses;
				 }
				 public int getNoOfPowerCount() {
					 return noOfPowerCount;
				 }
				 public void setNoOfPowerCount(int noOfPowerCount) {
					 this.noOfPowerCount = noOfPowerCount;
				 }
				 public double getBudget() {
					 return budget;
				 }
				 public void setBudget(double budget) {
					 this.budget = budget;
				 }
				 public int getNoOfDepartments() {
					 return noOfDepartments;
				 }
				 public void setNoOfDepartments(int noOfDepartments) {
					 this.noOfDepartments = noOfDepartments;
				 }
				 public int getNoOfMissionsPerformed() {
					 return noOfMissionsPerformed;
				 }
				 public void setNoOfMissionsPerformed(int noOfMissionsPerformed) {
					 this.noOfMissionsPerformed = noOfMissionsPerformed;
				 }
				 public int getNoOfTroops() {
					 return noOfTroops;
				 }
				 public void setNoOfTroops(int noOfTroops) {
					 this.noOfTroops = noOfTroops;
				 }

				 void display() {
				        System.out.println("Head: " + this.nameOfHead);
				        System.out.println("Country: " +this.countryName);
				        System.out.println("Vehicles: " + this.noOfVehicles);
				        System.out.println("HeadQuarter: " +this.locationOfHeadQuarter);
				        System.out.println("Casualties: " +this. noOfCasualties);
				        System.out.println("Bosses: " + this.noOfBasses);
				        System.out.println("Power Count: " +this. noOfPowerCount);
				        System.out.println("Budget: " + this.budget);
				        System.out.println("Departments: " +this. noOfDepartments);
				        System.out.println("Missions Performed: " +this. noOfMissionsPerformed);
				        System.out.println("Troops: " +this. noOfTroops);
				    }
   }// Defence class ends here
  class Army extends Defence{
	  
	               int noOfTank;
	               int noOfGuns;
	               int noOfGrenade;
	               int noOfBattalion;
	               Army()//default constructor  
	               {
	                   super(); 
	                   this.noOfTank = 0;
	                   this.noOfGuns = 0;
	                   this.noOfGrenade = 0;
	                   this.noOfBattalion = 0;
	                   System.out.println("Army Default Constructor Called");
	               }
	               Army(String nameOfHead, String countryName, int noOfVehicles, String locationOfHeadQuarter,
	            	         int noOfCasualties, int noOfBosses, int noOfPowerCount, double budget,
	            	         int noOfDepartments, int noOfMissionsPerformed, int noOfTroops,
	            	         int noOfTank, int noOfGuns, int noOfGrenade, int noOfBattalion) //parameterized constructor
	               {

	            	        super(nameOfHead, countryName, noOfVehicles, locationOfHeadQuarter, noOfCasualties,
	            	              noOfBosses, noOfPowerCount, budget, noOfDepartments, noOfMissionsPerformed, noOfTroops);

	            	        this.noOfTank = noOfTank;
	            	        this.noOfGuns = noOfGuns;
	            	        this.noOfGrenade = noOfGrenade;
	            	        this.noOfBattalion = noOfBattalion;

	            	        System.out.println("Army Parameterized Constructor Called");
	            	    }
	               
	               public int getNoOfTank() {
					return noOfTank;
				}
				   public void setNoOfTank(int noOfTank) {
					   this.noOfTank = noOfTank;
				   }
				   public int getNoOfGuns() {
					   return noOfGuns;
				   }
				   public void setNoOfGuns(int noOfGuns) {
					   this.noOfGuns = noOfGuns;
				   }
				   public int getNoOfGrenade() {
					   return noOfGrenade;
				   }
				   public void setNoOfGrenade(int noOfGrenade) {
					   this.noOfGrenade = noOfGrenade;
				   }
				   public int getNoOfBattalion() {
					   return noOfBattalion;
				   }
				   public void setNoOfBattalion(int noOfBattalion) {
					   this.noOfBattalion = noOfBattalion;
				   }
				   void display() {
                       super.display(); 
	                   System.out.println("Number of Tanks: " +this. noOfTank);
	                   System.out.println("Number of Guns: " +this.noOfGuns);
	                   System.out.println("Number of Grenades: " +this.noOfGrenade);
	                   System.out.println("Number of Battalions: " +this. noOfBattalion);
	               }
  }// Army class ends here

   class Navy extends Defence {

      int noOfShips;
      int noOfSubmarines;
      int noOfTorpedoes;

      Navy()// Default Constructor

      {
          super(); 
          this.noOfShips = 0;
          this.noOfSubmarines = 0;
          this.noOfTorpedoes = 0;
          System.out.println("Navy Default Constructor Called");
      }

      // Parameterized Constructor
      Navy(String nameOfHead, String countryName, int noOfVehicles, String locationOfHeadQuarter,
           int noOfCasualties, int noOfBosses, int noOfPowerCount, double budget,
           int noOfDepartments, int noOfMissionsPerformed, int noOfTroops,
           int noOfShips, int noOfSubmarines, int noOfTorpedoes) // parameterized
      {

          super(nameOfHead, countryName, noOfVehicles, locationOfHeadQuarter, noOfCasualties,
                noOfBosses, noOfPowerCount, budget, noOfDepartments, noOfMissionsPerformed, noOfTroops);

          this.noOfShips = noOfShips;
          this.noOfSubmarines = noOfSubmarines;
          this.noOfTorpedoes = noOfTorpedoes;
          System.out.println("Navy Parameterized Constructor Called");

      }
      

    
      public int getNoOfShips() {
		return noOfShips;
	}

	  public void setNoOfShips(int noOfShips) {
		  this.noOfShips = noOfShips;
	  }

	  public int getNoOfSubmarines() {
		  return noOfSubmarines;
	  }

	  public void setNoOfSubmarines(int noOfSubmarines) {
		  this.noOfSubmarines = noOfSubmarines;
	  }

	  public int getNoOfTorpedoes() {
		  return noOfTorpedoes;
	  }

	  public void setNoOfTorpedoes(int noOfTorpedoes) {
		  this.noOfTorpedoes = noOfTorpedoes;
	  }

	  void display() {
          super.display(); 
          System.out.println("Number of Ships: " + noOfShips);
          System.out.println("Number of Submarines: " + noOfSubmarines);
          System.out.println("Number of Torpedoes: " + noOfTorpedoes);
      }
  }// Navy class ends here 

    class Airforce extends Defence {

       int noOfMissiles;
       int noOfAircraft;
       int noOfSquadrons;

       Airforce()//default constructor 
       {
           super();
           this.noOfMissiles = 0;
           this.noOfAircraft = 0;
           this.noOfSquadrons = 0;
           System.out.println("Airforce Default Constructor Called");
       }

       Airforce(String nameOfHead, String countryName, int noOfVehicles, String locationOfHeadQuarter,
                int noOfCasualties, int noOfBosses, int noOfPowerCount, double budget,
                int noOfDepartments, int noOfMissionsPerformed, int noOfTroops,
                int noOfMissiles, int noOfAircraft, int noOfSquadrons)//parameterized constructor
       {

           super(nameOfHead, countryName, noOfVehicles, locationOfHeadQuarter, noOfCasualties,
                 noOfBosses, noOfPowerCount, budget, noOfDepartments, noOfMissionsPerformed, noOfTroops);

           this.noOfMissiles = noOfMissiles;
           this.noOfAircraft = noOfAircraft;
           this.noOfSquadrons = noOfSquadrons;

           System.out.println("Airforce Parameterized Constructor Called");
       }
       

       public int getNoOfMissiles() {
		return noOfMissiles;
	}

	   public void setNoOfMissiles(int noOfMissiles) {
		   this.noOfMissiles = noOfMissiles;
	   }

	   public int getNoOfAircraft() {
		   return noOfAircraft;
	   }

	   public void setNoOfAircraft(int noOfAircraft) {
		   this.noOfAircraft = noOfAircraft;
	   }

	   public int getNoOfSquadrons() {
		   return noOfSquadrons;
	   }

	   public void setNoOfSquadrons(int noOfSquadrons) {
		   this.noOfSquadrons = noOfSquadrons;
	   }

	   void displayAirforce() {
           super.display(); 
           System.out.println("Number of Missiles: " + noOfMissiles);
           System.out.println("Number of Aircraft: " + noOfAircraft);
           System.out.println("Number of Squadrons: " + noOfSquadrons);
       }
   }// Airforce class ends here 

     class TestDefence {
        public static void main(String[] args) {

            System.out.println("Army Default");
            Army army1 = new Army();
            army1.display();

            System.out.println("\n Army Parameterized");
            Army army2 = new Army("Janvi", "India", 100, "Delhi HQ", 5, 2, 50, 5000000, 10, 15, 5000,
                                   50, 200, 500, 10);
            army2.display();

            System.out.println("\n Navy Parameterized ");
            Navy navy1 = new Navy("Pavan", "India", 50, "Naval HQ", 2, 1, 30, 2000000, 5, 10, 3000,
                                  20, 5, 100);
            navy1.display();

            System.out.println("\nAirforce Parameterized");
            Airforce air1 = new Airforce("Siya", "India", 100, "Air HQ", 1, 2, 40, 3000000, 7, 25, 5000,
                                         150, 75, 10);
            air1.displayAirforce(); 
        }
    }// TestDefence class ends here




