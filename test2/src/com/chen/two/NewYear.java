package com.chen.two;

public class NewYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MobileShop shop  = new MobileShop();//创建外部类对象
		shop.setMobileAmount(30);
		System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");
		shop.purchaseMoney1.buyMobile();//内部对象调用内部方法
		shop.purchaseMoney2.buyMobile();
		System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");
		
	}

}
