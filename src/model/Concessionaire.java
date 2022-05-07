package model;

import java.util.ArrayList;

public class Concessionaire{
    
	/**
    *  Description: this var its the arrayList of vehicules
    * */
    private ArrayList<Vehicule> vehicules;
    
	/**
    *  Description: this var saves the name of the concessionaire
    * */
    private String name;
    
	/**
    *  Description: this var its the array of documents for the
    * */
    protected Document [] documentsConsesionaire;

    public Concessionaire(String name){

        vehicules= new ArrayList<Vehicule>();
        this.name=name; 
        documentsConsesionaire= new Document[3];
    }

    
	/**
    *  Description: Method to add a gasoline car in the arrayList
	 * @param typeVehicule <int>, must be initialized
	 * @param typeAutomobil <int>, must be initialized
	 * @param typeGasolin <int>, must be initialized
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <String>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param numOfDoors <int>, must be initialized
     * @param polarized <String>, must be initialized
     * @param tankCapacity <double>, must be initialized
     * @param consumption <double>, must be initialized
     * @param priceProperty <double>, must be initialized
     * @param yearProperty <int>, must be initialized
     * @param priceSoat <double>, must be initialized
     * @param yearSoat <int>, must be initialized
     * @param coverageSoat <double>, must be initialized
     * @param priceReview <double>, must be initialized
     * @param yearReview <int>, must be initialized
     * @param gasLevesReview <double>, must be initialized
    * */

    //Gasoline
    public void addGasolineAutomobile(int typeVehicule, int typeAutomobil, int typeGasolin, double basePrice, double soldPrice, String mark, String model, 
            double cylinderCapacity, double milage, String plate, int numOfDoors, String polarized, double tankCapacity,
            double consumption, double priceProperty, int yearProperty, double priceSoat, int yearSoat, double coverageSoat, double priceReview, int yearReview,
            double gasLevesReview){

                TYPEAUTOMOBILE typeAutomobiles;
                TYPEGASOLINE typeGasoline;
                TYPEVEHICULE type;
                
                Gasoline car;



                switch(typeGasolin) {

                    case 1:
                        typeGasoline=TYPEGASOLINE.EXTRA;


    
                        break;
                    case 2:
                        typeGasoline=TYPEGASOLINE.CURRENT;
    
                        break;

                    case 3:
                        typeGasoline=TYPEGASOLINE.DIESEL;
    
                        break;
    
                    default:
                        System.out.println("Error");
                        typeGasoline=TYPEGASOLINE.DIESEL;
                }

                switch(typeAutomobil) {

                    case 1:
                        typeAutomobiles=TYPEAUTOMOBILE.SEDAN;


    
                        break;
                    case 2:
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;
    
                        break;
    
                    default:
                        System.out.println("Error");
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;
                }
                        
                switch(typeVehicule) {

                    case 1:
                        type=TYPEVEHICULE.NEW;


    
                        break;
                    case 2:
                        type=TYPEVEHICULE.USED;
    
                        break;
    
                    default:
                        System.out.println("Error");
                        type=TYPEVEHICULE.USED;
                }

                        Document propertyC =new Document(priceProperty, yearProperty);
                        Soat soat=new Soat(priceSoat, yearSoat, coverageSoat);
                        MechanicalReview mechanical=new MechanicalReview(priceReview, yearReview, gasLevesReview);

                        car= new Gasoline(basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeAutomobiles, numOfDoors, polarized, tankCapacity, typeGasoline, consumption);
                        vehicules.add(car);
        }

            
	/**
    *  Description: Method to add a electric car in the arrayList
	 * @param typeVehicule <int>, must be initialized
	 * @param typeAutomobil <int>, must be initialized
	 * @param typeCharge <int>, must be initialized
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <String>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param numOfDoors <int>, must be initialized
     * @param polarized <String>, must be initialized
     * @param duration <double>, must be initialized
     * @param consumption <double>, must be initialized
     * @param priceProperty <double>, must be initialized
     * @param yearProperty <int>, must be initialized
     * @param priceSoat <double>, must be initialized
     * @param yearSoat <int>, must be initialized
     * @param coverageSoat <double>, must be initialized
     * @param priceReview <double>, must be initialized
     * @param yearReview <int>, must be initialized
     * @param gasLevesReview <double>, must be initialized
    * */

    //Electric
    public void addElectricAutomobile(int typeVehicule, int typeAutomobil, int typeCharge, double basePrice, double soldPrice, String mark, String model, 
            double cylinderCapacity, double milage, String plate, int numOfDoors, String polarized, double duration, double consumption,
            double priceProperty, int yearProperty, double priceSoat, int yearSoat, double coverageSoat, double priceReview, int yearReview,
            double gasLevesReview){

                TYPEAUTOMOBILE typeAutomobiles;
                TYPECHARGER typeCharger;
                TYPEVEHICULE type;
                
                Electric car;


                switch(typeCharge) {

                    case 1:
                        typeCharger=TYPECHARGER.FAST;



                        break;
                    case 2:
                        typeCharger=TYPECHARGER.NORMAL;

                        break;

                    default:
                        System.out.println("Error");
                        typeCharger=TYPECHARGER.NORMAL;
                }

                switch(typeAutomobil) {

                    case 1:
                        typeAutomobiles=TYPEAUTOMOBILE.SEDAN;



                        break;
                    case 2:
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;

                        break;

                    default:
                        System.out.println("Error");
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;
                }
                        
                switch(typeVehicule) {

                    case 1:
                        type=TYPEVEHICULE.NEW;



                        break;
                    case 2:
                        type=TYPEVEHICULE.USED;

                        break;

                    default:
                        System.out.println("Error");
                        type=TYPEVEHICULE.USED;
                }

                        Document propertyC=new Document(priceProperty, yearProperty);
                        Soat soat=new Soat(priceSoat, yearSoat, coverageSoat);
                        MechanicalReview mechanical=new MechanicalReview(priceReview, yearReview, gasLevesReview);

                        car= new Electric(basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeAutomobiles, numOfDoors, polarized, typeCharger, duration, consumption);
                        vehicules.add(car);

    }

                
	/**
    *  Description: Method to add a hybrid car in the arrayList
	 * @param typeVehicule <int>, must be initialized
	 * @param typeAutomobil <int>, must be initialized
	 * @param typeCharge <int>, must be initialized
     * @param typeGasolin <int>, must be initialized
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <String>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param numOfDoors <int>, must be initialized
     * @param polarized <String>, must be initialized
     * @param duration <double>, must be initialized
     * @param consumptionElectric <double>, must be initialized
     * @param tankCapacity <double>, must be initialized
     * @param consumptionGas <double>, must be initialized
     * @param priceProperty <double>, must be initialized
     * @param yearProperty <int>, must be initialized
     * @param priceSoat <double>, must be initialized
     * @param yearSoat <int>, must be initialized
     * @param coverageSoat <double>, must be initialized
     * @param priceReview <double>, must be initialized
     * @param yearReview <int>, must be initialized
     * @param gasLevesReview <double>, must be initialized
    * */
    
    //Hybrid
    public void addHybridAutomobile(int typeVehicule, int typeAutomobil, int typeCharge, int typeGasolin, double basePrice, double soldPrice, String mark, String model, 
            double cylinderCapacity, double milage, String plate, int numOfDoors, String polarized, double duration, double consumptionElectric,double tankCapacity,double consumptionGas,
            double priceProperty, int yearProperty, double priceSoat, int yearSoat, double coverageSoat, double priceReview, int yearReview,
            double gasLevesReview){

                TYPEAUTOMOBILE typeAutomobiles;
                TYPECHARGER typeCharger;
                TYPEVEHICULE type;
                TYPEGASOLINE typeGasoline;
                
                Hybrid car;


                switch(typeGasolin) {

                    case 1:
                        typeGasoline=TYPEGASOLINE.EXTRA;


    
                        break;
                    case 2:
                        typeGasoline=TYPEGASOLINE.CURRENT;
    
                        break;

                    case 3:
                        typeGasoline=TYPEGASOLINE.DIESEL;
    
                        break;
    
                    default:
                        System.out.println("Error");
                        typeGasoline=TYPEGASOLINE.EXTRA;
                }

                switch(typeCharge) {

                    case 1:
                        typeCharger=TYPECHARGER.FAST;



                        break;
                    case 2:
                        typeCharger=TYPECHARGER.NORMAL;

                        break;

                    default:
                        System.out.println("Error");
                        typeCharger=TYPECHARGER.FAST;
                }

                switch(typeAutomobil) {

                    case 1:
                        typeAutomobiles=TYPEAUTOMOBILE.SEDAN;



                        break;
                    case 2:
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;

                        break;

                    default:
                        System.out.println("Error");
                        typeAutomobiles=TYPEAUTOMOBILE.SEDAN;
                }
                        
                switch(typeVehicule) {

                    case 1:
                        type=TYPEVEHICULE.NEW;



                        break;
                    case 2:
                        type=TYPEVEHICULE.USED;

                        break;

                    default:
                        System.out.println("Error");
                        type=TYPEVEHICULE.NEW;
                }

                        Document propertyC=new Document(priceProperty, yearProperty);
                        Soat soat=new Soat(priceSoat, yearSoat, coverageSoat);
                        MechanicalReview mechanical=new MechanicalReview(priceReview, yearReview, gasLevesReview);

                        car= new Hybrid(basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeAutomobiles, numOfDoors, polarized, tankCapacity, typeGasoline, consumptionGas, typeCharger, duration, consumptionElectric);
                        vehicules.add(car);
    }

                    
	/**
    *  Description: Method to add a motorcycle in the arrayList
	 * @param typeVehicule <int>, must be initialized
	 * @param typeMotorcy <int>, must be initialized
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <String>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param capacityGasoline <double>, must be initialized
     * @param consumption <double>, must be initialized
     * @param priceProperty <double>, must be initialized
     * @param yearProperty <int>, must be initialized
     * @param priceSoat <double>, must be initialized
     * @param yearSoat <int>, must be initialized
     * @param coverageSoat <double>, must be initialized
     * @param priceReview <double>, must be initialized
     * @param yearReview <int>, must be initialized
     * @param gasLevesReview <double>, must be initialized
    * */

    //Motorcycle
    public void addMotorVehicule(int typeVehicule, int typeMotorcy, double basePrice, double soldPrice, String mark, String model, 
            double cylinderCapacity, double milage, String plate, double capacityGasoline, double consumption,
            double priceProperty, int yearProperty, double priceSoat, int yearSoat, double coverageSoat, double priceReview, int yearReview,
            double gasLevesReview){

                TYPEMOTORCYCLE typeMotorcycle;
                TYPEVEHICULE type;
                
                Motorcycle motorcycle;



                switch(typeMotorcy) {

                    case 1:
                        typeMotorcycle=TYPEMOTORCYCLE.STANDARD;



                        break;
                    case 2:
                        typeMotorcycle=TYPEMOTORCYCLE.SPORTY;

                        break;

                    case 3:
                        typeMotorcycle=TYPEMOTORCYCLE.SCOOTER;

                        break;
                        
                    case 4:
                        typeMotorcycle=TYPEMOTORCYCLE.CROSS;

                    break;

                    default:
                        System.out.println("Error");
                        typeMotorcycle=TYPEMOTORCYCLE.CROSS;
                }

                        
                switch(typeVehicule) {

                    case 1:
                        type=TYPEVEHICULE.NEW;



                        break;
                    case 2:
                        type=TYPEVEHICULE.USED;

                        break;

                    default:
                        System.out.println("Error");
                        type=TYPEVEHICULE.USED;
                }

                        Document propertyC=new Document(priceProperty, yearProperty);
                        Soat soat=new Soat(priceSoat, yearSoat, coverageSoat);
                        MechanicalReview mechanical=new MechanicalReview(priceReview, yearReview, gasLevesReview);
                        motorcycle= new Motorcycle(basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeMotorcycle, capacityGasoline, consumption);
                        vehicules.add(motorcycle);
        }


    /**
    *  Description: Method to print the information of the vehicules
	 * @param typeVehicule <int>, must be initialized
     * @param typeCombustible <int>, must be initialized
     * */    
    //PRINT INFORMATION
    public void printVehiculeInformation(int typeVehicule, int typeCombustible){

        int contGasolineCars=0, countElectricCars=0, countHibridCars=0, countMotorcycle=0;

        System.out.println("***CARS***");

        switch(typeVehicule){

            case 1:

                switch(typeCombustible){

                    case 1:

                        //GASOLINE CARS
                        //NEW

                        System.out.println("**NEW GASOLINE CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Gasoline && comparedVehicule==TYPEVEHICULE.NEW){
                                System.out.println(((Gasoline)vehicules.get(i)).toString());
                                contGasolineCars++;
                            }

                        }
                        if(contGasolineCars==0){
                            System.out.println("The concessionaire dont have New Gasoline cars");
                            
                        }
                        contGasolineCars=0;


                        //USED

                        System.out.println("");
                        System.out.println("**USED GASOLINE CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Gasoline && comparedVehicule==TYPEVEHICULE.USED){
                                System.out.println(((Gasoline)vehicules.get(i)).toString());
                                contGasolineCars++;
                            }

                        }
                        if(contGasolineCars==0){
                            System.out.println("The concessionaire dont have Used Gasoline cars");

                        }


                    break;

                    case 2:
                        //ElECTRIC CARS
                        //NEW

                        System.out.println("");
                        System.out.println("**NEW ELECTRIC CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Electric && comparedVehicule==TYPEVEHICULE.NEW){
                                System.out.println(((Electric)vehicules.get(i)).toString());
                                countElectricCars++;
                            }

                        }
                        if(countElectricCars==0){
                            System.out.println("The concessionaire dont have New Electric cars");
                            

                        }
                        countElectricCars=0;

                        //USED

                        System.out.println("");
                        System.out.println("**USED ELECTRIC CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Electric && comparedVehicule==TYPEVEHICULE.USED){
                                System.out.println(((Electric)vehicules.get(i)).toString());
                                countElectricCars++;
                            }

                        }
                        if(countElectricCars==0){
                            System.out.println("The concessionaire dont have Used Electric cars");
                        }

        

                    break;

                    case 3:
                    
                        
                        //HYBRID CARS
                        //NEW

                        System.out.println("");
                        System.out.println("**NEW HYBRID CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Hybrid && comparedVehicule==TYPEVEHICULE.NEW){
                                System.out.println(((Hybrid)vehicules.get(i)).toString());
                                countHibridCars++;
                            }

                        }
                        if(countHibridCars==0){
                            System.out.println("The concessionaire dont have New Hybrid cars");

                        }
                        countHibridCars=0;

                        //USED

                        System.out.println("");
                        System.out.println("**USED HYBRID CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Hybrid && comparedVehicule==TYPEVEHICULE.USED){
                                System.out.println(((Hybrid)vehicules.get(i)).toString());
                                countHibridCars++;
                            }


                        }
                        if(countHibridCars==0){
                            System.out.println("The concessionaire dont have Used Hybrid cars");
                        }


                    break;

                    default:

                    System.out.println("Not valid value");
                }



            break;

            case 2:
            
                //MOTORCYCLE


                System.out.println("***MOTORCYCLES***");

                //NEW

                System.out.println("**NEW MOTORCYCLES**");
                System.out.println("");
                for(int i=0; i < vehicules.size(); i++){
                    
                    TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                    if(vehicules.get(i) instanceof Motorcycle && comparedVehicule==TYPEVEHICULE.NEW){
                        System.out.println(((Motorcycle)vehicules.get(i)).toString());
                        countMotorcycle++;
                    }

                }
                if(countMotorcycle==0){
                    System.out.println("The concessionaire dont have New Motorcycles");
                    
                }
                countMotorcycle=0;


                //USED

                System.out.println("");
                System.out.println("**USED MOTORCYCLES**");
                System.out.println("");
                for(int i=0; i < vehicules.size(); i++){
                    
                    TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                    if(vehicules.get(i) instanceof Motorcycle && comparedVehicule==TYPEVEHICULE.USED){
                        System.out.println(((Motorcycle)vehicules.get(i)).toString());
                        countMotorcycle++;
                    }

                }
                if(countMotorcycle==0){
                    System.out.println("The concessionaire dont have Used Motorcycles");

                }
            

            break;


            default:

            System.out.println("Not valid value");
        }
       
  

        
    }


}
