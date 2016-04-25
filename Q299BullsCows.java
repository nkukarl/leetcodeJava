import java.util.*;

public class Q299BullsCows {
	public String getHint(String secret, String guess) {
		String s = "";
		String g = "";
		int A = 0;
		int B = 0;
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i)) {
				A++;
			} else {
				s += secret.charAt(i);
				g += guess.charAt(i);
			}
		}
		HashMap<Character, Integer> sStat = stat(s);
		HashMap<Character, Integer> gStat = stat(g);
		for (char key : sStat.keySet()) {
			if (gStat.containsKey(key)) {
				B += Math.min(sStat.get(key), gStat.get(key));
			}
		}
		return Integer.toString(A) + "A" + Integer.toString(B) + "B";
		
	}
	public HashMap<Character, Integer> stat(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i); 
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		return map;
	}
}
