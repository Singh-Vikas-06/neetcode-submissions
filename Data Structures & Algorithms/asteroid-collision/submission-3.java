class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int num : asteroids){
            if(num>0){
                stack.push(num);
            }else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(num)){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek()<0){
                    stack.push(num);
                }
                if(stack.peek()==Math.abs(num)){
                    stack.pop();
                }
            }
        }
        int[] arr = new int[stack.size()];
        int i=arr.length-1;
        while(!stack.isEmpty() && i>=0){
            arr[i--]=stack.pop();
        }
        return arr;
    }
}