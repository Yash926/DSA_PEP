// 


import java.util.*;
public class SlidingWindow{
public static void main(String[] args) {
// max subarray sum of size k
// sliding window approach

// i shirks the window
// j expands the window
int arr[ ] = {2 ,1, 5 ,1 ,3 ,2} ;
int k = 3 ;
int curr = 0;
int i = 0;
int ans = Integer.MIN_VALUE ;
ArrayList<Integer> window = new ArrayList<>() ;
for(int j =0 ;j<arr.length ;j++)
{
curr += arr[j];
window.add(arr[j]) ;

while (j-i+1 > k)
{
// window is more than the allowed size
// shrink window
window.remove(0) ;
curr -=arr[i] ;
i++;
}

if(j-i +1 == k)
{
ans = Math.max(ans , curr) ;
}
}

System.out.println(ans) ;



// max sum subarray of size k







}
}