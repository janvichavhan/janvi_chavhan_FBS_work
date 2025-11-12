package Inheritance;

public class Dance {
	String danceName;
    String danceType;
    String originCountry;
    int noOfPerformers;
    String musicType;
    String costumeType;
    double performanceDuration;
    boolean isSolo;
    boolean isCultural;
    String energyLevel;
    String mainInstrumentsUsed;
    
    Dance() 
    {
        System.out.println("Default Dance Constructor Called");
        this.danceName = "Not Given";
        this.danceType = "Not Given";
        this.originCountry = "Not Given";
        this.noOfPerformers = 0;
        this.musicType = "Not Given";
        this.costumeType = "Not Given";
        this.performanceDuration = 0.0;
        this.isSolo = false;
        this.isCultural = false;
        this.energyLevel = "Not Given";
        this.mainInstrumentsUsed = "Not Given";
    }

    Dance(String danceName, String danceType, String originCountry, int noOfPerformers,
          String musicType, String costumeType, double performanceDuration,
          boolean isSolo, boolean isCultural, String energyLevel, String mainInstrumentsUsed) {
        System.out.println("Parameterized Dance Constructor Called");
        this.danceName = danceName;
        this.danceType = danceType;
        this.originCountry = originCountry;
        this.noOfPerformers = noOfPerformers;
        this.musicType = musicType;
        this.costumeType = costumeType;
        this.performanceDuration = performanceDuration;
        this.isSolo = isSolo;
        this.isCultural = isCultural;
        this.energyLevel = energyLevel;
        this.mainInstrumentsUsed = mainInstrumentsUsed;
    }
             
    public String getDanceName() {
		return danceName;
	}

	public void setDanceName(String danceName) {
		this.danceName = danceName;
	}

	public String getDanceType() {
		return danceType;
	}

	public void setDanceType(String danceType) {
		this.danceType = danceType;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public int getNoOfPerformers() {
		return noOfPerformers;
	}

	public void setNoOfPerformers(int noOfPerformers) {
		this.noOfPerformers = noOfPerformers;
	}

	public String getMusicType() {
		return musicType;
	}

	public void setMusicType(String musicType) {
		this.musicType = musicType;
	}

	public String getCostumeType() {
		return costumeType;
	}

	public void setCostumeType(String costumeType) {
		this.costumeType = costumeType;
	}

	public double getPerformanceDuration() {
		return performanceDuration;
	}

	public void setPerformanceDuration(double performanceDuration) {
		this.performanceDuration = performanceDuration;
	}

	public boolean isSolo() {
		return isSolo;
	}

	public void setSolo(boolean isSolo) {
		this.isSolo = isSolo;
	}

	public boolean isCultural() {
		return isCultural;
	}

	public void setCultural(boolean isCultural) {
		this.isCultural = isCultural;
	}

	public String getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(String energyLevel) {
		this.energyLevel = energyLevel;
	}

	public String getMainInstrumentsUsed() {
		return mainInstrumentsUsed;
	}

	public void setMainInstrumentsUsed(String mainInstrumentsUsed) {
		this.mainInstrumentsUsed = mainInstrumentsUsed;
	}

	void display() {
        System.out.println("Dance Name: " + danceName);
        System.out.println("Dance Type: " + danceType);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("No. of Performers: " + noOfPerformers);
        System.out.println("Music Type: " + musicType);
        System.out.println("Costume Type: " + costumeType);
        System.out.println("Performance Duration: " + performanceDuration );
        System.out.println("Solo Performance: " + isSolo );
        System.out.println("Cultural Dance: " + isCultural );
        System.out.println("Energy Level: " + energyLevel);
        System.out.println("Main Instruments Used: " + mainInstrumentsUsed);
    }
}//Dance Class end here 

class Kathak extends Dance {
    int ghungrooCount;
    String guruName;
    String gharana;
    int noOfChakkars;
    String performanceLevel;
    String languageOfSong;
    boolean isSoloPerformance;
    boolean hasStoryNarration;

    Kathak() {
        System.out.println("Kathak Default Constructor Called");
        this.ghungrooCount = 0;
        this.guruName = "Not Given";
        this.gharana = "Not Given";
        this.noOfChakkars = 0;
        this.performanceLevel = "Not Given";
        this.languageOfSong = "Not Given";
        this.isSoloPerformance = false;
        this.hasStoryNarration = false;
    }

    Kathak(String danceName, String danceType, String originCountry, int noOfPerformers,
            String musicType, String costumeType, double performanceDuration,
            boolean isSolo, boolean isCultural, String energyLevel, String mainInstrumentsUsed,
            int ghungrooCount, String guruName, String gharana, int noOfChakkars,
            String performanceLevel, String languageOfSong,
            boolean isSoloPerformance, boolean hasStoryNarration) 
    {

         super(danceName, danceType, originCountry, noOfPerformers,
               musicType, costumeType, performanceDuration,
              isSolo, isCultural, energyLevel, mainInstrumentsUsed);
        System.out.println("Kathak Parameterized Constructor Called");
        this.ghungrooCount = ghungrooCount;
        this.guruName = guruName;
        this.gharana = gharana;
        this.noOfChakkars = noOfChakkars;
        this.performanceLevel = performanceLevel;
        this.languageOfSong = languageOfSong;
        this.isSoloPerformance = isSoloPerformance;
        this.hasStoryNarration = hasStoryNarration;
    }
    

    public int getGhungrooCount() {
		return ghungrooCount;
	}

	public void setGhungrooCount(int ghungrooCount) {
		this.ghungrooCount = ghungrooCount;
	}

	public String getGuruName() {
		return guruName;
	}

	public void setGuruName(String guruName) {
		this.guruName = guruName;
	}

	public String getGharana() {
		return gharana;
	}

	public void setGharana(String gharana) {
		this.gharana = gharana;
	}

	public int getNoOfChakkars() {
		return noOfChakkars;
	}

	public void setNoOfChakkars(int noOfChakkars) {
		this.noOfChakkars = noOfChakkars;
	}

	public String getPerformanceLevel() {
		return performanceLevel;
	}

	public void setPerformanceLevel(String performanceLevel) {
		this.performanceLevel = performanceLevel;
	}

	public String getLanguageOfSong() {
		return languageOfSong;
	}

	public void setLanguageOfSong(String languageOfSong) {
		this.languageOfSong = languageOfSong;
	}

	public boolean isSoloPerformance() {
		return isSoloPerformance;
	}

	public void setSoloPerformance(boolean isSoloPerformance) {
		this.isSoloPerformance = isSoloPerformance;
	}

	public boolean isHasStoryNarration() {
		return hasStoryNarration;
	}

	public void setHasStoryNarration(boolean hasStoryNarration) {
		this.hasStoryNarration = hasStoryNarration;
	}

	void display() {
        System.out.println("Ghungroo Count: " + ghungrooCount);
        System.out.println("Guru Name: " + guruName);
        System.out.println("Gharana: " + gharana);
        System.out.println("No. of Chakkars: " + noOfChakkars);
        System.out.println("Performance Level: " + performanceLevel);
        System.out.println("Language of Song: " + languageOfSong);
        System.out.println("Solo Performance: " + isSoloPerformance);
        System.out.println("Has Story Narration: " + hasStoryNarration );
    }
}//Kathak class end here

class HipHop extends Dance {
    String danceCrewName;
    String styleType;
    boolean includesFreestyle;
    boolean hasBattlePerformance;
    String musicGenre;
    String stageLightingType;
    double tempoSpeed;
    boolean includesBreakdance;

    HipHop() {
        super(); 
        System.out.println("HipHop Default Constructor Called");
        this.danceCrewName = "Not Given";
        this.styleType = "Not Given";
        this.includesFreestyle = false;
        this.hasBattlePerformance = false;
        this.musicGenre = "Not Given";
        this.stageLightingType = "Not Given";
        this.tempoSpeed = 0.0;
        this.includesBreakdance = false;
    }

    HipHop(String danceName, String danceType, String originCountry, int noOfPerformers,
           String musicType, String costumeType, double performanceDuration,
           boolean isSolo, boolean isCultural, String energyLevel, String mainInstrumentsUsed,
           String danceCrewName, String styleType, boolean includesFreestyle,
           boolean hasBattlePerformance, String musicGenre, String stageLightingType,
           double tempoSpeed, boolean includesBreakdance) {

        super(danceName, danceType, originCountry, noOfPerformers,
              musicType, costumeType, performanceDuration,
              isSolo, isCultural, energyLevel, mainInstrumentsUsed);

        System.out.println("HipHop Parameterized Constructor Called");
        this.danceCrewName = danceCrewName;
        this.styleType = styleType;
        this.includesFreestyle = includesFreestyle;
        this.hasBattlePerformance = hasBattlePerformance;
        this.musicGenre = musicGenre;
        this.stageLightingType = stageLightingType;
        this.tempoSpeed = tempoSpeed;
        this.includesBreakdance = includesBreakdance;
    }

    void display() {
        System.out.println("Dance Crew Name: " + danceCrewName);
        System.out.println("Style Type: " + styleType);
        System.out.println("Includes Freestyle: " + includesFreestyle );
        System.out.println("Has Battle Performance: " + hasBattlePerformance);
        System.out.println("Music Genre: " + musicGenre);
        System.out.println("Stage Lighting Type: " + stageLightingType);
        System.out.println("Tempo Speed: " + tempoSpeed );
        System.out.println("Includes Breakdance: " + includesBreakdance );
    }
}//HipHop class end here 
class TestDance {
    public static void main(String[] args) {
        System.out.println("Default Kathak");
        Kathak k1 = new Kathak();  
        k1.display();

        System.out.println("\nKathak Details");
        Kathak k2 = new Kathak("Kathak", "Classical", "India", 1, "Tabla", "Traditional", 30.0,
                true, true, "High", "Tabla", 200, "Pandit Birju Maharaj", "Lucknow", 50, "Expert", "Hindi", true, true);
        k1.display();

        HipHop h1 = new HipHop();
        System.out.println("\nDefault HipHop");
        h1.display();

        System.out.println("\nHipHop Parameterized:");
        HipHop h2 = new HipHop("HipHop", "Street", "USA", 5, "HipHop Beats", "Urban", 10.0,
                false, false, "High", "Drums", "The CrewX", "Krump", true, true,
                "Rap", "LED", 120.0, true);
        h2.display();
    }
}//TestDance class ends here 

   

