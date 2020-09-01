package java_exam.javaa1.app;

public class AccountingApp5_ArrayLoop {
	public static void main(String[] args) {

		double Valueofsupply = 12000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = Valueofsupply * vatRate;
		double total = Valueofsupply + vat;
		double expense = Valueofsupply * expenseRate;
		double income = Valueofsupply - expense;

		System.out.println("Value of supply : " + Valueofsupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);

		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;

		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];

		for (int i = 0; i < dividendRates.length; i++) {
			System.out.println("Dividend : " + (income * dividendRates[i]));
		}
	}
}
