package com.chen.two;

public class BeijingPeople extends ChinaPeople {

	@Override
	public void averageHeight() {
			height = 172.5;
			System.out.println("�����˵�ƽ����ߣ�"+height+"����");
	}

	@Override
	public void averageWeight() {
			weight=70;
			System.out.println("�����˵�ƽ�����أ�"+weight+"ǧ��");
		
	}
	public void beijingOpera(){
		System.out.println("���������£�����������");
	}
		
}
