import java.util.Arrays;

public class Ex9_8 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 }; 
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		System.out.println(arr);
		System.out.println(arrClone);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		System.out.println("------------------------------------");
		
		Test t1 = new Test();
		Test t2 = (Test)t1.clone();
		t1.showInside();
		t2.showInside();
		
		t1.intArr[0] = 9;
		System.out.println("t1변경후");
		t1.showInside();
		t2.showInside();
//		복사된 클래스의 값도 같이 바뀐다.
//		int[]에 바로 클론은 바뀌지 않지만
//		클래스 내부에 있는 기본형제외한 나머지 참조형은 같은 주소를 참조하게끔 만들어진다.
		
	}
}

class Test implements Cloneable {
	int[] intArr = { 1, 2, 3, 4, 5 };
	
	Test() {	}
	
	public Test clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (Exception e) {		}
//		그래서 같은 주소를 갖지않게 하려면
//		int[] temArr = ((Test)obj).intArr.clone();
//		((Test)obj).intArr = temArr;
//		return obj;
		
//		이렇게도 가능
		Test t = (Test)obj;
		t.intArr = ((Test)obj).intArr.clone();
		return t;
	}
	
	public void showInside() {
		System.out.println(Arrays.toString(intArr));
	}
	
}