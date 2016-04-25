import java.util.*;

public class Q036ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		if (board == null) {
			return false;
		}
		int m = board.length;
		int n = board[0].length;
		
		if (m != 9 || n != 9) {
			return false;
		}
		
//		check row
		for (int i = 0; i < m; i++) {
			List<Character> tmp = new ArrayList<Character>();
			for (int j = 0; j < n; j++) {
				if (board[i][j] != '.') {
					tmp.add(board[i][j]);
				}
			}
			Set<Character> uniq = new HashSet<Character>(tmp);
			if (uniq.size() != tmp.size()) {
				return false;
			}
		}
		
//		check column
		for (int j = 0; j < n; j++) {
			List<Character> tmp = new ArrayList<Character>();
			for (int i = 0; i < m; i++) {
				if (board[i][j] != '.') {
					tmp.add(board[i][j]);
				}
			}
			Set<Character> uniq = new HashSet<Character>(tmp);
			if (uniq.size() != tmp.size()) {
				return false;
			}
		}
		
//		check block
		for (int i = 0; i < m; i += 3) {
			for (int j = 0; j < n; j += 3) {
				List<Character> tmp = new ArrayList<Character>();
				for (int vShift = 0; vShift < 3; vShift++) {
					for (int hShift = 0; hShift < 3; hShift++) {
						if (board[i + vShift][j + hShift] != '.') {
							tmp.add(board[i + vShift][j + hShift]);
						}
					}
				}
				Set<Character> uniq = new HashSet<Character>(tmp);
				if (uniq.size() != tmp.size()) {
					return false;
				}
			}
		}
		
		return true;
	}
}
