package com.ithup.pattern.status;

public class TestTra {
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine(10);  
        machine.insertMoney();  
        machine.backMoney();  
  
        System.out.println("-----------");  
  
        machine.insertMoney();  
        machine.turnCrank();  
          
        System.out.println("----------ѹ������-----");  
        machine.insertMoney();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.turnCrank();  
        machine.backMoney();  
        machine.turnCrank();  
	}
}
