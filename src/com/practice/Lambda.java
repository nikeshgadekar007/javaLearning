package com.practice;

public class Lambda {

	public static void main(String[] args){
		
//		This is imperative style, just in order to understand to JVM we are writing to much line of code
		Game football = new Game() {

			public void play() {
				System.out.println("Football called");		
			}
		};
		football.play();
		
		
//		This is functional style 
//		To provide the implementation of Functional interface.
//		Less coding.
//		An interface which has only one abstract method is called functional interface.
		
		Game football1 = () -> System.out.println("Hello foofofoo");
		football1.play();
		
	}
	
	interface Game{
		void play();
	}
}
