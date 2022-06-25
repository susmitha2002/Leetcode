import java.util.*;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        for(int i=0;i<stones.length();i++){
            if(h.containsKey(stones.charAt(i))==true){
                h.put(stones.charAt(i),h.get(stones.charAt(i))+1);
            }
            else{
                h.put(stones.charAt(i),1);
            }
        }
        int ans=0;
        for(int i=0;i<jewels.length();i++){
            if(h.containsKey(jewels.charAt(i))){
                ans=ans+h.get(jewels.charAt(i));
            }
        }
        return ans;
    }
}