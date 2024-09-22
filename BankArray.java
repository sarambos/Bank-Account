package practice9_5;

import java.text.NumberFormat;
/**
 * To create five accounts and store them in an array
 * @author Stephanie Sarambo
 */
public class BankArray {

	public static void main(String[] args) {
		Bank[] allCus = new Bank[5];
		double total = 0, ave;
		String format;
		allCus[0] = new Bank("A001", "Sara");
		allCus[1] = new Bank("A002", "Hailey");
		allCus[2] = new Bank("A003", "Lucas");
		allCus[3] = new Bank("A004", "Grayson");
		allCus[4] = new Bank("A005", "Nicholas");
		
		for(int i = 0; i < 5; i++)
			allCus[i].deposit(100 + Math.random() * 1001);
		
		for(int i = 0; i < 5; i++)
			total += allCus[i].getBalance();
		
		ave = total / 5;
		format = NumberFormat.getCurrencyInstance().format(ave);
		
		System.out.println("The average amount of money between all five customers is " + format);
	}
}
