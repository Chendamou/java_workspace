package com.chen.java;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 char c = 'a';
	 long l = 1000l;
	 int i = 100;
	 float f =2.72f;
	 byte b = 10;
	 double d = 3.14159;
	 System.out.println("d  "+d);
	 //自动类型转换(小到大)
	 int ii = c+i;
	 long ll = l-ii;
	 float ff  =f * b;
	 double dd = ff/i +d;//
	 //强制类型转换（大到小,损失精度）
	 byte bb =(byte)i;
	 int iii = (int)ll;
	 //显示
	 System.out.println("ii="+ii+" "+"ll="+ll+" "+"ff="+ff+" "+"dd="+dd);
	 System.out.println("bb="+bb+" "+"iii="+iii);

	}

}
