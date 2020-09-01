package java_exam.javaa1.app;

class Accounting1{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRates;
	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend 1 : " + getDividend1());
		System.out.println("Dividend 2 : " + getDividend2());
		System.out.println("Dividend 3 : " + getDividend3());
	}
	
	private static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getDividend2() {
		return getIncome() * 0.3;

	}

	private static double getDividend1() {
		return getIncome() * 0.5;
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expenseRates;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}

}


public class AccountingApp7_object {
	

	public static void main(String[] args) {

		Accounting1.valueOfSupply = 10000.0;
		Accounting1.vatRate = 0.1;
		Accounting1.expenseRates = 0.3;
		Accounting1.print();
         //anotherVariable = ...;
		 //anotherMethod = ...;
	}

	
}
	