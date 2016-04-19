package com.chen.two;

public class Village {
	static int waterAmout;//井水的水量
	int peopleNumber;//村庄的人数
	String name;//村庄的名称
	
	
	public Village(String s) {//有参构造方法
		super();
		this.name = s;
	}
	static void setWaterAmount(int m){//设置井水量的静态方法
		if(m>0){
			waterAmout = m;	
		}
	}
	
	void drinkWater(int n){//喝水
		if(waterAmout-n>=0){//如果井水量大于喝水量
			waterAmout  = waterAmout-n;
			System.out.println(name+"喝了"+n+"升水");
			
		}else{
			waterAmout = 0;//井中没有水
			
		}
	}
	static int lookWaterAmount(){//
		return waterAmout;	
	}
	void setPeopleNumber(int n){//设置村庄的人数
		peopleNumber = n;
	}
	int getPeopleNumber(){//得到村庄的人数
		return peopleNumber;
	}
}
