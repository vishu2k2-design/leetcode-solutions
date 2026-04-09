class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();

        for(String op:ops){
            if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                stack.push(2*stack.peek());
            }else if(op.equals("+")){
                int top1=stack.pop();
                int top2=stack.peek();
                stack.push(top1);
                stack.push(top1+top2);
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        //sum
        int sum=0;
        for(int num:stack){
            sum+=num;
        }
        return sum;
        
    }
}