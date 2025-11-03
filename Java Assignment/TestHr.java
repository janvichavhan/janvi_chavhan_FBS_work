class Hr {
    int hrId;
    String name;
    double salary;
    double commission;

    void setHrId(int id) {
        this.hrId = id;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setCommission(double c) {
        this.commission = c;
    }
} // Hr class ends here


class TestHr {
    public static void main(String[] args) {
        Hr h1;
        h1= new Hr();   

        h1.setHrId(201);
        h1.setName("Janvi");
        h1.setSalary(60000);
        h1.setCommission(5000);

        System.out.println("HR Details: " +
                           "ID=" + h1.hrId + ", " +
                           "Name=" + h1.name + ", " +
                           "Salary=" + h1.salary + ", " +
                           "Commission=" + h1.commission);
    }//Main Class ends Here
} // TestHr class ends here
