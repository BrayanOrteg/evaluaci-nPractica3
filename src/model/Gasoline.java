package model;

public class Gasoline extends Automobiles implements iCalculateTotalSoldPrice{

                    
	/**
    *  Description: this var its the tank capacity of the car
    * */
    private double tankCapacity;
                    
	/**
    *  Description: this var its the type of gasoline
    * */
    private TYPEGASOLINE typeGasoline;
                    
	/**
    *  Description: this var its the consumption of the car
    * */
    private double consumption;




                
	/**
    *  Description: Method constructor
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <String>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param propertyC <Document>, must be initialized
     * @param soat <Soat>, must be initialized
     * @param mechanical <MechanicalReview>, must be initialized
     * @param typeAutomobiles <TYPEAUTOMOBILE>, must be initialized
     * @param numOfDoors <int>, must be initialized
     * @param polarized <String>, must be initialized
     * @param tankCapacity <double>, must be initialized
     * @param typeGasoline <TYPEGASOLINE>, must be initialized
     * @param consumption <double>, must be initialized
    * */

    public Gasoline(double basePrice, double soldPrice, String mark, String model, double cylinderCapacity,
    double milage, TYPEVEHICULE type, String plate, Document propertyC, Soat soat, MechanicalReview mechanical,TYPEAUTOMOBILE typeAutomobiles, int numOfDoors, String polarized, double tankCapacity,
            TYPEGASOLINE typeGasoline, double consumption) {
        super(basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeAutomobiles, numOfDoors, polarized);

        this.tankCapacity=tankCapacity;
        this.typeGasoline=typeGasoline;
        this.consumption=consumption;


    }


    /**
     * Description: Method to calculate the total sold price
     * @return<String>
     */
    @Override
    public String totalSoldPrice(){
        double totalSold=0;
        int yearSoatt=documents[1].getYear();
        int yearMechanical=documents[2].getYear();
        
        if (yearSoatt==0 || yearMechanical==0){
            totalSold+=500000;
        }

        totalSold+=basePrice;

        if(type==TYPEVEHICULE.USED){
            totalSold=totalSold-(totalSold*0.1);
        }

        return "The total sold price is: "+ totalSold;

    }

    
    @Override
    public String toString(){
        return super.toString() + "\nthe tank capacity of the automobile are: " + tankCapacity + " gallons" + "\nthe type of galosine is: " 
        + typeGasoline + "\nThe consumption is: " + consumption + " gallons/km\n"+ totalSoldPrice();
    }


}