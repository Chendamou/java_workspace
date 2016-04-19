package com.chen.java;

import java.text.NumberFormat;

public class Test4 {

	
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getIntegerInstance();
		nf.setMaximumFractionDigits(2);//保留两位小数
		
		int [] grade = new int[]{87,92,75};
		int sum =0;
		float average ;
		for(int i = 0; i<grade.length;i++){
			sum+=grade[i];
			System.out.println("成绩总数为："+sum);
			average = (float)sum/(grade.length);
			System.out.println("平均数为："+nf.format(average));
			
		}

	}

}
