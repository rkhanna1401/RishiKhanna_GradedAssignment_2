package com.greatlearning.gradedassignment2.stockers;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		CompanyDetails details = new CompanyDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of companies ");
		details.setNoOfCompanies(sc.nextInt());
		Double price;
		Boolean trend;
		for(int i=0 ; i< details.getNoOfCompanies(); i++) {
			System.out.println("Enter current stock price of the company "+(i+1));
			price = sc.nextDouble();
			details.setShareprice(price);
			System.out.println("Whether company's stock price rose today compare to yesterday? ");
			trend = sc.nextBoolean();
			details.setSharePriceTrend(price,trend);
		}

		Boolean flag=true;

		while(flag) {
			Utility.displayOperations();
			int userSelection = sc.nextInt();

			switch(userSelection) {

			case 1:
				Utility.printStockPriceInParticularOrder(details.getShareprice(), OrderType.ascending);
				break;

			case 2:
				Utility.printStockPriceInParticularOrder(details.getShareprice(), OrderType.descending);
				break;

			case 3:
				Utility.displayCompanyCountBasisStockPriceMovement(details.getSharePriceTrend(), Movement.rose);
				break;

			case 4:
				Utility.displayCompanyCountBasisStockPriceMovement(details.getSharePriceTrend(), Movement.declined);
				break;

			case 5:
				System.out.println("Enter stock price to search");
				Double priceToCheck = sc.nextDouble();
				Utility.searchStockPrice(priceToCheck,details.getShareprice());
				break;

			case 0:
				System.out.println("Exited successfully");
				flag = false;
				break;

			default :
				System.out.println("Invalid option. Please select correct option");
				break;
			}
		}
		
		sc.close();
	}
	
}
