/*Ques - 1
-------------
Dynamic Pricing Calculation for Online Marketplace

You've been tasked with developing a Java program for an online marketplace that calculates the total cost of a customer's order with a dynamic pricing system. The pricing calculation is influenced by the product categories and whether the customer is a frequent shopper. Your objective is to design a flexible solution using functional interfaces and lambda expressions to handle the pricing calculation process effectively.

Your program should include the following components:

Functional Interface:
interface name : PricingStrategy

Methods:
Method name : calculatePrice
modifier : public: abstract
return type : double
parameters : double totalAmount, boolean isFrequentShopper
This method is for calculating prices based on the current strategy. The isFrequentShopper parameter indicates whether the customer is a frequent shopper.


Functional Interface:
interface name : ProductCategoryChecker 
Methods:
Method name : applyCategoryDiscount
modifier : public: abstract
return type : double
parameters : (double totalAmount, String category)
This method applies discounts based on specific product categories.

ELC class  OnlineMarketplace :

Main Program:
Prompt the user to enter the total order amount in rupees.
Prompt the user to specify if they are a frequent shopper (yes/no).
Prompt the user to enter the product category.
Apply the lambda expressions representing the pricing strategy and product category discount to calculate the final price based on the provided inputs.
Calculate and print the total cost of the order after applying the pricing strategy in rupees.

Pricing Strategy Logic:
Initially, the pricing strategy offers a 10% discount for electronic products, a 5% discount for clothing items, and no discount for other categories. An additional 5% discount is applied if the customer is a frequent shopper.

Sample Input and Output:
-------------------------
Welcome to the Online Marketplace!

Enter the total order amount in rupees: 1500
Are you a frequent shopper? (yes/no): yes
Enter the product category: electronics

Total cost after pricing strategy: 1350.00

Test Case 1
Input:
Total order amount: 1500
Frequent shopper: yes
Product category: electronics
Output:
Total cost after pricing strategy: 1282.50

Test Case 2
Input:
Total order amount: 1500
Frequent shopper: no
Product category: electronics
Output:
Total cost after pricing strategy: 1350.00*/


package com.nit.Assignment_19;

public interface PricingStrategy {
	public abstract double calculatePrice(double totalAmount
			,boolean isFrequentShopper);

}
