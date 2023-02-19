package example;

public class Ex9_10 {
	public static void main(String[] args) {
		String str = "가나다";
		
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		
		
	}
	


	
//	주어진 문자열을 지정된 크기의 문자열로 변환한다. 나머지 공간은 공백으로 채운다.
	public static String format(String str, int length, int alignment) { 
//		alignment : 0, 1, 2 (왼쪽 정렬, 가운데 정렬, 오른쪽 정렬)
		String tmp = "";
		if(length < str.length()) {
			tmp = str.substring(0, length);
		} else {
			char[] chArr = new char[length];
			for(int i=0; i<chArr.length; i++) {
				chArr[i] = ' ';
			}
			if(alignment == 0) {
				char[] strToChArr = str.toCharArray();
				System.arraycopy(strToChArr, 0, chArr, 0, str.length());
				tmp = new String(chArr);
			} else if(alignment == 1) {
				char[] strToChArr = str.toCharArray();
				int centerWordNum = str.charAt(str.length()) / 2;
//				가운데 정렬은 모르겠다.
//				내 느낌상은 가운데 글자 구해서 글자수를 2n+1
//				변수가 str의 개수와, length 두개가 동시에 변하니까 규칙을 정할 수가없다.
//				모르겠다.
				
			} else if(alignment == 2) {
				char[] strToChArr = str.toCharArray();
				System.arraycopy(strToChArr, 0, chArr, length-str.length(), str.length());
				tmp = new String(chArr);
			}
			
		}
		
		return tmp;
	}
}
