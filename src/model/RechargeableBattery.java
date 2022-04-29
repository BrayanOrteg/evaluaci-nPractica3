package model;

public class RechargeableBattery extends Battery{

	private int chargerNumber; 
	private char type;
	private double useFullLifeCost;
	public final static char BATTERY_LITIO = 'l';
	public final static char BATTERY_NIQUEL_CADIO = 'n';
	public final static double FACTOR_LITIO = 0.92;
	public final static double FACTOR_NIQUEL_CADIO = 0.80;



	public RechargeableBattery (String name, double voltage, double cost, double capacity, int chargerNumber, char type){
		super(name, voltage, cost, capacity);
		this.chargerNumber=chargerNumber;
		this.type=type;
		this.useFullLifeCost=useFullLifeCost;
	}

	public double calculateUseFullLifeCost(){

		if (type=='l'){
			useFullLifeCost= (super.getCost()*super.getVoltage()*super.getCapacity())/(1000*chargerNumber*FACTOR_LITIO);
		}else{
			useFullLifeCost= (super.getCost()*super.getVoltage()*super.getCapacity())/(1000*chargerNumber*FACTOR_NIQUEL_CADIO);
		}

		return useFullLifeCost;
	}


	public String toString(){
		return super.toString()+ " \nla cantidad de cargas posibles son: "+ chargerNumber+" \ny es de tipo: " + type;
	}

}