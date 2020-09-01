package java_exam.javaa1.app;

public class AccountingApp2 {
	public static void main(String[] args) {

		double Valueofsupply = 10000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = Valueofsupply * vatRate;
		double total = Valueofsupply + vat;
		double expense = Valueofsupply * expenseRate;
		double income = Valueofsupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply : " + Valueofsupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend1 : " + dividend1);
		System.out.println("Dividend2 : " + dividend2);
		System.out.println("Dividend3 : " + dividend3);
	}
}
//리팩토링  알트+쉬프트+L, 변수로 코드 최소화 및 재사용성