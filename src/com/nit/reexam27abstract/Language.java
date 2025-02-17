/*ue 1 :
=======

Task: Develop a Multilingual Greeting Program
You need to implement a Java program that greets users in different languages based on their preferences. 
The program should prompt the user to input their preferred language and display a greeting message accordingly. 
The program will utilize interfaces, concrete classes, and a factory class to manage language selection dynamically.

Steps to Implement
1. Create the Language Interface
Define an abstract method getMessage() in the interface.
This method will be implemented by concrete classes representing different languages.

2. Create the Hindi Class
Implement the Language interface in the Hindi class.
Provide the implementation for the getMessage() method, returning "Namaste" as the greeting.

3. Create the Telugu Class
Implement the Language interface in the Telugu class.
Provide the implementation for the getMessage() method, returning "Namaskaram" as the greeting.

4. Create the Non Class
Implement the Language interface in the Non class.
Provide the implementation for the getMessage() method, returning "Invalid Language....".
This serves as a fallback for unsupported language selections.

5. Create the FactoryClass
Create a class named FactoryClass to handle language selection.
Implement a factory method named factory(String lang) in this class.
Use the equalsIgnoreCase() method to compare the provided input and return the corresponding language object:
Return a Hindi object if the input is "hindi".
Return a Telugu object if the input is "telugu".
Return a Non object for any unsupported input.

6. Create the ELC Class (Main Class)
This is the entry point of the program.
Prompt the user to input their preferred language.
Pass the input to the FactoryClass using its factory() method to obtain the appropriate language object.
Display the greeting message by calling the getMessage() method on the language object.

TEST CASE 1 :
=============
Sample Input :
Enter your preferred language  :  Hindi

Sample Output : 
Namaste

----------------------

TEST CASE 2 :
=============
Sample Input :
Enter your preferred language  :  Telugu

Sample Output : 
Namaskaram

----------------------

TEST CASE 3 :
=============
Sample Input :
Enter your preferred language  :  Arebic

Sample Output :
Invalid Language....*/


package com.nit.reexam27abstract;

public interface Language {
public String getMessage();
}
