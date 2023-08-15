package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account; 
import exceptions.BusinessException;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account data");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Enter the withdraw amount: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		}
		
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
			
	}

}
