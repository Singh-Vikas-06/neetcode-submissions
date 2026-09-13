class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        String ans="";
        char[] arr1=strs[0].toCharArray();
        char[] arr2=strs[strs.length-1].toCharArray();
        int n=Math.min(arr1.length,arr2.length);
        for(int i=0;i<n;i++){
            if(arr1[i]==arr2[i]){
                ans+=arr1[i];
            }else{
                break;
            }
        }
        return ans;

    }
}