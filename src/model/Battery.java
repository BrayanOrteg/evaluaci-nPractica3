package model;

public class Battery{

	protected String name;
	protected double voltage; 
	protected double cost;
	protected double capacity;  


	public Battery(String name, double voltage, double cost, double capacity){
		this.name=name;
		this.voltage=voltage;
		this.cost=cost;
		this.capacity=capacity;
	}

	public String getName(){
		return name;
	}

	public double getVoltage(){
		return voltage;
	}

	public double getCost(){
		return cost;
	}

	public double getCapacity(){
		return capacity;
	}

	public String toString(){
		return "El nombre de la bateria es: "+ name+"\nsu voltage es: "+voltage+ "\nsu costo es: "+ cost+ "\nsu capacidad es de: "+ capacity+ "AH ";
	}
}