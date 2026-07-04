public class LargetElement {
    public static void main(String[] args) {
        int[] arr= { 5, 12, 15, 20, 25, 30, 2, 4, 17 };
        int largest = LargestElement(arr);
        System.out.println("Largest Element: " + largest);
    }

    public static int LargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
