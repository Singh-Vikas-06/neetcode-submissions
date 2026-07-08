class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String str : operations){
            if(str.equals("+")){
                int top = stack.pop();
                int newTop = stack.peek()+top;
                stack.push(top);
                stack.push(newTop);
            }
            else if(str.equals("C")){
                stack.pop();
            }
            else if(str.equals("D")){
                stack.push(2*stack.peek());
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        for(int num : stack){
            sum+=num;
        }
        return sum;
    }
}