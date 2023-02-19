package example;

public class Ex9_12 {
	public static int getRand(int from, int to) {
		int tmp = to - from ;
		if(tmp < 0) {
			tmp = to;
			to = from;
			from = tmp;
		}
		tmp = (int)(Math.random()*(to-from + 1)) -Math.abs(from) ;
		return tmp;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<20; i++) {
			System.out.print(getRand(1, -3)+",");
		}
		
		
	}
}
