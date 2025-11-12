package Inheritance;

 class Shape {

    String shapeType;
    double area;

    Shape()// Default Constructor

    {
        System.out.println("Shape Default Constructor Called");
        this.shapeType = "not given";
        this.area = 0.0;
    }

    Shape(String shapeType, double area)// Default Constructor Parameterized

    {
        System.out.println("Shape Parameterized Constructor Called");
        this.shapeType = shapeType;
        this.area = area;
    }

    String getShapeType() {
        return shapeType;
    }

    void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    double getArea() {
        return area;
    }

    void setArea(double area) {
        this.area = area;
    }

    void display() {
        System.out.println("Shape Type: " + this.shapeType);
        System.out.println("Area: " + this.area);
    }
}//shape class ends here
class Triangle extends Shape {

    double base;
    double height;

    Triangle()// Default Constructor

    {
        super();
        this.base = 0.0;
        this.height = 0.0;
        this.shapeType = "Triangle";
        System.out.println("Triangle Default Constructor Called");
    }

    Triangle(double base, double height)// Parameterized Constructor

    {
        super("Triangle", 0.5 * base * height); 
        this.base = base;
        this.height = height;
        System.out.println("Triangle Parameterized Constructor Called");
    }

	 double getBase() {
		return base;
	}

	 void setBase(double base) {
		this.base = base;
	}

	 double getHeight() {
		return height;
	}

	 void setHeight(double height) {
		this.height = height;
	}
	 void display() {
	        super.display();
	        System.out.println("Base: " + this.base);
	        System.out.println("Height: " + this.height);
	    }
	}// triangle class ends here
class Rectangle extends Shape {

    double length;
    double width;

    Rectangle()// Default Constructor
 
    {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.shapeType = "Rectangle";
        System.out.println("Rectangle Default Constructor Called");
    }

    Rectangle(double length, double width)// Parameterized Constructor
 
    {
        super("Rectangle", length * width); 
        this.length = length;
        this.width = width;
        System.out.println("Rectangle Parameterized Constructor Called");
    }
    void display() {
        super.display();
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
    }
}// rectangle class ends here
class DemoShapes {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.display();
        System.out.println("\n");

        Triangle t2 = new Triangle(10, 5);
        t2.display();
        System.out.println("\n");

        Rectangle r1 = new Rectangle();
        r1.display();
        System.out.println("\n");

        Rectangle r2 = new Rectangle(8, 6);
        r2.display();
        System.out.println("\n");
    }
} //DemoShape class ends here


