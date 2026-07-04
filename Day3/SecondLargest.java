
public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 50, 40};
        int result = SecondLargestElement(arr);
        System.out.println("The SecondLargest element is " + result);
    }

    public static int SecondLargestElement(int[] arr) {
        int largest = arr[0];
        int secondLargestEle = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargestEle = largest;
                largest = arr[i];
            } else if (secondLargestEle < arr[i] && largest > arr[i]) {
                secondLargestEle = arr[i];
            }
        }
        return secondLargestEle;
    }
}
