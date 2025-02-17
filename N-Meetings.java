// class Pair
// {
// int start ;
// int end ;

// Pair(int start , int end )
// {
// this.start = start ;
// this.end = end ;
// }
// }

// class Solution {
// // Function to find the maximum number of meetings that can
// // be performed in a meeting room.
// public int maxMeetings(int start[], int end[]) {
// // add your code here
// List<Pair> arr = new ArrayList<>() ;
// for(int i =0 ;i<start.length ;i++)
// {
// arr.add(new Pair(start[i] , end[i]));
// }

// Collections.sort(arr , (p1 , p2) -> Integer.compare(p1.end, p2.end)) ;
// int currEnd = -1 ;
// int ans =0 ;
// for(int i =0 ;i<arr.size() ;i++)
// {
// if(arr.get(i).start > currEnd)
// {
// ans++;
// currEnd = arr.get(i).end ;
// }
// }
// return ans ;
// }
// }