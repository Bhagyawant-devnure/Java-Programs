package com.nit.Exception_Test_24;

import java.util.Scanner;

public class PasswordTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
	        String password = sc.nextLine();

	        try {
	            PasswordValidator.validatedPassword(password);
	            System.out.println("Password is valid.");
	        } catch (InvalidPasswordException e) {
	            System.out.println("Invalid password: " + e.getMessage());
	        } finally {
	            sc.close();

	}}}


