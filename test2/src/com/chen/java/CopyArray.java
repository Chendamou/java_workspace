package com.chen.java;

import java.util.Arrays;

public class CopyArray {


	public static void main(String[] args) {
	int [] a = {1,2,3,4,500,600,700,800};//���岢�ҳ�ʼ��һά����
	int [] b,c,d;
	System.out.println(Arrays.toString(a));//�ַ�����
	b = Arrays.copyOf(a, a.length);//����a�����b
	System.out.println(Arrays.toString(b));
	c = Arrays.copyOf(a, 4);//����a�����ǰ�ĸ�Ԫ������ҿ�
	System.out.println(Arrays.toString(c));
	d = Arrays.copyOfRange(a, a.length-4, a.length);//���ƺ��ĸ�Ԫ��
	System.out.println(Arrays.toString(d));
	c[c.length-1] = -100;//��-100��ֵ��c��������һ��Ԫ��
	d[d.length-1] = -200;
	System.out.println(Arrays.toString(c));

	}

}
