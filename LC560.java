// class Solution {
//     public int subarraySum(int[] nums, int k) {
    
//     int prefix_sum = 0 ;
//     HashMap<Integer , Integer> map = new HashMap<>() ;
//     int ans = 0 ;
//     for(int i =0 ;i<nums.length ;i++)
//     {
//     prefix_sum += nums[i];
//     if(prefix_sum == k)
//     {
//     ans++ ;
//     }
//     if(map.containsKey(prefix_sum - k))
//     {
//     ans+=map.get(prefix_sum - k);
//     }
//     map.put(prefix_sum , map.getOrDefault(prefix_sum , 0)+1);
    
//     }
//     return ans ;
//     }
//     }