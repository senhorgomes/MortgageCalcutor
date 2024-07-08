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
		//r = interest rate /12
		//n= number of payments in a year → years * 12
		//Monthly payment = Principal * ((1+r)^n/(1+r)^n-1)
//		Have user input principal amount of loan
		//convert it to int and store it
		System.out.print("Principal:");
		Scanner scan = new Scanner(System.in);
		int principal = scan.nextInt();
		System.out.print("Annual interest rate:");
		BigDecimal annualInterestRate = scan.nextBigDecimal();
		BigDecimal amountOfMonthsInAYear = BigDecimal.valueOf(12);
		BigDecimal monthlyInterestRate = annualInterestRate.divide(amountOfMonthsInAYear, 2, RoundingMode.HALF_UP);
		System.out.print("Period (Years):");
		int periodInMonths = scan.nextInt() * 12;
		BigDecimal partOfFormula = monthlyInterestRate.add(BigDecimal.valueOf(1));
		BigDecimal topHalf = partOfFormula.pow(periodInMonths);
		BigDecimal bottomHalf = partOfFormula.pow(periodInMonths - 1);
		BigDecimal mainPortionOfFormula = topHalf.divide(bottomHalf);
		BigDecimal monthlyPayment = mainPortionOfFormula.multiply(BigDecimal.valueOf(principal));
		System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

	}

}
