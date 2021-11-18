package javaconcept.recursion;

public class Recursion {

	public static void reducedByOne (int num) {
		if (num > 0) {
			reducedByOne (num - 1);
		}
		System.out.println(num);
	}
	
	public static int reducedByOne1 (int num) {
		if (num > 0) {
			num = num - 1;
			reducedByOne1 (num);
		}
		return num;
	}
	
	public static void main(String[] args) {
		//reducedByOne (10);
		System.out.println(reducedByOne1 (10));
	}

}
