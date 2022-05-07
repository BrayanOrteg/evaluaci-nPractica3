package model;

public class Automobiles extends Vehicule{


            
	/**
    *  Description: this var its the type of automobile
    * */
    private TYPEAUTOMOBILE typeAutomobiles;
            
	/**
    *  Description: this var its the num of doors
    * */
    private int numOfDoors;
            
	/**
    *  Description: this var its the polarized of the car
    * */
    private String polarized;

        
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
    * */

    public Automobiles(double basePrice, double soldPrice, String mark, String model, double cylinderCapacity,
            double milage, TYPEVEHICULE type, String plate,Document propertyC, Soat soat, MechanicalReview mechanical,TYPEAUTOMOBILE typeAutomobiles, int numOfDoors, String polarized) {
        super(basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical);

        this.typeAutomobiles=typeAutomobiles;
        this.numOfDoors=numOfDoors;
        this.polarized=polarized;
    }

    
    @Override
    public String toString(){
        return "\nThe type of automobile is: " + typeAutomobiles + "\nThe num of doors are: " + numOfDoors + 
        "\nPolarized: " + polarized + "\n"+ super.toString() ; 
    }

    
}