package com.ithup.vendingMachine;

/** 
 * ״̬�Ľӿ� 
 * @author ithup 
 * 
 */  
public interface State {
	/** 
     * ��Ǯ 
     */  
    public void insertMoney();  
    /** 
     * ��Ǯ 
     */  
    public void backMoney();  
    /** 
     * ת������ 
     */  
    public void turnCrank();  
    /** 
     * ����Ʒ 
     */  
    public void dispense();  
}
