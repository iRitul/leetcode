// 682. Baseball Game

class Solution {
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack < String > stack = new Stack < > ();
        for (String string: ops) {
            if(!string.equals("C") && !string.equals("D") && !string.equals("+")){
                stack.push(string);
            }
            else if(string.equals("C")){
                stack.pop();
            }else if(string.equals("D")){
                stack.push(Integer.toString(Integer.parseInt(stack.peek())*2));
            }else{
                stack.push(Integer.toString(Integer.parseInt(stack.get(stack.size()-1))+Integer.parseInt(stack.get(stack.size()-2))));
            }
        }
        for(int i = 0; i<stack.size();i++){
            sum = sum + Integer.parseInt(stack.get(i));
        }
        return sum;
    }
}
