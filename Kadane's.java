class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub=nums[0];
        int curr=0;
        for(int i=0;i<nums.length;i++)
        {

            if(curr<0)
            {
                curr=0;
            }
            curr+=nums[i];
            maxSub=Math.max(curr,maxSub);
        }
        return maxSub;
    }
}

//kadane's algorithm- to find the maximum subarray sum
//in this if the at any point the sum becomes negative then we will start the sum from 0 again;