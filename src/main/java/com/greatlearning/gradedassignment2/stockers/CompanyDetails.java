package com.greatlearning.gradedassignment2.stockers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CompanyDetails {

	int noOfCompanies;
	ArrayList<Double>  shareprice;
	Map<Double, Boolean> sharePriceTrend;

	public CompanyDetails() {
		shareprice = new ArrayList<Double>();
		sharePriceTrend = new HashMap<Double, Boolean>();
	}
	
	public int getNoOfCompanies() {
		return noOfCompanies;
	}
	public void setNoOfCompanies(int noOfCompanies) {
		this.noOfCompanies = noOfCompanies;
	}
	public ArrayList<Double> getShareprice() {
		return shareprice;
	}
	public void setShareprice(Double price) {
		shareprice.add(price);
	}
	public Map<Double, Boolean> getSharePriceTrend() {
		return sharePriceTrend;
	}
	public void setSharePriceTrend(Double price,Boolean trend) {
		sharePriceTrend.put(price, trend);
	}
}
