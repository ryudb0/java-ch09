package example;

import java.util.Arrays;

public class Ex9_6 {
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
		
		
	}
	
	public static String fillZero(String src, int length) {
		String result = "";
		if(src == null || src.length() == length) {
			result = src;
		} else if (length <= 0) {
			
		} else if(src.length() > length) {
			result += src.substring(0, length);
		} else {
			char[] charArr = new char[length];
			char[] tmpArr = src.toCharArray();
			for(int i=0; i<charArr.length; i++) {
				charArr[i] = '0';
			}
			for(int i=0; i<tmpArr.length; i++)	 {
				charArr[i+tmpArr.length] = tmpArr[i];
			}
			result = new String(charArr);
		}
		
		return result;
	}
}
