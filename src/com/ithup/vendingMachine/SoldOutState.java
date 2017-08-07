package com.ithup.vendingMachine;


/** 
 * ������״̬ 
 *  
 * @author ithup 
 *  
 */ 
public class SoldOutState implements State{
	private VendingMachine machine;  
	  
    public SoldOutState(VendingMachine machine)  
    {  
        this.machine = machine;  
    }  
  
    @Override  
    public void insertMoney()  
    {  
        System.out.println("Ͷ��ʧ�ܣ���Ʒ������");  
    }  
  
    @Override  
    public void backMoney()  
    {  
        System.out.println("��δͶ�ң�����Ǯô��...");  
    }  
  
    @Override  
    public void turnCrank()  
    {  
        System.out.println("��Ʒ������ת���ֱ�Ҳľ����");  
    }  
  
    @Override  
    public void dispense()  
    {  
        throw new IllegalStateException("�Ƿ�״̬��");  
    }  
}
