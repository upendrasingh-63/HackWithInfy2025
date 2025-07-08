package CollatedMOckSet1;

import java.util.ArrayList;
import java.util.Collections;

public class StringPermute {
    public static void main(String[] args) {
        String s = "iI";
        Character[] vowel = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> woe = new ArrayList<>();
        for (char ch : vowel) {
            list.add(ch);
        }
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                woe.add(s.charAt(i));
            }
        }
        Collections.sort(woe);
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!list.contains(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                sb.append(woe.get(k));
                k++;
            }
        }
        System.out.println(s);
        System.out.println(sb.toString());
    }
}
