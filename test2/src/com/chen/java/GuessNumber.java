package com.chen.java;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner reader  = new Scanner(System.in);//从键盘输入一个值
		Random random = new Random();//随机产生一个数
		System.out.println("给你一个1到100之间的整数，请猜到这个数");
		int realNumber = random.nextInt(100)+1;//0到100中的随机整数
		int yourGuess = 0;
		System.out.println("输入你的猜测：");
		yourGuess = reader.nextInt();//得到自己输入的值
		while(yourGuess != realNumber){
			if(yourGuess>realNumber){
				System.out.println("猜大了，再次输入你的猜测：");
				yourGuess = reader.nextInt();
			}
			else if(yourGuess<realNumber){
				System.out.println("猜小了，再次输入你的猜测：");
				yourGuess = reader.nextInt();
			}
		}
		System.out.println("猜对了！");
				

	}

}
