package com.chen.java;

import java.util.Arrays;

public class CopyArray {


	public static void main(String[] args) {
	int [] a = {1,2,3,4,500,600,700,800};//定义并且初始化一维数组
	int [] b,c,d;
	System.out.println(Arrays.toString(a));//字符数组
	b = Arrays.copyOf(a, a.length);//复制a数组给b
	System.out.println(Arrays.toString(b));
	c = Arrays.copyOf(a, 4);//复制a数组的前四个元素左闭右开
	System.out.println(Arrays.toString(c));
	d = Arrays.copyOfRange(a, a.length-4, a.length);//复制后四个元素
	System.out.println(Arrays.toString(d));
	c[c.length-1] = -100;//将-100赋值给c数组的最后一个元素
	d[d.length-1] = -200;
	System.out.println(Arrays.toString(c));

	}

}
