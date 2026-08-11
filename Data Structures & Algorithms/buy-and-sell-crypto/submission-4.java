class Solution {
    public int maxProfit(int[] prices) {
      int min=10000000;
      int max=0;
      for(int price:prices){
        if(price<min){
            min=price;
        }
        else{
            max=Math.max(max,price-min);
        }
      }
      return max;
    }
}
