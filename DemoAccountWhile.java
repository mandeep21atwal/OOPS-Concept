package ConditionalStatements;

import java.util.Scanner;

public class DemoAccountWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = 0;
	    double minbal = 500;
	    double depositAmt = 0;
	    //Scanner sc = new Scanner(System.in);  //uncomment when working in eclipse
	    
	    do {
	      System.out.println("$100 have been added to the account");
	      depositAmt +=100;                     // harcode different depositAmt values
	      //depositAmt = sc.nextInt();          //uncomment when working in eclipse
	    } while(depositAmt < minbal);
	    balance = depositAmt;
	    System.out.println("Transaction Complete");

	}

}
