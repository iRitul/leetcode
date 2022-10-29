class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ls = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String st="";
            if(i%3==0){
                st=st+"Fizz";
            }if(i%5==0){
                st=st+"Buzz";
            }if(i%3!=0 && i%5!=0){
                st=st+String.valueOf(i);
            }
            ls.add(st);
        }return ls;
    }
}
