package com.nit.Assignment_14abstraction;

public class OrderCake extends Cake {
	private String message;
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public OrderCake() {
		super("Ensure shape is round", "Vanilla", 1);
		
		
	}
	
	public OrderCake(String shapeType, String flavour, int qty) {
		super(shapeType, flavour, qty);
	
		
	}
	

	public OrderCake(String shapeType, String flavour, int qty,  String message) {
		super(shapeType, flavour, qty);
		this.message = message;
	}

	public void  showCake() {
		if(message==null || message.isEmpty()) {
			super.showCake();
		
		
	}else {
		System.out.println("A" + getShapeType() + ""+getFlavour()+ "Cake of"+getQty()+"kg's ready rs"+getPrice()+getMessage());
		}
	}
}
