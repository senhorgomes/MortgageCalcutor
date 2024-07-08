package mortgagecalculator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Principal amount of loan 
		//Annual interest rate
		//Period in years calculates monthly payments for that loan
		//r = interest rate /12 ->monthlyInterestRate
		//n= number of payments in a year → years * 12 ->periodInMonths
		// 
		//Monthly payment = Principal * (r(1+r)^n/((1+r)^n)-1)
//		Have user input principal amount of loan
		//convert it to int and store it
		System.out.print("Principal:");
		Scanner scan = new Scanner(System.in);
		int principal = scan.nextInt();
		System.out.print("Annual interest rate:");
		double annualInterestRate = scan.nextDouble();
		double monthlyInterestRate = annualInterestRate / 12;
		
		System.out.print("Period (Years):");
		int periodInMonths = scan.nextInt() * 12;
		//(1+r)
		double partOfFormula = monthlyInterestRate + 1;
		//partOfFormula^n which is periodInMonths
		double powerOfMonths = Math.pow(partOfFormula, periodInMonths);//(1+r)^n
		double bottomHalf = powerOfMonths - 1;//(1+r)^n)-1
		
		BigDecimal mainPortionOfFormula = BigDecimal.valueOf(monthlyInterestRate).multiply(BigDecimal.valueOf(powerOfMonths));
		//mainPortionOfFormula/bottomHalf
		BigDecimal divisionOfTwoParts = mainPortionOfFormula.divide(BigDecimal.valueOf(bottomHalf), 2, RoundingMode.HALF_UP);
		System.out.println(mainPortionOfFormula);
		BigDecimal monthlyPayment = divisionOfTwoParts.multiply(BigDecimal.valueOf(principal));
		System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
	}

}
