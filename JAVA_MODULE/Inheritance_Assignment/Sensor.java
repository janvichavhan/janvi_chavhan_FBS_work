package Inheritance;

 class Sensor {


	    String sensorName;
	    String sensorType;
	    String manufacturer;
	    double range;        
	    double accuracy;    

	    Sensor()// Default Constructor

	    {
	        System.out.println("Sensor Default Constructor Called");
	        this.sensorName = "Unknown";
	        this.sensorType = "Generic";
	        this.manufacturer = "Not Given";
	        this.range = 0.0;
	        this.accuracy = 0.0;
	    }

	    Sensor(String sensorName, String sensorType, String manufacturer, double range, double accuracy)// Parameterized Constructor

	    {
	        System.out.println("Sensor Parameterized Constructor Called");
	        this.sensorName = sensorName;
	        this.sensorType = sensorType;
	        this.manufacturer = manufacturer;
	        this.range = range;
	        this.accuracy = accuracy;
	    }

		 String getSensorName() {
			return sensorName;
		}

		 void setSensorName(String sensorName) {
			this.sensorName = sensorName;
		}

		 String getSensorType() {
			return sensorType;
		}

		 void setSensorType(String sensorType) {
			this.sensorType = sensorType;
		}

		 String getManufacturer() {
			return manufacturer;
		}

		 void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		 double getRange() {
			return range;
		}

		 void setRange(double range) {
			this.range = range;
		}

		 double getAccuracy() {
			return accuracy;
		}

		 void setAccuracy(double accuracy) {
			this.accuracy = accuracy;
		}
		 void display() {
		        System.out.println("Sensor Name: " +this.sensorName);
		        System.out.println("Sensor Type: " +this. sensorType);
		        System.out.println("Manufacturer: " +this. manufacturer);
		        System.out.println("Range: " +this. range);
		        System.out.println("Accuracy: " +this. accuracy);
		    }
}// Sensor class ends here
 class TemperatureSensor extends Sensor {

	    double minTemperature;     
	    double maxTemperature;      
	    double currentTemperature; 

	    TemperatureSensor()// Default Constructor
 
	    {
	        super();  
	        System.out.println("TemperatureSensor Default Constructor Called");
	        this.minTemperature = 0.0;
	        this.maxTemperature = 100.0;
	        this.currentTemperature = 25.0;
	        this.sensorName = "Temperature Sensor";
	        this.sensorType = "Temperature";
	    }

	    TemperatureSensor(String sensorName, String manufacturer, double range, double accuracy,
	                      double minTemperature, double maxTemperature, double currentTemperature)// Parameterized Constructor
 {
	        super(sensorName, "Temperature", manufacturer, range, accuracy);
	        System.out.println("TemperatureSensor Parameterized Constructor Called");
	        this.minTemperature = minTemperature;
	        this.maxTemperature = maxTemperature;
	        this.currentTemperature = currentTemperature;
	    }

		 double getMinTemperature() {
			return minTemperature;
		}

		 void setMinTemperature(double minTemperature) {
			this.minTemperature = minTemperature;
		}

		 double getMaxTemperature() {
			return maxTemperature;
		}

		 void setMaxTemperature(double maxTemperature) {
			this.maxTemperature = maxTemperature;
		}

		 double getCurrentTemperature() {
			return currentTemperature;
		}

		 void setCurrentTemperature(double currentTemperature) {
			this.currentTemperature = currentTemperature;
		}
		 void display() {
		        super.display();  
		        System.out.println("Min Temperature: " +this.minTemperature );
		        System.out.println("Max Temperature: " + this.maxTemperature );
		        System.out.println("Current Temperature: " +this. currentTemperature );
		    }
 }// TemperatureSensor ends here 
 class FlowSensor extends Sensor {

	    double minFlowRate;     
	    double maxFlowRate;      
	    double currentFlowRate;  
	    String medium;           

	    FlowSensor() // Default Constructor

	    {
	        super();
	        System.out.println("FlowSensor Default Constructor Called");
	        this.minFlowRate = 0.0;
	        this.maxFlowRate = 100.0;
	        this.currentFlowRate = 0.0;
	        this.medium = "Water";
	        this.sensorName = "Flow Sensor";
	        this.sensorType = "Flow";
	    }

	    FlowSensor(String sensorName, String manufacturer, double range, double accuracy,
	               double minFlowRate, double maxFlowRate, double currentFlowRate, String medium)// Parameterized Constructor

	    {
	        super(sensorName, "Flow", manufacturer, range, accuracy);
	        System.out.println("FlowSensor Parameterized Constructor Called");
	        this.minFlowRate = minFlowRate;
	        this.maxFlowRate = maxFlowRate;
	        this.currentFlowRate = currentFlowRate;
	        this.medium = medium;
	    }

		 double getMinFlowRate() {
			return minFlowRate;
		}

		 void setMinFlowRate(double minFlowRate) {
			this.minFlowRate = minFlowRate;
		}

		 double getMaxFlowRate() {
			return maxFlowRate;
		}

		 void setMaxFlowRate(double maxFlowRate) {
			this.maxFlowRate = maxFlowRate;
		}

		 double getCurrentFlowRate() {
			return currentFlowRate;
		}

		 void setCurrentFlowRate(double currentFlowRate) {
			this.currentFlowRate = currentFlowRate;
		}

		 String getMedium() {
			return medium;
		}

		 void setMedium(String medium) {
			this.medium = medium;
		}
		 void display() {
			    super.display();  
			    System.out.println("Min Flow Rate: " + this.minFlowRate );
			    System.out.println("Max Flow Rate: " + this.maxFlowRate );
			    System.out.println("Current Flow Rate: " + this.currentFlowRate);
			    System.out.println("Medium: " + this.medium);
			}
 
 }//FlowSensor class ends here
 

 class DemoSensors {
     public static void main(String[] args) {

         System.out.println("TemperatureSensor Default Constructor:");
         TemperatureSensor t1 = new TemperatureSensor();
         t1.display();
         System.out.println("\n");

         System.out.println("TemperatureSensor Parameterized Constructor:");
         TemperatureSensor t2 = new TemperatureSensor("Temp Sensor 2000", "ABC Corp", 0, 0,-20, 120, 36.5);
                                                      
         t2.display();
         System.out.println("\n");

         System.out.println("FlowSensor Default Constructor:");
         FlowSensor f1 = new FlowSensor();
         f1.display();
         System.out.println("\n");

         System.out.println("FlowSensor Parameterized Constructor:");
         FlowSensor f2 = new FlowSensor("Flow Sensor X", "XYZ Inc", 0, 0,5, 500, 120, "Oil");
         f2.display();
     }
 }//DemoSensors class end here



