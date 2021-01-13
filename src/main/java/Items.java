/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sully Khalifa
 */
public class Items {
    
    	// A constructor
		Items(String n, int c, double p, int q){
			name = n;
			code = c;
			price = p;
			qty = q;
		
		}
                //properties
		String name;
		int code;
		double price;
		int qty;
		
		
		// Method 1
		String getName(){
			return name;
		}
                
                //method 2 to update the quantity 
                int updateQty (int newQty) {
                   if (newQty <= qty){
                       
                    
                   qty -= newQty;
                   System.out.println("The current stock is " + qty);
                   return qty;
                   
                   } else {
                     System.out.println("Out of Stock");
                     return qty; 
                   }
                  
                } 
		
		// Method 3: display details of an object
		void details(){
			System.out.println(  code + " \t: " +  name + " \t: " + price + " \t: " + qty      );
		}
                //Method 4 to check the stock
                int checkStock ( ) { 
                    System.out.println("The current stock is  " );
                return qty;
                }
}
