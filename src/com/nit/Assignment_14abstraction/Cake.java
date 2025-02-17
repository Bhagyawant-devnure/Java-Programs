/*An abstract class "Cake" is given. Create a subclass called OrderedCake.
And check the working of it.

Meet the following requirements.
Modifiers of the class Cake : abstract, public

Attributes:
Attribute Name : shape Type:String Modifier:private
Attribute Name :flavour Type:String Modifier:private
Attribute Name :qty Type:int Modifier:private
Attribute Name :price Type:float Modifier:private
Constructor:(One only)
Modifier : protected
type : With 3 parameters shape,flavour,qty in the same order.

Methods :
Define setters and getters for all fields with protected Modifiers
Name of the method : showCake
Return Type : void
Modifier : protected.
Task : It must print data as per below format/example.
"A Round Vanilla Cake Of 2 Kg/Kg's Ready @ Rs.800/-"
Create an inherited class "OrderedCake". Inherit this from "Cake"
Define the following for the "OrderedCake" class
Attributes:
Attribute name : message
Type : String
Modifier :private
Constructors:(3 only)
No argument Constructor : Ensure shape is Round, flavour is Vanilla,
qty is 1 kg and price is 400.
Parameterized public Constructor : For shape,flavour,qty
Parameterized public Constructor : For shape,flavour,qty and message.
Price is to be dynamically changed @400 per Kg.
Methods :
Name of Method : showCake() - Override this
Return type : void
Modifier : public
Task :Print the following if message is not null or empty
"A Round Vanilla Cake of 2 Kg/Kg's ready with message Happy Birth Day @ Rs.800/-".

Otherwise display the message from superclass.
Create CakeMain class to test the working of the above*/


package com.nit.Assignment_14abstraction;

public abstract class Cake {
	private String shapeType;
	private String flavour;
	private int qty;
	private float price;
	
	public Cake(String shapeType, String flavour, int qty) {
		super();
		this.shapeType = shapeType;
		this.flavour = flavour;
		this.qty = qty;
		this.price = qty*400;
	}
	protected String getShapeType() {
		return shapeType;
	}
	protected void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
	protected String getFlavour() {
		return flavour;
	}
	protected void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	protected int getQty() {
		return qty;
	}
	protected void setQty(int qty) {
		this.qty = qty;
	}
	protected float getPrice() {
		return price;
	}
	protected void setPrice(float price) {
		this.price = price;
	}
	protected void showCake() {
		System.out.println("A" +shapeType + ""+ flavour + "cake of "+ qty+ "kg's ready Rs." +price);
		}
	
	

}
