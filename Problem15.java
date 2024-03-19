class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=3&&n!=1){
            return false;
        }
        while(n!=1){
            if(n%4==0){
                n=n/4;
            }else
             break;
        }
        return n==1;
        
    }
}
