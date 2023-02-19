package example;

public class Ex9_9 {
	public static void main(String[] args) {
		System.out.println("(1!2@3#4$5) -> "+ delChar("(1!2@3#4$5)", "~!@#$%^&*()"));
		System.out.println("(1 2	3	 4\t5) -> "+ delChar("(1 2	3	 4\t5)", " \t"));
		
		
	}
	
	public static String delChar(String src, String delCh) {
		StringBuffer sf = new StringBuffer(src.length());
		int tmp = 0;
		for(int i=0; i<src.length(); i++) {
			tmp = delCh.indexOf(src.charAt(i));
			if(tmp == -1) {
				sf.append(src.charAt(i));
			}
		}
		return sf.toString();
	}
}
