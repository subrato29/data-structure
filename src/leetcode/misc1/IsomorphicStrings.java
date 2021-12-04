package leetcode.misc1;

import java.util.HashMap;

public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1) 
        	return true;
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                 if(map.get(a).equals(b))
                	 continue;
                 else
                	 return false;
            }else{
                if(!map.containsValue(b))
                	map.put(a,b);
                else 
                	return false;
            }
        }
        return true;        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("abc", "foo"));
	}

}
