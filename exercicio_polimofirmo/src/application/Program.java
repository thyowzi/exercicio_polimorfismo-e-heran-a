package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i+1) + " data: "  );
			System.out.println("Commom, used or imported (c/u/i)");
			char caracter = sc.next().charAt(0);
			switch (caracter) {
			case 'c':
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				double priceP = sc.nextDouble();	
				Product pro = new Product(name, priceP);
				System.out.println(pro);
				break;
			case 'u':
	//			System.out.println("Product # " + (i+1) + " data: "  );
				System.out.print("Name: ");
				sc.nextLine();
				String namep2 = sc.nextLine();
				System.out.print("Price: ");
				double priceP2 = sc.nextDouble();
				System.out.println("Manufacture date (DD/MM/YYYY)");
				Date fixedDate = sdf.parse("27/01/1998");
				Product up = new UsedProduct(namep2, priceP2, fixedDate);
				
				System.out.println(up);
				break;
			case 'i':
	//			System.out.println("Product # " + (i+1) + " data: "  );
				System.out.print("Name: ");
				sc.nextLine();
				String namep3 = sc.nextLine();
				System.out.println("Price: ");
				double price3 = sc.nextDouble();
				System.out.println("Customs fee: ");
				double taxa = sc.nextDouble();
				Product ip = new ImportedProduct(namep3, price3, taxa);
	
				System.out.println(ip);
			}
		}
		
		
		
	}

}
