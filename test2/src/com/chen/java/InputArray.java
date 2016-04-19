package com.chen.java;

public class InputArray {
	public static void main(String[] args) {
	int a [] = {100,200,300};
	System.out.println(a.length);//一维数组的长度
	System.out.println(a);//数组的引用即地址
	int b[][] ={{1},{1,2},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
	System.out.println(b.length);//二维数组的个数5
	System.out.println(b[4][2]);//数组中的元素6
	System.out.println(b[4]==a);//false
	System.out.println(b[4]);//第五行的首地址
	System.out.println(b[4][2]);

	}

}
