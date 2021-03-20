package generic;

public class Print_1_To_100_Without_Using_Numbers {

	public static void solution1 () {
		int one = 'A' / 'A';
		String s1 = "..........";
		for (int i = one; i <= (s1.length() * s1.length()); i++) {
			System.out.println(i);
		}
	}
	
	// using ASCII
	public static void solution2 () {
		int one = 'A' / 'A';
		for (int i = one; i <= 'd'; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution2();
	}

}
