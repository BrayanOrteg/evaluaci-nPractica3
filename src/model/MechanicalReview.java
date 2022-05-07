package model;

public class MechanicalReview extends Document{
                            
	/**
    *  Description: this var its the gas leves of the mechanical review
    * */
    private double gasLeves;

                            
	/**
    *  Description: Method constructor
	 * @param price <double>, must be initialized 
	 * @param year <int>, must be initialized
     * @param gasLeves <double>, must be initialized
    * */

    public MechanicalReview(double price, int year, double gasLeves) {
        super(price, year);

        this.gasLeves=gasLeves;

    }

    public String toString(){
        return "**MECHANICAL REVIEW**\n" + super.toString()+ "\nThe gas leves of the vehicule are: " + gasLeves;
    }
    
}