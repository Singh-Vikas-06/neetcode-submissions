class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> set = new ArrayList<>();
        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
            }
        }

        int i = 0;

        for (int num : set) {

        nums[i++] = num;

        }       
        
       return set.size();
    }
}