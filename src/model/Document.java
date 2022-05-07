package model;

import java.util.ArrayList;

public class Document {
                        
	/**
    *  Description: this var its the price of the document
    * */
    private double price;
                            
	/**
    *  Description: this var its the year of the document
    * */
    private int year;
                            
	/**
    *  Description: this var its the image of the document
    * */
    private ArrayList<int[][]> image;

                        
	/**
    *  Description: Method constructor
	 * @param price <double>, must be initialized 
	 * @param year <int>, must be initialized
    * */
    public Document(double price, int year){
        this.price=price;
        this.year=year;
  

        image= new ArrayList<int[][]>();
    }



    public int getYear(){
        return year;
    }
    

    public String toString(){
        return "\nThe price of the document is: "+ price + "\nThe year is: " + year + "\nThe image= none" + "\n";
    }



    
}