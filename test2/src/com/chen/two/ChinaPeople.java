package com.chen.two;

public class ChinaPeople extends People {
		
	public void speakHello(){
			System.out.println("���");
		}
		public void averageHeight(){
			height = 168.78;
			System.out.println("�й��˵�ƽ����ߣ�"+height+"����");
		}
		@Override
		public void averageWeight() {
			weight = 65;
			System.out.println("�й��˵�ƽ�����أ�"+weight+"ǧ��");
		}
		public void chinaGongfu(){
			System.out.println("�����ӣ�վ���ɣ�˯�繭");
		}
		
}
