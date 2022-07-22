// 1417. Reformat The String
// https://leetcode.com/problems/reformat-the-string/

class Solution {
    public String reformat(String s) {
        List<Character> character = new ArrayList();
        List<Character> digit = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                digit.add(s.charAt(i));
            }else{
                character.add(s.charAt(i));
            }
        }
        System.out.println("Char: "+ character.size() + ","+ "dig: "+ digit.size());
        if(Math.abs(character.size()-digit.size()) > 1){
            return "";
        }
        boolean flag = digit.size()>character.size();
        for(int i=0; i<s.length();i++){
            if(flag){
                sb.append(digit.remove(0));
            }else{
                sb.append(character.remove(0));
            }
            flag=!flag;
        }
        return sb.toString();
    }
}
