package com.chen.java;

import java.text.NumberFormat;

public class Test4 {

	
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getIntegerInstance();
		nf.setMaximumFractionDigits(2);//������λС��
		
		int [] grade = new int[]{87,92,75};
		int sum =0;
		float average ;
		for(int i = 0; i<grade.length;i++){
			sum+=grade[i];
			System.out.println("�ɼ�����Ϊ��"+sum);
			average = (float)sum/(grade.length);
			System.out.println("ƽ����Ϊ��"+nf.format(average));
			
		}

	}

}
