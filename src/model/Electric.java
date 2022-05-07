package model;

public class Electric extends Automobiles implements iCalculateTotalSoldPrice{

                
	/**
    *  Description: this var its the type of charger
    * */
    private TYPECHARGER typeCharger;
                
	/**
    *  Description: this var its the duration of battery
    * */
    private double duration;
                
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
     * @param typeCharger <TYPECHARGER>, must be initialized
     * @param duration <double>, must be initialized
     * @param consumption <double>, must be initialized
    * */

    public Electric(double basePrice, double soldPrice, String mark, String model, double cylinderCapacity,
    double milage, TYPEVEHICULE type, String plate, Document propertyC, Soat soat, MechanicalReview mechanical,TYPEAUTOMOBILE typeAutomobiles, int numOfDoors, String polarized,
            TYPECHARGER typeCharger, double duration, double consumption) {
        super(basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeAutomobiles, numOfDoors, polarized);

        this.typeCharger=typeCharger;
        this.duration=duration;
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

        totalSold+=basePrice+(basePrice*0.2);

        if(type==TYPEVEHICULE.USED){
            totalSold=totalSold-(totalSold*0.1);
        }

        return "The total sold price is: "+ totalSold;

    }
    
    @Override
    public String toString(){
        return super.toString() + "\nThe type of charger is: " + typeCharger + "\nThe duration are: " + duration + " Per kilometer" + 
        "\nThe consumption is: " + consumption + " kilowatts/km\n"+ totalSoldPrice();
    }

    
}