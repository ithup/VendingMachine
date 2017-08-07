package com.ithup.vendingMachine;


/** 
 * ûǮ��״̬ʵ��
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
		System.out.println("Ͷ�ҳɹ�");  
        machine.setState(machine.getHasMoneyState());  
	}

	public void backMoney() {
		System.out.println("��δͶ�ң�����Ǯ��...");  
	}

	public void turnCrank() {
		System.out.println("��δͶ�ң����ö���ô��...");  
		
	}

	public void dispense() {
		throw new IllegalStateException("�Ƿ�״̬��");  
	}

}
