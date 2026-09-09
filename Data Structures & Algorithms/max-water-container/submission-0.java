class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int w=j-i;
            int ht= Math.min(heights[i],heights[j]);
            int area = ht*w;
            max=Math.max(area,max);
            if(heights[i]>heights[j]){ j--;}  
            else{i++;}
        }
        return max;
    }
}
