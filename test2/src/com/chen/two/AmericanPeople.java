package com.chen.two;

public class AmericanPeople extends People{

	@Override
	public void speakHello() {
		System.out.println("How do you do");
	}

	@Override
	public void averageHeight() {
		height = 176;
		System.out.println("American is average height:"+height+"cm");
		
	}

	@Override
	public void averageWeight() {
		weight = 75;
		System.out.println("American is average weight:"+weight+"kg");
	}
		public void americanBoxing(){
			System.out.println("ֱȭ����ȭ�����ȭ");
		}
}
