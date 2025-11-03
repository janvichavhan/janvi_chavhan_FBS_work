class Employee {
    int empId;
    String name;
    double salary;
    String department;

    // Setter methods
    void setEmpId(int id) {
        this.empId = id;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }
}// Employee Class Ends Here

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 ;
        e1=new Employee();  // object

        e1.setEmpId(13);
        e1.setName("Janvi");
        e1.setSalary(45000.50);
        
      System.out.println("Employee Details: " +
                   "ID=" + e1.empId + ", " +
                   "Name=" + e1.name + ", " +
                   "Salary=" + e1.salary );


    }//main class ends here
}//Test class end here
