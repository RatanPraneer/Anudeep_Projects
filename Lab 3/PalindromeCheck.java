package Samplepackage;

public class PalindromeCheck {
	    
	    public static boolean isPalindrome(int number) {
	        int originalNumber = number; // Save the original number
	        int reversedNumber = 0; // Variable to store the reversed number
	        
	        // Reverse the number
	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }
	        
	        // Check if the original number is equal to the reversed number
	        return originalNumber == reversedNumber;
	    }

	    public static void main(String[] args) {
	        int num = 112211; // Example number to check
	        
	        // Check if the number is a palindrome
	        if (isPalindrome(num)) {
	            System.out.println(num + " is a palindrome.");
	        } else {
	            System.out.println(num + " is not a palindrome.");
       }
    }

}
