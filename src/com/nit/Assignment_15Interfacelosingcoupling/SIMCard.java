/*Question-1 : Mobile Phone SIM Card Interaction
_______________________________________________
You are tasked with implementing a simulation of a mobile phone interacting with different SIM cards. The
goal is to create a system where mobile phones can insert, remove, and use SIM cards from different pro
viders.

Components:
--------------
-> SIMCardInterface: 

An interface that defines some abstract methods.

Methods :

name 			: gettingPhoneNumber()
Return Type  		:long
Access Modifier 	:public

name 			: networkProvider()
Return Type  		:void
Access Modifier 	:public

name 			: activation()
Return Type  		:void
Access Modifier 	:public

name 			: deActivation()
Return Type  		:void
Access Modifier 	:public


->Take some implimented classes like  Jio, Airtel, and BSNL Classes: 
These classes should implement the SIMCardInterface. 

Each class represents a SIM card from a different network provider (Jio, Airtel, and BSNL) and should have provider-specific details.

# Take another  Interface named as MobilePhone 

An interface that defines methods for inserting, removing SIM cards, making calls, and sending text messages.

[just here you have to add some enhancement based on the question you have to think and apply  for achieving Loosely coupled Runtime Polymerphism]

-> MobilePhone Class: 

This class should implement the MobilePhoneInterface. 
It should have a slot for inserting a SIM card and methods for making calls and sending texts.

Take one main class named as  Customer it's having main method and inside this instantiate all the implemented class and invoke all the method 

Tasks:
----------
-> Implement the SIMCardInterface and the classes Jio, Airtel, and BSNL that implement this interface. In
clude methods for getting phone number, network provider, and activating/deactivating the SIM card.
-> Implement the MobilePhoneInterface and the MobilePhone class that implements this interface. The M
obilePhone class should allow inserting and removing SIM cards, making calls, and sending texts.
-> Demonstrate the interaction between mobile phones and different SIM cards:
->Create instances of Jio, Airtel, and BSNL SIM cards.
->Create a MobilePhone instance.
->Insert a SIM card into the mobile phone.
->Make a call and send a text message using the inserted SIM card.
->Remove the SIM card from the mobile phone.
->Discuss how the use of interfaces (SIMCardInterface and MobilePhoneInterface) promotes a loosely co
upled architecture and allows flexibility in swapping different SIM cards.

[Note: You can provide the classes with appropriate constructors and methods as needed for the impleme
ntation.]

Hints:
--------------
Define the interfaces with the required methods and let the classes implement them.
Consider including print statements to indicate the activation, deactivation, insertion, and removal of SIM c
ards.
Focus on encapsulation, polymorphism, and the benefits of using interfaces in promoting modular and flexible code.

According to ur preferences and level of your understanding you can add some more enhancement and change in this program .


Test Case 1: 
Valid SIM Card Insertion and Operations

Sample Input: Insert Jio SIM, make call, send text, remove SIM.

Expected Output: SIM card inserted, call made, text sent, SIM card removed.

Test Case 2:
 Attempting Operations Without SIM Card

Sample Input: Make call, send text without inserting any SIM card.

Expected Output: Error messages indicating no SIM card is inserted.

Test Case 3: 
Switching SIM Cards
Sample Input: 

Insert Airtel SIM, make call, remove SIM, insert BSNL SIM, make call, remove SIM.

Expected Output: 

Airtel SIM inserted, call made, SIM card removed, BSNL SIM inserted, call made, SIM card removed.
[it's example just print the appropriate sim name with proper message like that]

SIM card inserted successfully.
Making call to 1234567890 using 9876543210
Sending text message to 1234567890 using 9876543210
Message: Hello, this is a test message.
SIM card removed successfully.*/


package com.nit.Assignment_15Interfacelosingcoupling;

public interface SIMCard {
	public long gettingPhoneNumber();
	
	public void networkProvider();
	 
	public void activation();
	public boolean isActive();
	
	public void deActivation();

}
