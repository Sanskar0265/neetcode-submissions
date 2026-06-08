class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        Set<Character> temp = new HashSet<>();
        int left = 0;
        int res = 0;
        for(int i =0; i<arr.length;i++){
            while(temp.contains(arr[i])){
                temp.remove(arr[left]);
                left++;
            }
            temp.add(arr[i]);
            res = Math.max(res,i-left+1);
        }
        return res;
    }
}
