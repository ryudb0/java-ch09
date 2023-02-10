import java.util.StringJoiner;

public class Ex9_14 {
	public static void main(String[] args) {
		String animal = "dog,cat,bear";
		String[] arr = animal.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		for(String s : arr) {
			sj.add(s.toUpperCase());
		}
		
		System.out.println(sj.toString());
	}
}
