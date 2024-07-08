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
		System.out.print("Principal:");
		Scanner scan = new Scanner(System.in);
		int principal = scan.nextInt();
		System.out.print("Annual interest rate:");
		double annualInterestRate = scan.nextDouble();
		System.out.print(principal +" "+ annualInterestRate);
	}

}
