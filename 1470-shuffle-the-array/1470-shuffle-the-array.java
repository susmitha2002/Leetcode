class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int index=0;
        int ans[]=new int[nums.length];
        while(i<n && j<2*n){
            ans[index++]=nums[i++];
            ans[index++]=nums[j++];
        }
        return ans;
    }
}