package com.nit.exam;

public class Prime {
    private int number;
    private boolean isPrime = false;

    
    public Prime(int number) {
        this.number = number;
    }

    
    public void checkPrime() {
        if (number <= 1) {
            isPrime = false;
            return;
        }
        for (int i = 2; i <=number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                return;
            }
        }
        isPrime = true;
    }

 
    @Override
    public String toString() {
        return "[ " + number + " is prime = " + isPrime + " ]";
    }

    
    public static void main(String[] args) {
        Prime primeChecker = new Prime(7); 
        primeChecker.checkPrime();
        System.out.println(primeChecker.toString());
    }
}

	


