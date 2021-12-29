package com.greatlearning.gradedassignment2.stockers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Utility {

	public static void printStockPriceInParticularOrder(ArrayList<Double> stockPrice, OrderType orderType) {
		switch(orderType) {
		case ascending:
			Collections.sort(stockPrice);
			System.out.println("Companies Stock Price in ascending order are: ");
			break;
		case descending:
			Collections.sort(stockPrice, Collections.reverseOrder());
			System.out.println("Companies Stock Price in descending order are: ");
			break;
		}
		for (Double d : stockPrice) {
			System.out.println(d);
		}
	}


	public static void displayCompanyCountBasisStockPriceMovement(Map<Double, Boolean> stockTrend, Movement movement) {
		int roseCount = 0;
		int declinedCount = 0;
		//switch(movement) {
		//case rose:
		for(Boolean b : stockTrend.values()) {
			if(b.booleanValue()==true) {
				roseCount++;
			}
			else {
				declinedCount++;
			}
		}
		if(Movement.rose != null) {
			System.out.println("Total no of companies whose stock price "+ movement +" today: "+roseCount);
		}
		else {
			System.out.println("Total no of companies whose stock price "+ movement +" today: "+declinedCount);
		}
	}


	public static void searchStockPrice(Double price,ArrayList<Double> stockPrice) {
		if(stockPrice.contains(price)) {
			System.out.println("Stock of value "+ price +" is present");
		}
		else {
			System.out.println("Stock of value "+ price +" is not present");
		}
	}

	public static void displayOperations() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
	}
}
