package com.chen.two;

public class MobileShop {//�ֻ�ר����
	InnerPurchaseMoney purchaseMoney1;//�����ڲ������
	InnerPurchaseMoney purchaseMoney2;
	private int mobileAmount;//�ֻ�������
	public MobileShop() {
	 purchaseMoney1 = new InnerPurchaseMoney(20000);//�����ڲ������
	 purchaseMoney2= new InnerPurchaseMoney(10000);
	}
	void setMobileAmount(int m){
		mobileAmount=m;
	}
	int getMobileAmount(){
		return mobileAmount;
	}
	
	class InnerPurchaseMoney{//�ڲ����ֻ�ר������Ż�ȯ
		int moneyValue;//�ֻ��ļ�Ǯ
		public InnerPurchaseMoney(int m) {
		moneyValue = m;
		}
		
		void buyMobile(){//���ֻ�,�ŻݵĹ���
			if(moneyValue>=20000){
				mobileAmount = mobileAmount - 6;
				System.out.println("�ü�ֵ"+moneyValue+"���ڲ�����ȯ����6���ֻ�");
			}else if(moneyValue<20000 & moneyValue>=10000){
				mobileAmount = mobileAmount - 3;
				System.out.println("�ü�ֵ"+moneyValue+"���ڲ��������3���ֻ�");
			}
		}
	}
}
