package com.ithup.vendingMachine;
/**
 * 程序 的入口
 * @author ithup
 *
 */

public class VendingMachineWeb {
	public static void main(String[] args)  
    {  /*
        VendingMachine machine = new VendingMachine(10);  
        machine.insertMoney();  
        machine.backMoney();  
  
        System.out.println("----我要中奖----");  
  
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
  
        System.out.println("-------压力测试------");  
  
        machine.insertMoney();  
        machine.backMoney();  
        machine.backMoney();  
        machine.turnCrank();// 无效操作  
        machine.turnCrank();// 无效操作  
        machine.backMoney();  */
		/**
		 * 初始化商品数量为10件商品
		 */
		VendingMachine machine = new VendingMachine(1);
		System.out.println("\n********************欢迎你使用无人售货机！***********************\n");
		System.out.println("请投币！");
		machine.insertMoney();
		machine.backMoney();
    }  
}
