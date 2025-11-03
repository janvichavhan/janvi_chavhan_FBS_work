class Manager {
    int managerId;
    String name;
    double salary;
    double incentive;
    double target;

    void setManagerId(int id) {
        this.managerId = id;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setIncentive(double i) {
        this.incentive = i;
    }

    void setTarget(double t) {
        this.target = t;
    }
} // Manager class ends here


class TestManager {
    public static void main(String[] args) {
        Manager m1;
        m1 = new Manager();   

        // Assign values
        m1.setManagerId(13);
        m1.setName("Janvi");
        m1.setSalary(70000);
        m1.setIncentive(10000);
        m1.setTarget(10.5);

        // Display output
        System.out.println("Manager Details: " +
                           "ID=" + m1.managerId + ", " +
                           "Name=" + m1.name + ", " +
                           "Salary=" + m1.salary + ", " +
                           "Incentive=" + m1.incentive + ", " +
                           "Target=" + m1.target);
    }//Main Class ends here
} // TestManager class ends here
