package Inheritance;

 class Student {
	 
		    int FBSID;
		    String Name;
		    int Distance;
		    static int count=0;

		    Student()// Default Constructor
		  {
		    System.out.println("Student defalut Constructor Called");
		        FBSID=100;
		        Name="not given";
		        Distance=10;
		        count++;
		   }// default Constructor ends here
		    Student(int id, String str, int x)// parameterized construtor
		     { 
		       System.out.println("Student defalut Parameterized Called");

		        this.FBSID=id;
		        this.Name=str;
		        this.Distance=x;
		        count++;
		     }// parameterized Constructor ends here
			      int getFBSID() {
					return FBSID;
				}
				  void setFBSID(int fBSID) {
					FBSID = fBSID;
				}
				   String getName() {
					return Name;
				}
				    void setName(String name) {
					this.Name = name;
				}
				     int getDistance() {
					 return Distance;
				}
				     void setDistance(int distance) {
					Distance = distance;
				}
				     
				     static int getCount() {
						return count;
					}
					 public static void setCount(int count) {
						 Student.count = count;
					 }
				void display() {
			        System.out.println("Firstbit ID IS = " + this.FBSID);
			        System.out.println("Name IS = " +this. Name);
			        System.out.println("Distance  Travelled= " + this.Distance);
			    }
			} // Student class ends here
        class PlacedStudent extends Student  // Step 1
           {
	              // Step 2 remove State and behavior which is available in super class 
	               String CompanyName;
	               String Designation;
	               
	               
	               
	                PlacedStudent()// Default Constructor
	              {
	                  super();// Step 3-A
	                   CompanyName = "Xyz";
	                   Designation = "Pqr";
	                   System.out.println("PlacedStudent Default Constructor Called");

	               }

	               PlacedStudent(int FBSID, String Name, int Distance, String CompanyName, String Designation)// Parameterized Constructor
 
	               {
	            	   super( FBSID,  Name,  Distance);// Step 3-B
	                   System.out.println("PlacedStudent Parameterized Constructor Called"); 
	                   this.CompanyName = CompanyName;
	                   this.Designation = Designation;
	               }

				      int getFBSID() {
					   return FBSID;
				   }

				     void setFBSID(int fBSID) {
					   FBSID = fBSID;
				   }

				     String getName() {
					   return Name;
				   }

				      void setName(String name) {
					   Name = name;
				   }

				      int getDistance() {
					   return Distance;
				   }

				      void setDistance(int distance) {
					   Distance = distance;
				   }

				       String getCompanyName() {
					   return CompanyName;
				   }

				       void setCompnayName(String CompanyName) {
					   this. CompanyName = CompanyName;
				   }

				        String getDesignation() {
					   return Designation;
				   }

				        void setDesignation(String designation) {
					   Designation = designation;
				   }
	              
				   void display()
				   {
					   super.display();// step 4 
				         
				        System.out.println("Company Name: " +this. CompanyName);
				        System.out.println("Designation: " +this. Designation);
				    }

				   }// PlacedStudent Class ends here
  
         class DemoInheritance
            {
        	 public static void main(String[] args) {
        	 
//        		  Student s1=new Student();
//        		  System.out.println("Student Count total= "+Student.getCount());
//        		  
//        		  Student s2=new Student(103,"Janvi",99);
//        		  System.out.println("Student Count total= "+Student.getCount());
//        		   
        		 
              PlacedStudent ps2=new PlacedStudent( );
              ps2.display();
              System.out.println("\n\n");
        		 
        		 
              PlacedStudent ps1=new PlacedStudent(78,"Rahul",500,"BCCI","Coach" );
       		  System.out.println("Student Count total= "+Student.getCount());
              ps1.display();

        	 
         }
            }
  
  

 
       
	
              


