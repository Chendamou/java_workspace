package com.chen.two;

public class Vehicle {
	private double speed;//汽车的速度
	private int power;//汽车的功率
	

	public Vehicle() {//无参构造方法
		super();
		
	}

	public Vehicle(double speed) {//有参构造方法
		super();
		this.speed = speed;
	}

	void speedUp(int s){//加速
		speed = this.speed + s;
		if(speed>=200){
			System.out.println("请减速！");
		}
	}
	
	void speedDown (int d){//减速
		speed = this.speed - d;
		if(speed<=0){
			System.out.println("请加速");
		}
	}
	void brake(){//刹车
		speed = 0;
	}
	void setPower (int p ){//设置汽车的功率
		this.power = p;
	}
	int getPower(){//得到汽车的功率
		return power;
	}
	double getSpeed(){//得到速度的值
		return speed;
	}
}
