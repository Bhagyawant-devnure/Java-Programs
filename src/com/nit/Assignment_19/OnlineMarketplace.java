package com.nit.Assignment_19;

import java.util.Scanner;

public class OnlineMarketplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total order amount");
		double totalAmount=sc.nextDouble();
		System.out.println("Are you a frequent shopper? (yes/no)");
		String isFrequentShopper=sc.next();
		System.out.println("enter product category");
		String category=sc.next();
		
	

        // Lambda for category discount
        ProductCategoryChecker pc = (total, cat) -> 
            cat.equalsIgnoreCase("electronics") ? total - total * 0.1 :
            cat.equalsIgnoreCase("clothing") ? total - total * 0.05 : total;

        // Lambda for frequent shopper discount
        PricingStrategy pr = (total, isFrequent) -> 
            isFrequent ? total - total * 0.05 : total;

        // Apply category discount
        double totalPrice = pc.applyCategoryDiscount(totalAmount, category);

        // Apply frequent shopper discount
        boolean isFreq = isFrequentShopper.equalsIgnoreCase("yes");
        double finalPrice = pr.calculatePrice(totalPrice, isFreq);

        // Display the final price
        System.out.println("Total price after discounts: " + finalPrice);

        sc.close();

	}

}
