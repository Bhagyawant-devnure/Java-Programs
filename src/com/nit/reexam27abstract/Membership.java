/*Que 1 :
=======

Task: Develop a Program to Calculate Discounts Based on Membership Type
You are tasked with developing a Java program that calculates and displays the discount percentage a customer is entitled 
to based on their membership type. 
The program will use interfaces, concrete classes, and a factory class to handle membership type selection dynamically.

Create the Membership Interface
Define an abstract method getDiscount() in the interface.
This method will be implemented by concrete classes representing different membership types.

Create the GoldMember Class
Implement the Membership interface in the GoldMember class.
Provide the implementation for the getDiscount() method, returning 20% as the discount.

Create the SilverMember Class
Implement the Membership interface in the SilverMember class.
Provide the implementation for the getDiscount() method, returning 10% as the discount.

Create the NonMember Class
Implement the Membership interface in the NonMember class.
Provide the implementation for the getDiscount() method, returning 0% as the discount.
This serves as a fallback for customers without a membership.

Create the MembershipFactory Class
Create a class named MembershipFactory to handle membership type selection.
Implement a factory method named factory(String membershipType) in this class.
Use the equalsIgnoreCase() method to compare the provided input and return the corresponding membership object:

Return a GoldMember object if the input is "gold".
Return a SilverMember object if the input is "silver".
Return a NonMember object for any unsupported input.
Create the Main Class (DiscountCalculator)
This is the entry point of the program.

Prompt the user to input their membership type.
Pass the input to the MembershipFactory using its factory() method to obtain the appropriate membership object.
Display the discount percentage by calling the getDiscount() method on the membership object.

Test Case 1
------------
Input:
Enter your membership type: Gold

Output:
You are entitled to a 20% discount.

------------------------------

Test Case 2
------------
Input:
Enter your membership type: Silver
Output:
You are entitled to a 10% discount.
------------------------------

Test Case 3
------------
Input:
Enter your membership type: None
Output:
You are entitled to a 0% discount.
*/


package com.nit.reexam27abstract;

 interface Membership {
	double getDiscount();

}
