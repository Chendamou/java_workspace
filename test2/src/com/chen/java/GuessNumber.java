package com.chen.java;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner reader  = new Scanner(System.in);//�Ӽ�������һ��ֵ
		Random random = new Random();//�������һ����
		System.out.println("����һ��1��100֮�����������µ������");
		int realNumber = random.nextInt(100)+1;//0��100�е��������
		int yourGuess = 0;
		System.out.println("������Ĳ²⣺");
		yourGuess = reader.nextInt();//�õ��Լ������ֵ
		while(yourGuess != realNumber){
			if(yourGuess>realNumber){
				System.out.println("�´��ˣ��ٴ�������Ĳ²⣺");
				yourGuess = reader.nextInt();
			}
			else if(yourGuess<realNumber){
				System.out.println("��С�ˣ��ٴ�������Ĳ²⣺");
				yourGuess = reader.nextInt();
			}
		}
		System.out.println("�¶��ˣ�");
				

	}

}
