class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.isEmpty())
                return false;
            char c;
            switch(x){
                case ')':
                    c=stack.pop();
                    if(c=='{' || c=='[')
                        return false;
                    break;
                case '}':
                    c=stack.pop();
                    if(c=='(' || c=='[')
                        return false;
                    break;
                case ']':
                    c=stack.pop();
                    if(c=='{' || c=='(')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
        
    }
}
