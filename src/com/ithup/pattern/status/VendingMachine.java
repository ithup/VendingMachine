package com.ithup.pattern.status;
/** 
 * �Զ��ۻ��� 
 *  
 * @author ithup
 *  
 */  
public class VendingMachine {
	 /** 
     * ��Ͷ�� 
     */  
    private final static int HAS_MONEY = 0;  
    /** 
     * δͶ�� 
     */  
    private final static int NO_MONEY = 1;  
    /** 
     * �۳���Ʒ 
     */  
    private final static int SOLD = 2;  
    /** 
     * ��Ʒ���� 
     */  
    private final static int SOLD_OUT = 3;  
    /**
     * ��ʼ����ǰ״̬Ϊ1��δͶ�ң�
     * 		currentStatus״̬�����޸�Ϊ��
     * 						HAS_MONEY��Ͷ�� 
     *     ��				SOLD �۳���Ʒ 
     *     					SOLD_OUT��Ʒ���� 
     */
    private int currentStatus = NO_MONEY;  
    /** 
     * ��Ʒ���� 
     */  
    private int count = 0;  
    /**
     * ���ι��캯������ʼ����Ʒ����
     * @param count
     */
    public VendingMachine(int count)  
    {  
        this.count = count;  
        if (count > 0)  
        {  //�����ʼ����Ʒ��������0������ǰ״̬��ΪδͶ�ң����Թ�����Ʒ
            currentStatus = NO_MONEY;  
        }  
    }  
  
    /** 
     * Ͷ��Ӳ�ң��κ�״̬�û�������Ͷ�� 
     */  
    public void insertMoney()  
    {  
        switch (currentStatus)  
        {  
        case NO_MONEY:  
            currentStatus = HAS_MONEY;  
            System.out.println("�ɹ�Ͷ��Ӳ��");  
            break;  
        case HAS_MONEY:  
            System.out.println("�Ѿ���Ӳ�ң�����Ͷ��");  
            break;  
        case SOLD:  
            System.out.println("���Ե�...");  
            break;  
        case SOLD_OUT:  
            System.out.println("��Ʒ�Ѿ�����������Ͷ��");  
            break;  
  
        }  
    }  
  
    /** 
     * �˱ң��κ�״̬�û��������˱� 
     */  
    public void backMoney()  
    {  
        switch (currentStatus)  
        {  
        case NO_MONEY:  
            System.out.println("��δͶ��Ӳ��");  
            break;  
        case HAS_MONEY:  
            currentStatus = NO_MONEY;  
            System.out.println("�˱ҳɹ�");  
            break;  
        case SOLD:  
            System.out.println("���Ѿ������ǹ�...");  
            break;  
        case SOLD_OUT:  
            System.out.println("��δͶ��...");  
            break;  
        }  
    }  
  
    /** 
     * ת���ֱ�����,�κ�״̬�û�������ת���ֱ� 
     */  
    public void turnCrank()  
    {  
        switch (currentStatus)  
        {  
        case NO_MONEY:  
            System.out.println("����Ͷ��Ӳ��");  
            break;  
        case HAS_MONEY:  
            System.out.println("���ڳ���Ʒ....");  
            currentStatus = SOLD;  
            dispense();  
            break;  
        case SOLD:  
            System.out.println("����ת��Ҳû��...");  
            break;  
        case SOLD_OUT:  
            System.out.println("��Ʒ�Ѿ�����");  
            break;  
  
        }  
    }  
  
    /** 
     * ������Ʒ 
     */  
    private void dispense()  
    {  
  
        switch (currentStatus)  
        {  
        case NO_MONEY:  
        case HAS_MONEY:  
        case SOLD_OUT:  
            throw new IllegalStateException("�Ƿ���״̬...");  
        case SOLD:  
            count--;  
            System.out.println("������Ʒ...");  
            if (count == 0)  
            {  
                System.out.println("��Ʒ����");  
                currentStatus = SOLD_OUT;  
            } else  
            {  
                currentStatus = NO_MONEY;  
            }  
            break;  
  
        }  
  
    }

	public Object getHasMoneyState() {
		return null;
	}

	public void setState(Object hasMoneyState) {
		
	}  
}  
