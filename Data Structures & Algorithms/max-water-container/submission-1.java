class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        for(int i = 0; i<= heights.length-2; i++){
            for (int j =i+1; j<= heights.length-1;j++){
                int height = Math.min(heights[i], heights[j]);
                int len = j-i;
                int area = height *len;
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }
}
