package com.Enum.Method_Overriding;


enum ManagerType
{
	 Hr,Sales
}
public class Employee {

	private String name;
	private int employeeId;
	private double salary;
	
	public Employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public Employee() {}//no argument constructor

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	@Override
    public String toString() {
        return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
    }
	
}


class Manager extends Employee
{
	
	private ManagerType type;
	
	

	public ManagerType getType() {
		return type;
	}



	public void setType(ManagerType type) {
		this.type = type;
	}

    public Manager() {}//No argument constructor
    
    public Manager(String name, int employeeId, double salary, ManagerType type) {
        super(name, employeeId, salary);
        this.type = type;
    }


	@Override 
	public void setSalary(double Salary) {
		if(type==ManagerType.Hr)
		{
			super.setSalary(Salary+10000);
		}
		else if(type==ManagerType.Sales) 
		{
				super.setSalary(Salary+5000);
			}else {
				super.setSalary(Salary);
			}
		}
	@Override
    public String toString() {
        return "Manager [name=" + getName() + ", ID=" + getEmployeeId() + ", salary=" + getSalary() + ", type=" + type + "]";
    }
	} 


class Clerk extends Employee{
	 private int speed;
	    private int accuracy;
	    private boolean bonusGiven = false; // To track if the bonus is already added

	    // Constructors
	    public Clerk() {}

	    public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
	        super(name, employeeId, salary);
	        this.speed = speed;
	        this.accuracy = accuracy;
	        setSalary(salary); // Calculate salary based on initial conditions
	    }

	    // Getters and Setters
	    public int getSpeed() 
	    { return speed; 
	    }
	    public void setSpeed(int speed)
	    {
	        this.speed = speed;
	        recalculateSalary();
	    }

	    public int getAccuracy() 
	    { return accuracy; 
	    }
	    public void setAccuracy(int accuracy) 
	    {
	        this.accuracy = accuracy;
	        recalculateSalary();
	    }

	    @Override
	    public void setSalary(double salary) {
	        if (!bonusGiven && speed > 70 && accuracy > 80) {
	            super.setSalary(salary + 1000);
	            bonusGiven = true; // Ensure bonus is given only once
	        } else {
	            super.setSalary(salary);
	        }
	    }

	    // Method to Recalculate Salary When Speed/Accuracy Changes
	    private void recalculateSalary() {
	        setSalary(getSalary()); // Trigger salary update based on new values
	    }

	    @Override
	    public String toString() {
	        return "Clerk [name=" + getName() + ", ID=" + getEmployeeId() + ", salary=" + getSalary() + 
	               ", speed=" + speed + ", accuracy=" + accuracy + "]";
	    }
	}


 
