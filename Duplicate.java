import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean ans=true;
            for(int i=0;i<nums.length;i++)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
    
        for(int key :map.keySet())
        {
            if(map.get(key)>1)
            {
                ans=false;
            
            }
        }
        return ans;
        
    }
}