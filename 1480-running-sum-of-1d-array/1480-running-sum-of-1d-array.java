class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum[]=new int[nums.length];
        int sumtillnow=0;
        for(int i=0;i<nums.length;i++){
            runningSum[i]=sumtillnow+nums[i];
            sumtillnow = sumtillnow+nums[i];
        }
        return runningSum;
    }
}