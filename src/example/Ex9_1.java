package example;

public class Ex9_1 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));
		
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof SutdaCard)) return false;
		
		SutdaCard tmp = (SutdaCard)obj;
		if(this.num == tmp.num && this.isKwang == tmp.isKwang) return true;
		return false;
	}
	
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}