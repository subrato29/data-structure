package leetcode.misc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class GroupOfAnagram {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<List<String>> groupAnagram(String[] strs) {
        if (strs.length == 0) {
        	return new ArrayList();	
        }
        
        Map<String, List> map = new HashMap<String, List>();
        
        for (int i = 0; i<strs.length; i++) {
            char[] curr = strs[i].toCharArray();
            Arrays.sort(curr);
            String key = String.valueOf(curr);
            if (!map.containsKey(key)) {
            	map.put(key, new ArrayList());
            }
            map.get(key).add(strs[i]);
        }
        
        return new ArrayList(map.values());
    }
	
	public static void main(String[] args) {
		
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		System.out.println(groupAnagram (arr));
	}

}
