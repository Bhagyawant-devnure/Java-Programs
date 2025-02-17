/*Ques - 1
-------------
Object Creation and Attribute Update using Functional Interface and Consumer.

You are tasked with creating a Java program that utilizes a custom functional interface for object creation and updates object attributes using a Consumer. .

Custom Functional Interface: ObjectCreator

Create a functional interface ObjectCreator with the following specifications:
Interface Name: ObjectCreator
Method Signature: Object create(int id, String name)
Return Type: Object
Parameters: id (int): , name (String)


BLC Class: Student
Create a class Student. This class should include:

Attributes:

int id: private 
String name: private

Constructor:
Student(int, String):
Initializes the id and name attributes of the object.

Method:
void updateName(Consumer<String> nameUpdater):
Accepts a Consumer that updates the name attribute of the object based on the provided logic.
Override toString method to display object details.

Main Class: ObjectCreatorMain
In the main method of the ObjectCreatorMain class:

Define and use a lambda expression to instantiate a CustomObject using the ObjectCreator interface. The lambda should return  an object of Student with id and name.
Call create method and store the object.

Use a Consumer lambda expression to update the name attribute of the created Student object. The Consumer should modify the name to include a suffix or any transformation logic.

Print the details of the updated Student instance to verify its attributes.

Test Case 1: Basic Creation and Update
Input:
id: 1
name: "John Doe"
Operation:
Update the name to "Jane Updated"
Expected Output:
Updated Student Details:
Student{id=1, name='Jane Updated'}

Test Case 2: Different Name Update
Input:
id: 2
name: "Alice"
Operation:
Update the name to "Alice Johnson"
Expected Output:
Updated Student Details:
Student{id=2, name='Alice Johnson'}

Test Case 3: No Name Update
Input:
id: 3
name: "Bob"
Operation:
No update applied
Expected Output:
Updated Student Details:
Student{id=3, name='Bob'}*/


package com.nit.Assignment18functionInterface;

public interface ObjectCreator {
	Object create(int id,String name);

	

}
