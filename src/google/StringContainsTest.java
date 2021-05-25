package google;

public class StringContainsTest {

	public static String solution (String string1, String string2) {
		String bigger = "";
		String smaller = "";
		
		if (string1.length() >= string2.length()) {
			bigger = string1;
			smaller = string2;
		} else {
			bigger = string2;
			smaller = string1;
		}
		if (bigger.indexOf(smaller) != -1) {
			return bigger;
		}
		
		String overlapped = smaller;
		int counter = 0;
		
		while (bigger.indexOf(overlapped) == -1) {
			overlapped = smaller.substring(counter, smaller.length());
			counter++;
		}
		if (counter <= smaller.length()) {
			return smaller.substring(0, counter - 1) + bigger;	
		}
		return smaller + bigger;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Apple";
		String string2 = "nglish";
		System.out.println(solution (string1, string2));
	}

}
