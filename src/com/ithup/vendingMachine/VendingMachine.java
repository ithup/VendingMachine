package com.ithup.vendingMachine;

/** 
 * �Զ��ۻ��� 
 *  
 * @author ithup 
 *  
 */  
public class VendingMachine {
	private State noMoneyState;  //δͶ��״̬
    private State hasMoneyState; //Ͷ��״̬
    private State soldState;  	//׼������Ʒ��״̬
    private State soldOutState;  //��������
    private State winnerState ;   //�н�״̬
    
    /**
     * ��ʼ����Ʒ����Ϊ0��
     */
    private int count = 0;  
    /**
     * ��ʼ����ǰ�ۻ�״̬Ϊ��
     * 				δͶ��״̬
     */
    private State currentState = noMoneyState;  
    /**
     * ���εĹ��췽��:
     * 		���ã���ʼ����Ʒ����
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
     * Ͷ��
     */
    public void insertMoney()  
    {  
        currentState.insertMoney();  
    }  
    /**
     * �˱�
     */
    public void backMoney()  
    {  
        currentState.backMoney();  
    }  
    /**
     * ת������ 
     */
    public void turnCrank()  
    {  
        currentState.turnCrank();  
        if (currentState == soldState || currentState == winnerState)  
            currentState.dispense();  
    }  
    /**
     * ����Ʒ
     */
    public void dispense()  
    {  
        System.out.println("����һ����Ʒ...");  
        if (count != 0)  
        {  
            count -= 1;  
        }  
    }  
    //����set��get ����
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
