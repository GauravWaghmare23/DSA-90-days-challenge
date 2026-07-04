
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,2,3,0,5,0,4,0,0,6};
        System.out.println("Before moving zeroes to the end: "+ Arrays.toString(arr));
        MoveZeroesToEndOfArray(arr);
        System.out.println("After moving zeroes to the end: "+ Arrays.toString(arr));
    }

    public static void MoveZeroesToEndOfArray(int[] arr) {

        int n = arr.length;
        int i = -1;

        for(int j = 0; j < n; j++) {
            if(arr[j] == 0) {
                i = j;
                break;
            }
        }

        for(int j = i + 1; j < n; j++) {
            if(arr[j] != 0) {
                arr[i] = arr[j];
                arr[j] = 0;
                i++;
            }
        }
    }
}
