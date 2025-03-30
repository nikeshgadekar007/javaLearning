package com.practice;

//public class Multithreading extends Thread{
//	
//	public void run() {
//		for(int i =0; i<5; i++) {
//			 try{
//				  Thread.sleep(500);
//				 }catch(InterruptedException e){
//					 System.out.println(e);
//				} 
//			System.out.println(i);
//		}
//	}
//
//}


class Hi extends Thread{
	public void run() {
		for(int i = 1; i< 5; i++) {
			System.out.println("Hi Nikesh ===>");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for(int i = 1; i< 5; i++) {
			System.out.println("Hello Nikesh ====>");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Multithreading {
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		obj2.start();
		
	}
	
}