// class Solution {
//     public int[] runningSum(int[] nums) {
//         int sum=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             nums[i]=sum+=nums[i];
//         }
//         return nums;
//     }
// }
class PrefixSum{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        for(int i=1;i<arr.length;i++)
        {
            arr[i]+=arr[i-1];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
    }

}



// // Online Free Java compiler to run Java program online
// import java.util.* ;
// public class Main {
// public static void main(String[] args) {

// int arr [] = {1 , 9 , 7 , 4 ,5 } ;

// // prefix sum
// // prefix max ---> try this out
// // prefix min
// //prefix product
// int prefix [] = new int[arr.length] ;
// prefix[0] = arr[0];
// for(int i =1 ;i<arr.length ;i++)
// {
// prefix[i] = Math.max(prefix[i-1] , arr[i]) ;
// }
// //prefix[3]
// // suffix sum
// int suffix[] = new int[arr.length] ;
// suffix[suffix.length -1] = arr[arr.length -1] ;
// for(int i = arr.length -2;i>=0 ; i--)
// {
// suffix[i] = suffix[i+1] + arr[i] ;
// }

// for(int i =0 ;i<prefix.length ;i++)
// {
// System.out.print(prefix[i] +" ");
// }
// System.out.println();
// for(int i =0 ;i<suffix.length ;i++)
// {
// System.out.print(suffix[i] +" ");
// }
// }
// }