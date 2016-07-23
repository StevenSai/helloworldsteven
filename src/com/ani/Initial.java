package com.ani;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog pipi = new Dog();
		Dog pipi2 = new Dog();
		//pipi.eat();
		pipi.setDog("pipi1", 23);
		pipi2.setDog("pipi1", 23);
		if(pipi.equals(pipi2)){
			System.out.println("Yes!");
		}else{
			System.out.println("No!");
		}
		//pipi.eat();
	}

}
