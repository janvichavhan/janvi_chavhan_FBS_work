class Distance {
    int kilometer;
    int meter;

   
    void setKilometer(int km) {
        this.kilometer = km;
    }

    void setMeter(int m) {
        this.meter = m;
    }
} // Distance class ends here


class TestDistance {
    public static void main(String[] args) {
        Distance d1;
        d1 = new Distance(); 

        d1.setKilometer(5);
        d1.setMeter(250);

        System.out.println("Distance Details: " +
                           d1.kilometer + " km " +
                           d1.meter + " m");
    }//Main class ends here
} // TestDistance class ends here
