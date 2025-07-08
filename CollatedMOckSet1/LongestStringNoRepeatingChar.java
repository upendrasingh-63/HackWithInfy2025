package CollatedMOckSet1;

import java.util.HashSet;

public class LongestStringNoRepeatingChar {
    public static void main(String[] args) {
        String s = "bbbb";
        HashSet<Character> set = new HashSet<>();
        int left = 0, max = 0;
        for (int ri = 0; ri < s.length(); ri++) {
            char ch = s.charAt(ri);
            while (set.contains(ch)) {
                set.remove(ch);
                left++;
            }
            set.add(ch);
            max = Math.max(max, ri - left + 1);
        }
        System.out.println(max);
    }
}