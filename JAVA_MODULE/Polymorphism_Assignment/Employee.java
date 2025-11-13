package Polymorphism;

class Employee {

    int Id;
    String name;
    double salary;

    Employee() {
        System.out.println("Employee Default Constructor Called");
        this.Id = 0;
        this.name = "Not Given";
        this.salary = 0.0;
    }

    Employee(int Id, String name, double salary) {
        System.out.println("Employee Parameterized Constructor Called");
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }

    int getEmpId() {
        return Id;
    }

    void setEmpId(int empId) {
        this.Id = empId;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    double calculateSalary() {
        return salary; 
    }

    void display() {
        System.out.println("Employee ID: " + this.Id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}// Employee class ends here

class Admin extends Employee {
    double allowance;
    String department;
    int teamSize;

    Admin() {
        super();
        System.out.println("Admin Default Constructor Called");
        this.allowance = 5000.0;
        this.department = "Administration";
        this.teamSize = 5;
    }

    Admin(int empId, String name, double salary, double allowance, String department, int teamSize) {
        super(empId, name, salary);
        System.out.println("Admin Parameterized Constructor Called");
        this.allowance = allowance;
        this.department = department;
        this.teamSize = teamSize;
    }

    double getAllowance() {
        return allowance;
    }

    void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    String getDepartment() {
        return department;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    int getTeamSize() {
        return teamSize;
    }

    void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    double calculateSalary() {
        return salary + allowance;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Allowance: " + this.allowance);
        System.out.println("Department: " + this.department);
        System.out.println("Team Size: " + this.teamSize);
    }
}// Admin class ends here

class HR extends Employee {
    int recruitments;
    boolean managesPayroll;
    double commission;

    HR() {
        super();
        System.out.println("HR Default Constructor Called");
        this.recruitments = 0;
        this.managesPayroll = true;
        this.commission = 5000.0;
    }

    HR(int empId, String name, double salary, int recruitments, boolean managesPayroll, double commission) {
        super(empId, name, salary);
        System.out.println("HR Parameterized Constructor Called");
        this.recruitments = recruitments;
        this.managesPayroll = managesPayroll;
        this.commission = commission;
    }

    int getRecruitments() {
        return recruitments;
    }

    void setRecruitments(int recruitments) {
        this.recruitments = recruitments;
    }

    boolean isManagesPayroll() {
        return managesPayroll;
    }

    void setManagesPayroll(boolean managesPayroll) {
        this.managesPayroll = managesPayroll;
    }

    double getCommission() {
        return commission;
    }

    void setCommission(double commission) {
        this.commission = commission;
    }

    double calculateSalary() {
        return salary + commission;
    }

    void display() {
        super.display();
        System.out.println("Recruitments Handled: " + this.recruitments);
        System.out.println("Manages Payroll: " + this.managesPayroll);
        System.out.println("Commission: " + this.commission);
    }
}// Hr class ends here

class SalesManager extends Employee {
    double salesTarget;
    double achievedSales;
    double incentive;
    double target;

    SalesManager() {
        super();
        System.out.println("SalesManager Default Constructor Called");
        this.salesTarget = 100000.0;
        this.achievedSales = 75000.0;
        this.incentive = 5000.0;
        this.target = 90000.0;
    }

    SalesManager(int Id, String name, double salary, double salesTarget, double achievedSales, double incentive, double target) {
        super(Id, name, salary);
        System.out.println("SalesManager Parameterized Constructor Called");
        this.salesTarget = salesTarget;
        this.achievedSales = achievedSales;
        this.incentive = incentive;
        this.target = target;
    }

    double getSalesTarget() {
        return salesTarget;
    }

    void setSalesTarget(double salesTarget) {
        this.salesTarget = salesTarget;
    }

    double getAchievedSales() {
        return achievedSales;
    }

    void setAchievedSales(double achievedSales) {
        this.achievedSales = achievedSales;
    }

    double getIncentive() {
        return incentive;
    }

    void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    double getTarget() {
        return target;
    }

    void setTarget(double target) {
        this.target = target;
    }

    double calculateSalary() {
        return salary + incentive;
    }

    void display() {
        super.display();
        System.out.println("Sales Target: " + this.salesTarget);
        System.out.println("Achieved Sales: " + this.achievedSales);
        System.out.println("Incentive: " + this.incentive);
        System.out.println("Target: " + this.target);
    }
}// Salesmanager class ends here

class TestEmployee1 {
    public static void main(String[] args) {

        Employee e1;

        e1 = new SalesManager(103, "Amita", 50000, 150000, 120000, 10000, 130000);
        System.out.println();
        e1.display();

        e1 = new Admin(11, "Riyaa", 60000, 8000, "Operation", 10);
        System.out.println();
        e1.display();

        e1 = new HR(10, "Nehiya", 55000, 20, true, 7000);
        System.out.println();
        e1.display();
    }
} //TestEmployee class ends here
