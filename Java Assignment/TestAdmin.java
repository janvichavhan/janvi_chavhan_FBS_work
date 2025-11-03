class Admin {
    int adminId;
    String name;
    double salary;
    double allowance;

    void setAdminId(int id) {
        this.adminId = id;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setAllowance(double a) {
        this.allowance = a;
    }
} // Admin class ends here


class TestAdmin {
    public static void main(String[] args) {
        Admin a1;
        a1= new Admin();  

        a1.setAdminId(13);
        a1.setName("Janvi");
        a1.setSalary(50000);
        a1.setAllowance(8000);

        System.out.println("Admin Details: " +
                           "ID=" + a1.adminId + ", " +
                           "Name=" + a1.name + ", " +
                           "Salary=" + a1.salary + ", " +
                           "Allowance=" + a1.allowance);
    }//Main class ends here
} // TestAdmin class ends here
