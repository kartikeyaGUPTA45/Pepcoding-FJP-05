import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		HashMap<Character, Integer> fmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
		}
		int ofc = 0;
		Character oddchar = null;
		int length = 0;
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			if (fmap.containsKey(ch)) {
				int freq = fmap.get(ch);
				if (freq % 2 != 0) {
					oddchar = ch;
					ofc++;
				}
				if (ofc > 1) {
					System.out.println("-1");
					return;
				}
				fmap.put(ch, freq / 2);
				length += (freq / 2);
			}
		}
		generatepw(1, length, fmap, oddchar, "");

	}

	public static void generatepw(int cs, int ts, HashMap<Character, Integer> fmap, Character oddc, String asf) {
		if (cs == ts + 1) {
			System.out.println(asf + (oddc == null ? "" : oddc) + reverse(asf));
			return;
		}

		for (char ch : fmap.keySet()) {
			if (fmap.get(ch) > 0) {
				fmap.put(ch, fmap.get(ch) - 1);
				generatepw(cs + 1, ts, fmap,oddc, asf + ch);
				fmap.put(ch, fmap.get(ch) + 1);
			}
		}
	}
	
	public static String reverse(String str) {
		StringBuilder ans = new StringBuilder();
		for(int i = str.length() - 1; i >= 0 ; i--) {
			ans.append(str.charAt(i));
		}
		return ans.toString();
	}

}
