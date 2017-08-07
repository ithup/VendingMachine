package com.ithup.vendingMachine;


/** 
 * 没钱的状态实现
 * @author ithup 
 * 
 */ 
public class NoMoneyState implements State{
	private VendingMachine machine;  
	  
    public NoMoneyState(VendingMachine machine)  
    {  
        this.machine = machine;  
          
    }  
	public void insertMoney() {
		System.out.println("投币成功");  
        machine.setState(machine.getHasMoneyState());  
	}

	public void backMoney() {
		System.out.println("您未投币，想退钱？...");  
	}

	public void turnCrank() {
		System.out.println("您未投币，想拿东西么？...");  
		
	}

	public void dispense() {
		throw new IllegalStateException("非法状态！");  
	}

}
