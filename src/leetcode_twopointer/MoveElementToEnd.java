package leetcode_twopointer;

//time complexity: O(n)
//space complexity: O(1)

import java.util.List;

public class MoveElementToEnd {

	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
	    int arrayIterator = 0;
		int counter = 0;
		while (arrayIterator < array.size()) {
			if (array.get(arrayIterator) != toMove) {
				array.set(counter, array.get(arrayIterator));
				counter++;
			}
			arrayIterator++;
		}
		while (counter < array.size()) {
			array.set(counter, toMove);
			counter++;
		}
		return array;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
