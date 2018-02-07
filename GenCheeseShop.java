import java.util.Random;
import java.util.Scanner;

public class GenCheeseShop {

	public static void main(String[] args) {
		
		

	Scanner input = new Scanner(System.in);
	

	double subtotal= 0.00;
	double sharptotal = 0.00;
	double brietotal = 0.00;
	double swisstotal = 0.00;
	double discount = 0.00;
	double total = 0.00;
	int sharp1lbs = 0;
	int brie1lbs = 0;
	int swiss1lbs = 0;
	int display= 0;
	
	final int MAXCHEESE = 3;
		
	String[] names = new String[MAXCHEESE];
	
	double[] prices = new double[MAXCHEESE];
	
	int[] amounts = new int[MAXCHEESE];
		
       for (int i = 0; i < MAXCHEESE; ++i){
	   names[0] = "Dalaran Sharp";
       prices[0] = 1.25;
       break;
        }
		
        
		for (int i = 1; i < MAXCHEESE; ++i) {
		names[1] = "Stormwind Brie";
		prices[1] = 10.00;
		break;
		}
		
		for (int i = 2; i < MAXCHEESE; ++i) {
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
		break;
		}
		
		
 		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
 		
 		for (int i = 0; i < MAXCHEESE; ++i) {
        System.out.println(names[0] + ": $" + prices[0] + " per pound");
        break;
        
 		}
		
        for (int i = 1; i < MAXCHEESE; ++i) {
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
		break;
		
        }
		
		for (int i = 2; i < MAXCHEESE; ++i) {
		System.out.println(names[2] + ": $" + prices[2] + " per pound");
		break;
		
		}
		
		
 		Random ranGen = new Random(100);

		for (int i = 3; i < MAXCHEESE; ++i) {
		names[i] = "Cheese Type " + (char)('A' + i);
		prices[i] = ranGen.nextInt(1000)/100.0;
		amounts[i] = 0;
		
		
        System.out.println(names[i] + ": $" + prices[i] + " per pound");
     
		}
        
		
		
		for(int i = 0; i < MAXCHEESE; ++i) {
		System.out.println("Enter the amount of Dalaran Sharp in lbs: ");
		 sharp1lbs = input.nextInt();
		 sharptotal = prices[0] * sharp1lbs;
		 break; }
		
		
	
		for (int i = 1; i < MAXCHEESE; ++i) {
		System.out.println("Enter the amount of Stormwind Brie in lbs: ");
		 brie1lbs = input.nextInt();
		 brietotal = prices[1] * brie1lbs;
		 break;
		}
		 
		 
		for(int i = 2; i < MAXCHEESE; ++i) {
        System.out.println("Enter the amount of Alterac Swiss in lbs: ");
        swiss1lbs =  input.nextInt();
        swisstotal = prices[2] * swiss1lbs;
        break;
		}
        
		int Chessetype = 0;
		double chessetotal = 0.00;
		
		
		for (int i = 3; i < MAXCHEESE; ++i) {
		System.out.println("Enter the amount of Cheese Type " + (char)('A' + i) + ":");
		Chessetype = input.nextInt();
		chessetotal = prices[i] * Chessetype;
		continue;
		}
		
        
        subtotal = sharptotal + brietotal + swisstotal + chessetotal;
        
        if (subtotal >= 100)
        discount = 25.00;
        else if (subtotal >= 50.00)
        discount =10.00;
        else 
        discount = 0.00;
        
        total = subtotal - discount; 
        
        System.out.println("Display the itemized list? (1 for yes)");

        			
        display = input.nextInt();
       
       
        if (display == 1) {
        if (sharp1lbs != 0) {
        System.out.println(sharp1lbs + " lbs of Sharp " +"@ " + names[0] + " = " + "$" + sharptotal);
        	}
        if (brie1lbs != 0) {
        System.out.println(brie1lbs + " lbs of Brie " + "@ " + names[1]+ " = " +"$" + brietotal);
        }
        if (swiss1lbs != 0) {
        System.out.println(swiss1lbs + " lbs of Swiss " + "@ " + names[2] + " = " + "$" + swisstotal);
        }
	    for (int i = 3; i < MAXCHEESE; ++i){
		names[i] = "Cheese Type " + (char)('A' + i);
		prices[i] = ranGen.nextInt(1000)/100.0;
		amounts[i] = 0;
	    	if (Chessetype != 0) {
        	System.out.println(Chessetype + " lbs of Cheese Type" + names[i] + " @ " + prices[1] + " = " + "$" + chessetotal);
        }
	    }
        }
        	
        System.out.println("Sub Total: " + "$" + subtotal);
        System.out.println("-Discount: " + "$" + discount);
        System.out.println("Total: " + "$" + total);
		}
	
}


