package com.ithup.vendingMachine;

/** 
 * 自动售货机 
 *  
 * @author ithup 
 *  
 */  
public class VendingMachine {
	private State noMoneyState;  //未投币状态
    private State hasMoneyState; //投币状态
    private State soldState;  	//准备出商品的状态
    private State soldOutState;  //货已售完
    private State winnerState ;   //中奖状态
    
    /**
     * 初始化商品数量为0；
     */
    private int count = 0;  
    /**
     * 初始化当前售货状态为：
     * 				未投币状态
     */
    private State currentState = noMoneyState;  
    /**
     * 带参的构造方法:
     * 		作用：初始化商品数量
     * @param count
     */
    public VendingMachine(int count)  
    {  
        noMoneyState = new NoMoneyState(this);  
        hasMoneyState = new HasMoneyState(this);  
        soldState = new SoldState(this);  
        soldOutState = new SoldOutState(this);  
        winnerState = new WinnerState(this);  
        if (count > 0)  
        {  
            this.count = count;  
            currentState = noMoneyState;  
        }  
    }  
    /**
     * 投币
     */
    public void insertMoney()  
    {  
        currentState.insertMoney();  
    }  
    /**
     * 退币
     */
    public void backMoney()  
    {  
        currentState.backMoney();  
    }  
    /**
     * 转动曲柄 
     */
    public void turnCrank()  
    {  
        currentState.turnCrank();  
        if (currentState == soldState || currentState == winnerState)  
            currentState.dispense();  
    }  
    /**
     * 出商品
     */
    public void dispense()  
    {  
        System.out.println("发出一件商品...");  
        if (count != 0)  
        {  
            count -= 1;  
        }  
    }  
    //生成set、get 方法
    public void setState(State state)  
    {  
        this.currentState = state;  
    }

	public State getNoMoneyState() {
		return noMoneyState;
	}

	public void setNoMoneyState(State noMoneyState) {
		this.noMoneyState = noMoneyState;
	}

	public State getHasMoneyState() {
		return hasMoneyState;
	}

	public void setHasMoneyState(State hasMoneyState) {
		this.hasMoneyState = hasMoneyState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}  
}
