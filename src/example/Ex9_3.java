package example;

public class Ex9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int tmp = fullPath.lastIndexOf("\\");		// 값이 없어서 -1을 뱉었을때 생각을 못 했군
		path = fullPath.substring(0, tmp);
		fileName = fullPath.substring(tmp+1);
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
		
	}
}
