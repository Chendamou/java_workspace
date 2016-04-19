package com.chen.two;

public class MobileShop {//手机专卖店
	InnerPurchaseMoney purchaseMoney1;//声明内部类变量
	InnerPurchaseMoney purchaseMoney2;
	private int mobileAmount;//手机的数量
	public MobileShop() {
	 purchaseMoney1 = new InnerPurchaseMoney(20000);//创建内部类对象
	 purchaseMoney2= new InnerPurchaseMoney(10000);
	}
	void setMobileAmount(int m){
		mobileAmount=m;
	}
	int getMobileAmount(){
		return mobileAmount;
	}
	
	class InnerPurchaseMoney{//内部类手机专卖店的优惠券
		int moneyValue;//手机的价钱
		public InnerPurchaseMoney(int m) {
		moneyValue = m;
		}
		
		void buyMobile(){//买手机,优惠的规则
			if(moneyValue>=20000){
				mobileAmount = mobileAmount - 6;
				System.out.println("用价值"+moneyValue+"的内部购物券买了6部手机");
			}else if(moneyValue<20000 & moneyValue>=10000){
				mobileAmount = mobileAmount - 3;
				System.out.println("用价值"+moneyValue+"的内部购物劵买了3部手机");
			}
		}
	}
}
