public class OddPositions {
    public static void oddPositions(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};
        oddPositions(arr); // 7, 9
    }
}
