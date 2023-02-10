public class Ex9_13 {
	public static void main(String[] args) {
//		길이가 0인 char배열을 생성한다.
		char[] chArr = new char[0];
		String s = new String(chArr);
		
		System.out.println("chArr.length="+chArr.length);
		System.out.println("@@@"+s+"@@@");

		
	}
}
