package com.chen.two;

public class User {

	
	public static void main(String[] args) {
		//Vehicle car1, car2 ;
		Vehicle car1 = new Vehicle();//����Vehicle�͵Ķ����޲Σ������޲ι��췽��
		Vehicle car2 = new Vehicle(20);//����Vehicle�͵Ķ����вΣ������вι��췽��
		car1.setPower(128);//Ϊcar1���ù���
		car2.setPower(76);//Ϊcar2���ù���
		System.out.println("car1�Ĺ����ǣ�"+car1.getPower());//���car1�Ĺ���
		System.out.println("car2�Ĺ����ǣ�"+car2.getPower());//���car2�Ĺ���
		car1.speedUp(80);//����80
		car2.speedUp(80);
		System.out.println("car1Ŀǰ���ٶȣ�"+car1.getSpeed());
		System.out.println("car2Ŀǰ���ٶȣ�"+car2.getSpeed());
		car1.speedDown(10);//����10
		car2.speedDown(20);
		System.out.println("car1Ŀǰ���ٶȣ�"+car1.getSpeed());
		System.out.println("car2Ŀǰ���ٶȣ�"+car2.getSpeed());
		car1.brake();//ɲ��
		System.out.println("car1ɲ���ǵ��ٶ�"+car1.getSpeed());
		car2.brake();
		System.out.println("car1ɲ���ǵ��ٶ�"+car2.getSpeed());
	}

}
