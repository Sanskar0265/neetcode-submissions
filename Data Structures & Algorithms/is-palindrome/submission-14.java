class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\w]","").toLowerCase();
        char[] arr = s.toCharArray();
        int last = arr.length-1;
        for(int i =0; i< arr.length; i++){
            if(arr[i] != arr[last-i]){
                return false;
            }
            if(i >= last) return true;
        }
    return true;
    }
}
