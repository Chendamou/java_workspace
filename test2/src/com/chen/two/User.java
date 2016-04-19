package com.chen.two;

public class User {

	
	public static void main(String[] args) {
		//Vehicle car1, car2 ;
		Vehicle car1 = new Vehicle();//创建Vehicle型的对象，无参，调用无参构造方法
		Vehicle car2 = new Vehicle(20);//创建Vehicle型的对象，有参，调用有参构造方法
		car1.setPower(128);//为car1设置功率
		car2.setPower(76);//为car2设置功率
		System.out.println("car1的功率是："+car1.getPower());//获得car1的功率
		System.out.println("car2的功率是："+car2.getPower());//获得car2的功率
		car1.speedUp(80);//加速80
		car2.speedUp(80);
		System.out.println("car1目前的速度："+car1.getSpeed());
		System.out.println("car2目前的速度："+car2.getSpeed());
		car1.speedDown(10);//减速10
		car2.speedDown(20);
		System.out.println("car1目前的速度："+car1.getSpeed());
		System.out.println("car2目前的速度："+car2.getSpeed());
		car1.brake();//刹车
		System.out.println("car1刹车是的速度"+car1.getSpeed());
		car2.brake();
		System.out.println("car1刹车是的速度"+car2.getSpeed());
	}

}
