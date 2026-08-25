class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int first=0;
            int last = matrix[i].length-1;
            while(first<=last){
                int mid = first +(last-first)/2;
                if(matrix[i][mid]==target){
                    return true;
                }else if(matrix[i][mid]>target){
                    last = mid-1;
                }else{
                    first = mid+1;
                }
            }
        }
        return false;
    }
}
