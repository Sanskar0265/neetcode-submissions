class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);
            
            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
            } 
            // Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            } 
            // Compare the valid characters
            else {
                if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        
        return true;
    }
}