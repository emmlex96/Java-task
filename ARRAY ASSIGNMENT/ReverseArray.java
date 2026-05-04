public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};
        int[] rev = reverseArray(arr);
        for (int n : rev) System.out.print(n + " "); // 4 9 1 7 3
    }
}
