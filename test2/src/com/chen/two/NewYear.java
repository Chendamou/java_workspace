package com.chen.two;

public class NewYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MobileShop shop  = new MobileShop();//�����ⲿ�����
		shop.setMobileAmount(30);
		System.out.println("�ֻ�ר����Ŀǰ��"+shop.getMobileAmount()+"���ֻ�");
		shop.purchaseMoney1.buyMobile();//�ڲ���������ڲ�����
		shop.purchaseMoney2.buyMobile();
		System.out.println("�ֻ�ר����Ŀǰ��"+shop.getMobileAmount()+"���ֻ�");
		
	}

}
