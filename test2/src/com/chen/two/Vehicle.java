package com.chen.two;

public class Vehicle {
	private double speed;//�������ٶ�
	private int power;//�����Ĺ���
	

	public Vehicle() {//�޲ι��췽��
		super();
		
	}

	public Vehicle(double speed) {//�вι��췽��
		super();
		this.speed = speed;
	}

	void speedUp(int s){//����
		speed = this.speed + s;
		if(speed>=200){
			System.out.println("����٣�");
		}
	}
	
	void speedDown (int d){//����
		speed = this.speed - d;
		if(speed<=0){
			System.out.println("�����");
		}
	}
	void brake(){//ɲ��
		speed = 0;
	}
	void setPower (int p ){//���������Ĺ���
		this.power = p;
	}
	int getPower(){//�õ������Ĺ���
		return power;
	}
	double getSpeed(){//�õ��ٶȵ�ֵ
		return speed;
	}
}
