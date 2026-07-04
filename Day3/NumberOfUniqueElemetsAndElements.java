
public class NumberOfUniqueElemetsAndElements {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int unique = removeDuplicates(arr);
        System.out.println("Number of unique elements: " + unique);
        System.out.print("Our array now: ");
        for (int i = 0; i < unique; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
