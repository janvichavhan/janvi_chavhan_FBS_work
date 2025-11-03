class Student {
    int rollNo;
    String name;
    double marks;

    
    void setRollNo(int r) {
        this.rollNo = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMarks(double m) {
        this.marks = m;
    }
} // Student class ends here


class TestStudent {
    public static void main(String[] args) {
        Student s1;
        s1 = new Student(); 

 
        s1.setRollNo(13);
        s1.setName("Janvi");
        s1.setMarks(90.5);

        
        System.out.println("Student Details: " +
                           "Roll No=" + s1.rollNo + ", " +
                           "Name=" + s1.name + ", " +
                           "Marks=" + s1.marks);
    }//Main Class Ends Here
} // TestStudent class ends here
