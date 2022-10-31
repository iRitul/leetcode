class Solution {
    public boolean isHappy(int n) {
        int c=n;
        do{
            int temp=0;
            int t=String.valueOf(c).length();
            for(int i=0;i<t;i++){
                temp+= (int)Math.pow(c%10,2);
                c/=10;
            }
            c=temp;
        }while(c!=n && c!=1 && c!=4);
        if(c==1)
            return true;
        else
            return false;
    }
}
