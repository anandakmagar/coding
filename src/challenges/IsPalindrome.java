package challenges;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        String lowercaseStr = str.toLowerCase();
        int leftIndex = 0;
        int rightIndex = lowercaseStr.length() - 1;
        
        while(leftIndex < rightIndex) {
        	if(lowercaseStr.charAt(leftIndex) != lowercaseStr.charAt(rightIndex)) {
        		return false;
        	}
        	else {
        		leftIndex++;
        		rightIndex--;
        	}
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("bob"));
        System.out.println(isPalindrome("bobs"));
    }
}
