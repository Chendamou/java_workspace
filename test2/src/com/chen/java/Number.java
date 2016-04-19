package com.chen.java;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int number  = 0,d5,d4,d3,d2,d1;
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入一个1到99999之间的数：");
		number = reader.nextInt();
		if(number>0||number<99999){
	      d5 =(number/10000);
	      d4 =(number%10000)/1000;
	      d3 =((number%10000)%100)/100;
	      d2= number%100/10;
	      d1 = number%10;
	      if(d5>0){
	    	  System.out.println(number+"是五位数！");
	    	  if(d5 == d1 && d4==d2){
	    		  System.out.println("是回文数！");
	    	  }else{
	    		  System.out.println("不是回文数！");
	    	  }
	      }
	      else if(d4>0){
	    	  System.out.println(number+"是四位数！");
	    	  if(d4 == d1&&d3==d2){
	    		  System.out.println("是回文数！");
	    	  }else{
	    		  System.out.println("不是回文数！");
	    	  }
	    	  
	      }else if(d3>0){
	    	  System.out.println(number+"是三位数！");
	    	  if(d3==d1){
	    		  System.out.println("是回文数！");
	    	  }else{
	    		  System.out.println("不是回文数！");
	    	  }
	      }else if(d2!=0)
	      {System.out.println(number+"是两位数！");
	    	  if(d2==d1){
	    		  System.out.println("是回文数！");
	    	  }else{
	    		  System.out.println("不是回文数！");
	    	  }
	    		  
	    	  }else if(d1!=0){
	    		  System.out.println(number+"是一位数！");
	    		  System.out.println("是回文数！");
	    	  }
	    	  else{
	    		  System.out.println("\n%d不在1到99999之间"+number);
	   }
	      }
			
		}
	}


