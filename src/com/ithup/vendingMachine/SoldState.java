package com.ithup.vendingMachine;

/** 
 * ׼������Ʒ��״̬,��״̬�£��������κ��û��Ĳ��� 
 *  
 * @author ithup 
 *  
 */  
public class SoldState implements State{
	 private VendingMachine machine;  
	  
	    public SoldState(VendingMachine machine)  
	    {  
	        this.machine = machine;  
	    }  
	  
	    @Override  
	    public void insertMoney()  
	    {  
	        System.out.println("���ڳ���������Ͷ��");  
	    }  
	  
	    @Override  
	    public void backMoney()  
	    {  
	        System.out.println("���ڳ�����û�п��˵�Ǯ");  
	    }  
	  
	    @Override  
	    public void turnCrank()  
	    {  
	        System.out.println("���ڳ����������ظ�ת���ֱ�");  
	    }  
	  
	    @Override  
	    public void dispense()  
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
