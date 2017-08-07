package com.ithup.vendingMachine;


public class WinnerState implements State{
	private VendingMachine machine;  
	  
    public WinnerState(VendingMachine machine)  
    {  
        this.machine = machine;  
    }  
  
    @Override  
    public void insertMoney()  
    {  
        throw new IllegalStateException("�Ƿ�״̬");  
    }  
  
    @Override  
    public void backMoney()  
    {  
        throw new IllegalStateException("�Ƿ�״̬");  
    }  
  
    @Override  
    public void turnCrank()  
    {  
        throw new IllegalStateException("�Ƿ�״̬");  
    }  
  
    @Override  
    public void dispense()  
    {  
        System.out.println("���н��ˣ���ϲ�㣬���õ�2����Ʒ");  
        machine.dispense();  
  
        if (machine.getCount() == 0)  
        {  
            System.out.println("��Ʒ�Ѿ�����");  
            machine.setState(machine.getSoldOutState());  
        } else  
        {  
            machine.dispense();  
            if (machine.getCount() > 0)  
            {  
                machine.setState(machine.getNoMoneyState());  
            } else  
            {  
                System.out.println("��Ʒ�Ѿ�����");  
                machine.setState(machine.getSoldOutState());  
            }  
              
        }  
  
    }  
}
