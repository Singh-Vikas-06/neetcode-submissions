class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int a=1;
      for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],a);
        }
        map.put(nums[i],map.get(nums[i])+1);
      }
      int max=0;
      int majority =0;
      for(int i : map.keySet()){
        if(map.get(i)>max){
            max=map.get(i);
            majority=i;
        }
      }
      return  majority;
    }
}