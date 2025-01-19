// public 12
// 12209395 - Siddharth Shiv
// 10:28 AM
// int left = 0, right = numbers.size() - 1;

// while (left < right) {
// int sum = numbers[left] + numbers[right];

// if (sum == target) {

// return {left + 1, right + 1};
// } else if (sum < target) {
// ++left;
// } else {
// --right;
// }
// }
// return {};
// }int left = 0, right = numbers.size() - 1;

// while (left < right) {
// int sum = numbers[left] + numbers[right];

// if (sum == target) {

// return {left + 1, right + 1};
// } else if (sum < target) {
// ++left;
// } else {
// --right;
// }
// }
// return {};
// } {
    
// }

public class TwoSum {

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int l=0;
        int ans[]=new int[2];
        int r=arr.length-1;
        int target=9;
        while(r>l)
        {
            int sum=arr[l]+arr[r];
            if(sum==target){

                ans[0]=l+1;
                ans[1]=r+1;
                break;
            }
            else if(sum<target)
            {
              l++;  
            }
            else{
                r--;
            }
        }
        System.out.println(ans[0]+" "+ans[1]);

    }
}