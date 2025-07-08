package CollatedMOckSet1;

public class FindPeak {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int idx = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println(arr.length - 1);
        } else {
            System.out.println(idx);
        }
    }
}
