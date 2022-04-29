package model;

public class Company{
	
    public static final int MAX_BATTERIES = 10;
	private Battery[] batteries;

	public Company() {
        this.batteries = new Battery[MAX_BATTERIES];
	}

    public Company(Battery[] batteries){
        this.batteries = batteries;
    }
	

    public void registerBattery(String name, double voltage, double cost, double capacity){
        int emtyPos = getEmtyPosition();
        batteries[emtyPos] = new Battery(name, voltage, cost, capacity);

    }

    public void registerRechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, char type) {
        int emtyPos = getEmtyPosition();
        batteries[emtyPos] = new RechargeableBattery(name, voltage, cost, capacity, chargerNumber ,type);
        
    }
    
    private int getEmtyPosition() {
        int pos = -1;
        for (int i = 0; i < MAX_BATTERIES && pos == -1; i++) {
            if (batteries[i] == null) {
                pos = i;
            }
        }
        return pos;
    }

    public String showTotalBatteries() {
    	 int numBatteries =0;
         int numRechargeableBatteries =0;
         for(int i =0; i<MAX_BATTERIES; i++){
            if (batteries [i] != null && batteries[i] instanceof Battery){
                numBatteries ++;
            }else{
                numRechargeableBatteries ++;
            }
         }  

        return "El numero de baterias tradicionales es: " + numBatteries + "\n El numero de baterias recargables es: "+ numRechargeableBatteries;
    }
    
    public String showBatteriesInfo() {
    	String str = "";

        for (int i =0; i<MAX_BATTERIES; i++){
            if(batteries[i]!=null){
                str+= batteries[i].toString()+ "\n";
            }
        }
    	return str;
    }
    

	public double calculateUsefulPromLifeCost(){
		int numOfBatteriesRechargeable=0;
        double prom=0;
        double sum=0;

        for (int i= 0; i<MAX_BATTERIES;i++){
            if(batteries[i]!=null && batteries[i] instanceof RechargeableBattery){
                sum += ((RechargeableBattery)batteries[i]).calculateUseFullLifeCost();
                numOfBatteriesRechargeable++;
            }
        }

        prom=sum/numOfBatteriesRechargeable;

        return prom;
	}

}
