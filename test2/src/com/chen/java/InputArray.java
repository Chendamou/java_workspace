package com.chen.java;

public class InputArray {
	public static void main(String[] args) {
	int a [] = {100,200,300};
	System.out.println(a.length);//һά����ĳ���
	System.out.println(a);//��������ü���ַ
	int b[][] ={{1},{1,2},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
	System.out.println(b.length);//��ά����ĸ���5
	System.out.println(b[4][2]);//�����е�Ԫ��6
	System.out.println(b[4]==a);//false
	System.out.println(b[4]);//�����е��׵�ַ
	System.out.println(b[4][2]);

	}

}
