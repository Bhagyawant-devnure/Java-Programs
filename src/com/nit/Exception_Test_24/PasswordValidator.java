package com.nit.Exception_Test_24;

public class PasswordValidator {
	
	public static void validatedPassword(String Password)throws InvalidPasswordException {
		if(Password.length()<8) {
			throw new InvalidPasswordException("Password must be at least 8 characters long.");
			}
			
			 if (!Password.matches(".*[A-Z].*")) {
				 
		            throw new InvalidPasswordException("Password must contain at least one uppercase letter.");
		        }
			 
		        if (!Password.matches(".*[a-z].*")) {
		            throw new InvalidPasswordException("Password must contain at least one lowercase letter.");
		        }
		        
		        if (!Password.matches(".*\\d.*")) {
		            throw new InvalidPasswordException("Password must contain at least one digit.");
		        }
		
	}
	}


