package com.chen.two;

public class Village {
	static int waterAmout;//��ˮ��ˮ��
	int peopleNumber;//��ׯ������
	String name;//��ׯ������
	
	
	public Village(String s) {//�вι��췽��
		super();
		this.name = s;
	}
	static void setWaterAmount(int m){//���þ�ˮ���ľ�̬����
		if(m>0){
			waterAmout = m;	
		}
	}
	
	void drinkWater(int n){//��ˮ
		if(waterAmout-n>=0){//�����ˮ�����ں�ˮ��
			waterAmout  = waterAmout-n;
			System.out.println(name+"����"+n+"��ˮ");
			
		}else{
			waterAmout = 0;//����û��ˮ
			
		}
	}
	static int lookWaterAmount(){//
		return waterAmout;	
	}
	void setPeopleNumber(int n){//���ô�ׯ������
		peopleNumber = n;
	}
	int getPeopleNumber(){//�õ���ׯ������
		return peopleNumber;
	}
}
