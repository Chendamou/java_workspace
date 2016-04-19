package com.chen.java;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int a =20,b =3,c= 4,d= 5;
	int value1, value2,value3;
	value1 = a+ b++;//++优先级高23
	value2 = a+ ++c;//25
	value3 = a++ +d;//25
	System.out.println("value1="+value1+" "+"value2="+value2+" "+"value3="+value3);
	
 	
	boolean x,y;
	x= !(c>d)||b*c>a&&a>b;//
	y=c==d&&b>c+d||a-b>c+d&&!x;//优先级：（）++ * + << > == $ ^ | $$ || ?: =
	System.out.println("x="+x+" "+"y="+y);
	}

}
