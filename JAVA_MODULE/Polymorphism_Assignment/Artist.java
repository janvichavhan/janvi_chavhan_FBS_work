package Polymorphism;

class Artist {

    String artistName;
    int experienceYears;
    String artType;
    double baseIncome;

    // Default Constructor
    Artist() {
        System.out.println("Artist Default Constructor Called");
        this.artistName = "Not Given";
        this.experienceYears = 0;
        this.artType = "General Art";
        this.baseIncome = 0.0;
    }

    // Parameterized Constructor
    Artist(String artistName, int experienceYears, String artType, double baseIncome) {
        System.out.println("Artist Parameterized Constructor Called");
        this.artistName = artistName;
        this.experienceYears = experienceYears;
        this.artType = artType;
        this.baseIncome = baseIncome;
    }

   
    public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public String getArtType() {
		return artType;
	}

	public void setArtType(String artType) {
		this.artType = artType;
	}

	public double getBaseIncome() {
		return baseIncome;
	}

	public void setBaseIncome(double baseIncome) {
		this.baseIncome = baseIncome;
	}

	double calculateIncome() {
        return baseIncome;
    }

    void display() {
        System.out.println("Artist Name: " + artistName);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("Art Type: " + artType);
        System.out.println("Base Income: ₹" + baseIncome);
    }
} //Artistclass ends here

class Singer extends Artist {

    int showsPerMonth;
    double earningPerShow;

    Singer() {
        super();
        System.out.println("Singer Default Constructor Called");
        this.showsPerMonth = 0;
        this.earningPerShow = 0.0;
        this.artType = "Singing";
    }

    Singer(String artistName, int experienceYears, double baseIncome, int showsPerMonth, double earningPerShow) {
        super(artistName, experienceYears, "Singing", baseIncome);
        System.out.println("Singer Parameterized Constructor Called");
        this.showsPerMonth = showsPerMonth;
        this.earningPerShow = earningPerShow;
    }

    
    public int getShowsPerMonth() {
		return showsPerMonth;
	}

	public void setShowsPerMonth(int showsPerMonth) {
		this.showsPerMonth = showsPerMonth;
	}

	public double getEarningPerShow() {
		return earningPerShow;
	}

	public void setEarningPerShow(double earningPerShow) {
		this.earningPerShow = earningPerShow;
	}

	double calculateIncome() {
        return baseIncome + (showsPerMonth * earningPerShow);
    }

    
    void display() {
        super.display();
        System.out.println("Shows Per Month: " + showsPerMonth);
        System.out.println("Earning Per Show: ₹" + earningPerShow);
        System.out.println("Total Monthly Income: ₹" + calculateIncome());
    }
}

class Painter extends Artist {

    int paintingsSold;
    double pricePerPainting;

    Painter() {
        super();
        System.out.println("Painter Default Constructor Called");
        this.paintingsSold = 0;
        this.pricePerPainting = 0.0;
        this.artType = "Painting";
    }

    Painter(String artistName, int experienceYears, double baseIncome, int paintingsSold, double pricePerPainting) {
        super(artistName, experienceYears, "Painting", baseIncome);
        System.out.println("Painter Parameterized Constructor Called");
        this.paintingsSold = paintingsSold;
        this.pricePerPainting = pricePerPainting;
    }

    
    public int getPaintingsSold() {
		return paintingsSold;
	}

	public void setPaintingsSold(int paintingsSold) {
		this.paintingsSold = paintingsSold;
	}

	public double getPricePerPainting() {
		return pricePerPainting;
	}

	public void setPricePerPainting(double pricePerPainting) {
		this.pricePerPainting = pricePerPainting;
	}

	double calculateIncome() {
        return baseIncome + (paintingsSold * pricePerPainting);
    }

    
    void display() {
        super.display();
        System.out.println("Paintings Sold: " + paintingsSold);
        System.out.println("Price Per Painting: ₹" + pricePerPainting);
        System.out.println("Total Monthly Income: ₹" + calculateIncome());
    }
}

class Actor extends Artist {

    int moviesDone;
    double earningPerMovie;

    Actor() {
        super();
        System.out.println("Actor Default Constructor Called");
        this.moviesDone = 0;
        this.earningPerMovie = 0.0;
        this.artType = "Acting";
    }

    Actor(String artistName, int experienceYears, double baseIncome, int moviesDone, double earningPerMovie) {
        super(artistName, experienceYears, "Acting", baseIncome);
        System.out.println("Actor Parameterized Constructor Called");
        this.moviesDone = moviesDone;
        this.earningPerMovie = earningPerMovie;
    }

    
    public int getMoviesDone() {
		return moviesDone;
	}

	public void setMoviesDone(int moviesDone) {
		this.moviesDone = moviesDone;
	}

	public double getEarningPerMovie() {
		return earningPerMovie;
	}

	public void setEarningPerMovie(double earningPerMovie) {
		this.earningPerMovie = earningPerMovie;
	}

	double calculateIncome() {
        return baseIncome + (moviesDone * earningPerMovie);
    }

    
    void display() {
        super.display();
        System.out.println("Movies Done: " + moviesDone);
        System.out.println("Earning Per Movie: ₹" + earningPerMovie);
        System.out.println("Total Income: ₹" + calculateIncome());
    }
}

class DemoArtist {
    public static void main(String[] args) {

        System.out.println("Demonstrating Polymorphism with Artists ===\n");

        Artist artist;

        artist = new Singer("Arijit Singh", 12, 50000, 10, 15000);
        artist.display();
        
        System.out.println("\n\n");

        artist = new Painter("M.F. Hussain", 30, 40000, 5, 20000);
        artist.display();
        System.out.println("\n\n");

        artist = new Actor("Ranbir Kapoor", 15, 100000, 3, 500000);
        artist.display();
    }
}

