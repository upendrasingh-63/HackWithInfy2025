package CollatedMOckSet1;

public class LargestProduct {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        int pf = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            pf = pf * arr[i];
            max = Math.max(max, pf);
        }
        System.out.println(pf);
    }
}
