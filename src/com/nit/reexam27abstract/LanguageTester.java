package com.nit.reexam27abstract;

import java.util.Scanner;

public class LanguageTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your preferred language  :");
		String lang = sc.next();
		Language language = FactoryClass.Factory(lang);
		String message = language.getMessage();
		System.out.println(""+message);
		sc.close();

	}

}
