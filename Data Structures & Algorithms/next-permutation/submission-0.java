class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int k=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                k=i;
                pivot=nums[i];
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int j=0;
        for(int i=nums.length-1;i>k;i--){
            if(nums[i]>pivot){
                j=i;
                break;
            }
        }
        swap(nums,k,j);
        reverse(nums,k+1,nums.length-1);
    }
    public void swap(int[] nums,int i,int j){
        int k=nums[i];
        nums[i]=nums[j];
        nums[j]=k;
    }
    public void reverse(int[] nums,int left,int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}