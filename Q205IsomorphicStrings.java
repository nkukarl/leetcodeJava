import java.util.HashMap;

public class Q205IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return helper(s, t) && helper(t, s);
	}
	public boolean helper(String s, String t) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			char val = t.charAt(i);
			if (map.containsKey(key)) {
				if (map.get(key) != val) {
					return false;
				}
			}
			map.put(key, val);
		}
		return true;
	}
}
