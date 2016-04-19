package com.chen.java;

public class GreekAlphabet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int startPosition  = 0,endPosition = 0;
		char cStart = 'a',cEnd='z';
		startPosition = (int)'a';
		endPosition = (int)'z';
		System.out.println(startPosition);
		System.out.println(endPosition);
		for(int i = startPosition;i <= endPosition;i++ ){
			char c = '\0';
			c = (char)i;
			System.out.print(" "+c);
//			if((i-startPosition+1)%10 == 0){
//				System.out.print("");
			//}
		}
	}

}
