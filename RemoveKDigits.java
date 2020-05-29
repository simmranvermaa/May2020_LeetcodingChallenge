class Solution {
    public String removeKdigits(String num, int k) {
        int size=num.length();
        if(k==size)
            return "0";
        Stack<Character> stack=new Stack<>();
        int counter=0;
        while(counter<size){
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(counter)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(counter));
            counter++;
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder x=new StringBuilder();
        while(!stack.isEmpty()){
            char curr=stack.pop();
            x.append(curr);
        }
        
        x.reverse();
        while(x.length()>1 && x.charAt(0)=='0')
        {
            x.deleteCharAt(0);
        }
    return x.toString();    
    }
}
