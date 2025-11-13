package Polymorphism;

	class HospitalStaff {

	    String staffName;
	    int staffId;
	    double baseSalary;
	    String department;
	    String shift;

	    // Default Constructor
	    HospitalStaff() {
	        System.out.println("HospitalStaff Default Constructor Called");
	        this.staffName = "Not Given";
	        this.staffId = 0;
	        this.baseSalary = 0.0;
	        this.department = "General";
	        this.shift = "Day";
	    }

	    // Parameterized Constructor
	    HospitalStaff(String staffName, int staffId, double baseSalary, String department, String shift) {
	        System.out.println("HospitalStaff Parameterized Constructor Called");
	        this.staffName = staffName;
	        this.staffId = staffId;
	        this.baseSalary = baseSalary;
	        this.department = department;
	        this.shift = shift;
	    }

	   

	    public String getStaffName() {
			return staffName;
		}

		public void setStaffName(String staffName) {
			this.staffName = staffName;
		}

		public int getStaffId() {
			return staffId;
		}

		public void setStaffId(int staffId) {
			this.staffId = staffId;
		}

		public double getBaseSalary() {
			return baseSalary;
		}

		public void setBaseSalary(double baseSalary) {
			this.baseSalary = baseSalary;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getShift() {
			return shift;
		}

		public void setShift(String shift) {
			this.shift = shift;
		}

	    double calculateSalary() {
	        return baseSalary;
	    }

	    void display() {
	        System.out.println("Staff Name: " + this.staffName);
	        System.out.println("Staff ID: " + this.staffId);
	        System.out.println("Department: " + this.department);
	        System.out.println("Shift: " + this.shift);
	        System.out.println("Base Salary: ₹" + this.baseSalary);
	    }
	}

	class Doctor extends HospitalStaff {

	    String specialization;
	    double consultationFee;
	    int patientsPerDay;

	    Doctor() {
	        super();
	        System.out.println("Doctor Default Constructor Called");
	        this.specialization = "General Physician";
	        this.consultationFee = 500.0;
	        this.patientsPerDay = 10;
	    }

	    Doctor(String staffName, int staffId, double baseSalary, String department, String shift,
	           String specialization, double consultationFee, int patientsPerDay) {
	        super(staffName, staffId, baseSalary, department, shift);
	        System.out.println("Doctor Parameterized Constructor Called");
	        this.specialization = specialization;
	        this.consultationFee = consultationFee;
	        this.patientsPerDay = patientsPerDay;
	    }

	    
	    double calculateSalary() {
	        return baseSalary + (consultationFee * patientsPerDay);
	    }

	    
	    void display() {
	        super.display();
	        System.out.println("Specialization: " + this.specialization);
	        System.out.println("Consultation Fee: ₹" + this.consultationFee);
	        System.out.println("Patients Per Day: " + this.patientsPerDay);
	        System.out.println("Total Salary: ₹" + calculateSalary());
	    }
	}// Doctor class ends here

	class Nurse extends HospitalStaff {

	    int patientsAssigned;
	    double nightAllowance;

	    Nurse() {
	        super();
	        System.out.println("Nurse Default Constructor Called");
	        this.patientsAssigned = 5;
	        this.nightAllowance = 2000.0;
	    }

	    Nurse(String staffName, int staffId, double baseSalary, String department, String shift,
	          int patientsAssigned, double nightAllowance) {
	        super(staffName, staffId, baseSalary, department, shift);
	        System.out.println("Nurse Parameterized Constructor Called");
	        this.patientsAssigned = patientsAssigned;
	        this.nightAllowance = nightAllowance;
	    }

	    
	    double calculateSalary() {
	        return baseSalary + nightAllowance;
	    }

	    void display() {
	        super.display();
	        System.out.println("Patients Assigned: " + this.patientsAssigned);
	        System.out.println("Night Allowance: ₹" + this.nightAllowance);
	        System.out.println("Total Salary: ₹" + calculateSalary());
	    }
	}// Nurse class ends here

	class Technician extends HospitalStaff {

	    String equipmentHandled;
	    double overtimePay;

	    Technician() {
	        super();
	        System.out.println("Technician Default Constructor Called");
	        this.equipmentHandled = "ECG Machine";
	        this.overtimePay = 1500.0;
	    }

	    Technician(String staffName, int staffId, double baseSalary, String department, String shift,
	               String equipmentHandled, double overtimePay) {
	        super(staffName, staffId, baseSalary, department, shift);
	        System.out.println("Technician Parameterized Constructor Called");
	        this.equipmentHandled = equipmentHandled;
	        this.overtimePay = overtimePay;
	    }

	    double calculateSalary() {
	        return baseSalary + overtimePay;
	    }

	    
	    void display() {
	        super.display();
	        System.out.println("Equipment Handled: " + this.equipmentHandled);
	        System.out.println("Overtime Pay: ₹" + this.overtimePay);
	        System.out.println("Total Salary: ₹" + calculateSalary());
	    }
	}//Technician class ends here

	class DemoHospital {
	    public static void main(String[] args) {

	        System.out.println("=== Demonstrating Polymorphism in Hospital Staff ===\n");

	        HospitalStaff staff;

	        staff = new Doctor("Dr. Meera", 101, 40000, "Cardiology", "Day", "Cardiologist", 1000, 12);
	        staff.display();
	        System.out.println("\n\n");

	        staff = new Nurse("Sita", 102, 25000, "Pediatrics", "Night", 6, 3000);
	        staff.display();
	        System.out.println("\n\n");

	        staff = new Technician("Amit", 103, 20000, "Radiology", "Day", "X-Ray Machine", 2500);
	        staff.display();
	    }
	}


