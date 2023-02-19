package example;

import java.util.*;

public class Ex9_14 {
	public static void main(String[] args) {
//		이문제는 정말 하나도 모르겠다.

		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7890",
				"088-2346-9870",
				"013-3456-7890"
		};
		
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			
			if(input.equals("")) {
				continue;
			} else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다.");
			}
			
		}
	}
}
