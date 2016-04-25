import java.util.*;

public class Q242ValidAnagram {
	public boolean isAnagram_opt(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] summary = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ss = s.charAt(i);
			char tt = t.charAt(i);
			summary[ss - 'a']++;
			summary[tt - 'a']--;
		}
		for (int x : summary) {
			if (x != 0) {
				return false;
			}
		}
		return true;
	}
	public boolean isAnagram(String s, String t) {
		
		if (s == null && t == null) {
			return true;
		}
		if (s == null || t == null) {
			return false;
		}
		if (s.length() != t.length()) {
			return false;
		}
		
		Map<Character, Integer> mapS = helper(s);
		Map<Character, Integer> mapT = helper(t);
		
//		System.out.println(mapS);
//		System.out.println(mapT);
		
		for (char key : mapS.keySet()) {
			
			if (mapT.get(key) == null) {
				return false;
			}
			
			int a = mapS.get(key);
			int b = mapT.get(key);
			
			if (a != b) {
				return false;
			}
		}
		return true;
	}
	public Map<Character, Integer> helper(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == null) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}
		return map;
	}
}
