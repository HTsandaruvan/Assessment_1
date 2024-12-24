package secondLargestNumber;
import java.util.Arrays;


public class SecondLargestNumber {

	 public static void main(String[] args) {
	        int[] arr = { 12, 35, 1, 10, 34, 1 };
	        System.out.println("Second Largest Number: " + findSecondLargest(arr));
	    }

	    public static int findSecondLargest(int[] arr) {
	        Arrays.sort(arr); // Sorting the array
	        return arr[arr.length - 2]; // Second last element after sorting
	    }


}
