package palindrome;

public class Palindrome {
	 public static void main(String[] args) {
	        int number = 121;
	        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));

	        number = 123;
	        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
	    }
	   public static boolean isPalindrome(int num) {
	        int original = num;
	        int reversed = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }
	        return original == reversed;
	    }

}
