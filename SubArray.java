// int arr[ ] = {1 ,2 ,3} ;
// int k = 3 ;
// // sum of all subarray which equals to k
// ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>() ;

// for(int i =0 ;i<arr.length ;i++)
// {
// ArrayList<Integer> temp= new ArrayList<>() ;
// for(int j =i ;j<arr.length ;j++)
// {
// temp.add(arr[j]);
// subarrays.add(new ArrayList(temp));
// }
// }

// System.out.println(subarrays);



// int ans = 0;

// for(int i =0 ;i<arr.length ;i++)
// {
// int curr =0 ;
// for(int j =i ;j<arr.length ;j++)
// {
// curr+=arr[j];
// if(curr == k)
// {
// ans++;
// }
// }
// }