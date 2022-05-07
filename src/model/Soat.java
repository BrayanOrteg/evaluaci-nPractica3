package model;


public class Soat extends Document{
                            
	/**
    *  Description: this var its the coverage of the soat
    * */
    private double coverage;
                        
	/**
    *  Description: Method constructor
	 * @param price <double>, must be initialized 
	 * @param year <int>, must be initialized
     * @param coverage <double>, must be initialized
    * */
    public Soat(double price, int year, double coverage) {
        super(price, year);

        this.coverage= coverage;
        
    }

    public String toString(){
        return "**SOAT**\n"+ super.toString() + "\nThe coverage of the soat is: " + coverage + "\n";
    }
    
}