package com.pphyo.prototye.v1;

public class PrototypeV1App {

	public static void main(String[] args) {
		
		try {
			var computer = new Computer();
			computer.setModel("Asus Zenbook");
			computer.setCpu(8);
			computer.setRam(16);
			computer.setPrice(1_500_000);
			
			System.out.println(computer);
			
			var copy = computer.clone();
			System.out.println(copy);
			
			System.out.println(computer == copy);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
