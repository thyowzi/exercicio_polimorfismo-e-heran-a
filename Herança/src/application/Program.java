package application;

import java.util.Scanner;

import entities.Account;
import entities.BusinesssAccoount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//			BusinesssAccoount ba = new BusinesssAccoount(100, "Douglas", 1000.0, 250.0);
//			ba.withdraw(200.0);
//			System.out.println(ba);
//		
//		
//		
//			Account acc = new Account(100, "Alex", 500.0);
//			acc.withdraw(250.0);
//			System.out.println(acc);
//			Account acc2 = new SavingsAccount(100, "Douglas", 500.0, 0.05);
//			acc2.withdraw(250.0);
//			System.out.println(acc2);
			
		
		
		
		
	//	Account acc = new Account(1001, "Alex", 0.0);
	//	BusinesssAccoount bacc = new BusinesssAccoount(1002, "Douglas", 0.0, 500.0);	
	
		// UPCASTING
		
	//	Account acc1 = bacc;
		//abaixo estou atribuindo um objeto da subclass para a super classe, e nao da erro
//		Account acc2 = new BusinesssAccoount(1003, "Bob", 850.0, 1.0);
	//	Account acc3 = new SavingsAccount(1004, "Anna", 1500.0 , 0.0);
		
		
		// DOWNCASTING
//		BusinesssAccoount acc4 = (BusinesssAccoount)acc2;
//		acc4.loan(100.0);
//	
//		// BusinessAccount acc5 = (BusinessAccount)acc3;
//				if (acc3 instanceof BusinesssAccoount) {
//					BusinesssAccoount acc5 = (BusinesssAccoount)acc3;
//					acc5.loan(200.0);
//					System.out.println("Loan!");
//				}
//
//				if (acc3 instanceof SavingsAccount) {
//					SavingsAccount acc5 = (SavingsAccount)acc3;
//					acc5.updateBalance();
//					System.out.println("Update!");
//				}
//			}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Quanto deseja depositar?");
//		double deposit = sc.nextDouble();
//		bacc.deposit(deposit);
//		System.out.println(bacc);
//		System.out.println("Quanto deseja sacar?");
//		double saqu = sc.nextDouble();
//		bacc.withdraw(saqu);
//		System.out.println(bacc);
//		
//		
//		System.out.println("Quanto deseja depositar?");
//		double deposito = sc.nextDouble();
//		acc.deposit(deposito);
//		System.out.println(acc);
//		System.out.println("Quanto deseja sacar?");
//		double saque = sc.nextDouble();
//		acc.withdraw(saque);
//		System.out.println(acc);
//		
	
}
}


