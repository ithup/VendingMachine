package com.ithup.vendingMachine;
/**
 * ���� �����
 * @author ithup
 *
 */

public class VendingMachineWeb {
	public static void main(String[] args)  
    {  /*
        VendingMachine machine = new VendingMachine(10);  
        machine.insertMoney();  
        machine.backMoney();  
  
        System.out.println("----��Ҫ�н�----");  
  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
  
        System.out.println("-------ѹ������------");  
  
        machine.insertMoney();  
        machine.backMoney();  
        machine.backMoney();  
        machine.turnCrank();// ��Ч����  
        machine.turnCrank();// ��Ч����  
        machine.backMoney();  */
		/**
		 * ��ʼ����Ʒ����Ϊ10����Ʒ
		 */
		VendingMachine machine = new VendingMachine(1);
		System.out.println("\n********************��ӭ��ʹ�������ۻ�����***********************\n");
		System.out.println("��Ͷ�ң�");
		machine.insertMoney();
		machine.backMoney();
    }  
}
