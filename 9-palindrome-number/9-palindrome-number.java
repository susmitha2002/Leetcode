class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int val=x;
        int y=0;
        while(val!=0){
            y=10*y+(val%10);
            val=val/10;
        }
        if(x==y){
            return true;
        }
        return false;
    }
}