package com.nit.Exception_Assigment_5;

public class CarUser {

	public static void main(String[] args) {
		
		    
		        try {
		            CarTest.Stop("stop");
		        } catch (CarStoppedException e) {
		            System.out.println(e.getMessage());
		        }

		        try {
		            CarTest.Stop("go");
		        } catch (CarStoppedException e) {
		            System.out.println(e.getMessage());
		        }

		        try {
		            CarTest.puncture("puncture");
		        } catch (CarPunctureException e) {
		            System.out.println(e.getMessage());
		        }

		        try {
		            CarTest.puncture("move");
		        } catch (CarPunctureException e) {
		            System.out.println(e.getMessage());
		        }

		        try {
		            CarTest.carHeat(60);
		        } catch (CarHeatException e) {
		            System.out.println(e.getMessage());
		        }

		        try {
		            CarTest.carHeat(40);
		        } catch (CarHeatException e) {
		            System.out.println(e.getMessage());
		        }
		        }}
		    


