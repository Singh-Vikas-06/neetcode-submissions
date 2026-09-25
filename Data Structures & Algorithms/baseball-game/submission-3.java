class Solution {
    public int calPoints(String[] operations) {
        int[] nums = new int[operations.length];
        int size=0;
        for(String str : operations){ 
            if(str.equals("+")){
                int sum = nums[size-1]+nums[size-2];
                nums[size]=sum;
                size++;
            }else if(str.equals("C")){
                size--;
            }else if(str.equals("D")){
                nums[size]=2*nums[size-1];
                size++;
            }else{
                nums[size]=Integer.parseInt(str);
                size++;
            }
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=nums[i];
        }
        return sum;
    }
}