import java.io.*;
import java.util.*;

public class Main {

  public static void generateWords(int cc, String str, int ssf, int ts, Character[] spots,
      HashMap<Character, Integer> lastOccurence) {
    if (cc == str.length()) {
      if (ssf == ts) {
        for (char ch : spots) {
          System.out.print(ch);
        }
        System.out.println();
      }
      return;
    }

    char ch = str.charAt(cc);
    int lo = lastOccurence.get(ch);
    for (int i = lo + 1; i < spots.length; i++) {
      if (spots[i] == null) {
        spots[i] = ch;
        lastOccurence.put(ch, i);
        generateWords(cc + 1, str, ssf + 1, ts, spots, lastOccurence);
        lastOccurence.put(ch, lo);
        spots[i] = null;
      }
    }
    if (lastOccurence.get(ch) == -1) {
      generateWords(cc + 1, str, ssf + 0, ts, spots, lastOccurence);
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    Character[] spots = new Character[k];
    HashMap<Character, Integer> lastOccurence = new HashMap<>();
    for (char ch : str.toCharArray()) {
      lastOccurence.put(ch, -1);
    }

    generateWords(0, str, 0, k, spots, lastOccurence);
  }

}
                        
