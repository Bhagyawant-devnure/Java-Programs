/*Three classes are given to you, 
CabCustomer
CabCustomerService
CabCustomerServiceTester


Define the following in the class CabCustomer 
private : custId int, customerName String, pickupLocation String,dropLocation String, distance int,phone String
          Generate Getter/Setter for the all fields.
          Implement the No Argument constructor.
          Implement/Generate the parameterized constructor in the order as defined above, i.e.,  custId,Name,Pickup,Drop,Distance,Phone

Define the following in the  class CabCustomerService and write logics in the following methods:
private : Generic ArrayList to represent list of CabCustomers.
public : addCabCustomer() : Add the customer object parameter to the ArrayList
			    isFirstCustomer(): Check whether the customer object parameter is already existing in arrayList. 
			    				
Note : If phone number of a customer matches with any of the phone numbers of the array list, then consider it as a existing customer, otherwise consider the customer as new customer. 
				 
       calculateBill() should calculate and return the customer bill based on following rules
       1) if the customer is new return 0;
       2) if the customer's travel distance is below or equal    
          to 4 kms then return 80 (Rs).
       3) if the customer travel distance is above 4 kms calculate bill 80 + 6 per each km.
		 Ex: Any distance for new customer return 0;
		     distance 4 return 80
                     distance 6 return 80 + 6 * 6;
printBill() which should return the bill of the customer object parameter in the following format:

            output : JOHN Please pay your bill of Rs.0.0
	             SMITH Please pay your bill of Rs.180.0

	Note : 
	   Assume one customer books only one cab at a time.
	   No charge for customer booking the cab for the first time.
	   Customer's phone number is key to test a new customer or old customer.
	   Distance should be treated as kilometers 				 
				 
A CabCustomerServiceTester is given with main() where you can create various objects and test them.
*/

package com.Collection.ArrayList;

import java.util.ArrayList;


//class represnting a cab customer
	class CabCustomer{
		private int custId;
		private String customerName;
		private String pickupLocation;
		private String dropLocTion;
		private int distance;
		private String phone;
		
		//getter and setter method
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getPickupLocation() {
			return pickupLocation;
		}
		public void setPickupLocation(String pickupLocation) {
			this.pickupLocation = pickupLocation;
		}
		public String getDropLocTion() {
			return dropLocTion;
		}
		public void setDropLocTion(String dropLocTion) {
			this.dropLocTion = dropLocTion;
		}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public CabCustomer() {}//No argument constructor
		//parameterrized constructor
		public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocTion, int distance,
				String phone) {
			super();
			this.custId = custId;
			this.customerName = customerName;
			this.pickupLocation = pickupLocation;
			this.dropLocTion = dropLocTion;
			this.distance = distance;
			this.phone = phone;
		}
		
		
		
	}
	//service class for managing cab customers
	class CabCustomerService{
		private ArrayList<CabCustomer> customerList= new ArrayList<>();//Generic arraylist
		//method to add a customer to the list
		public void addCabCustomer(CabCustomer Customer) {
			this.customerList.add(Customer);
		}
		//method to check if a customer is booking for the first time
		public boolean isFirstCustomer(CabCustomer Customer) {
			for(CabCustomer existingCustomer:customerList) {
				if(existingCustomer.getPhone().equals(Customer.getPhone())) {
					return false;//existing customer
				}
				
				}
			return true;//new customer
			
		}
		 // Method to calculate the bill based on distance traveled
		public double calculateBill(CabCustomer Customer) {
			if(isFirstCustomer(Customer)) {
				return 0;//no charge for first time customers
			}
			int distance=Customer.getDistance();
			if(distance<=4) {
				return 80;//fixed charge for 4km or less
			}else {
				return 80+(6*distance);//additional charge per km above 4km
			}
			
		}
		// Method to print the bill amount for the customer
		public void printBill(CabCustomer Customer) {
			double billAmount=calculateBill(Customer);
			System.out.println(Customer.getCustomerName () + " please pay your bill " + billAmount);
			
		}
	}
	
	public class CabCustomerServiceTester {
	public static void main(String[] args) {
		CabCustomerService service=new CabCustomerService();//creating service object
		CabCustomer Customer1=new CabCustomer(1 ,"raj" ," pune ", " banglore " , 4 ,"8411849785");//adding customer to the list
		
		service.addCabCustomer(Customer1);//adding customer to the list
		service.printBill(Customer1);//printing the bill
		

	}

}
