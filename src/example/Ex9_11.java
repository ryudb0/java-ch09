package example;

public class Ex9_11 {
	final static String MESSAGE = "USAGE : GugudanTest 3 5";
	
	public static void main(String[] args) {
		try {
			int fNum = Integer.parseInt(args[0]);
			int lNum = Integer.parseInt(args[1]);
			
			if((fNum < 2 || fNum > 9) || (lNum < 2 || lNum > 9)) {
				System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
				System.out.println(MESSAGE);
			} 
			
			//  조건식 초기화 이상하게 썼어 for(int i=fNum; fNum <= lNum; fNum++) 이런식으로 ㅋㅋㅋ
			for(int i=fNum; i<=lNum; i++) {
				for(int j=1; j<=9; j++) {
					System.out.println(i+"*"+j +"="+ (i * j));
				}
				System.out.println();
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			System.out.println(MESSAGE);
			
		}
		
		
		
	}
}
