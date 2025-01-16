import java.util.Arrays;

public class MissingNumber {
     public int missingNumber(int[] nums) {
        Arrays.sort(nums);
       int count=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==count)
        {
            count++;
        }
        else
        {
            break;
        }

       }
       return count;
    }
}


//can also be done using hashset;
