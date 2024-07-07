package mortgagecalculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Principal amount of loan 
		//Annual interest rate
		//Period in years calculates monthly payments for that loan
		//r = interest rate /12
		//n= number of payments in a year → years * 12
		//Monthly payment = Principal * ((1+r)^n/(1+r)^n-1)
//		Have user input principal amount of loan
		//convert it to int and store it
		Scanner scan = new Scanner(System.in);
		int principal = scan.nextInt();

	}

}
