package com.java.training;

public class Multiplication {

	
	public void multiply(int num){
		
		if ((num > 0) && (num <= 100)) {
			for(int i=1; i<=10; i++){
				
				System.out.println(num + " * " + i + " = "+ (num*i));
			}
		}
		else {
			System.out.println("Please enter number between 1 and 100");
		}
	}
	public static void main(String[] args) {

		Multiplication multiplication = new Multiplication();
		
		multiplication.multiply(99);
	}

}
