import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            Integer keyval= (Integer) nums[i];
            if(h.containsKey(keyval)==true){
                ans= ans+ h.get(keyval);
                h.put(keyval,h.get(keyval)+1);
            }
            else{
                h.put(keyval,1);
            }
        }
        return ans;
    }
}