public class ElementExists {
    public static boolean elementExists(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};
        System.out.println(elementExists(arr, 7)); // true
        System.out.println(elementExists(arr, 5)); // false
    }
}
