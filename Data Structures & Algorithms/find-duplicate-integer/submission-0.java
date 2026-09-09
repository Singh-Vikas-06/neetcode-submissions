class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length];
        for(int num : nums){
            freq[num]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                return i;
            }
        }
        return -1;
    }
}
