// //{ Driver Code Starts
import java.io.*;
import java.util.*;

class fractionalKnapsack {

public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t = Integer.parseInt(br.readLine().trim());

while (t-- > 0) {
// Read values array
String[] valueInput = br.readLine().trim().split(" ");
List<Integer> values = new ArrayList<>();
for (String s : valueInput) {
values.add(Integer.parseInt(s));
}

// Read weights array
String[] weightInput = br.readLine().trim().split(" ");
List<Integer> weights = new ArrayList<>();
for (String s : weightInput) {
weights.add(Integer.parseInt(s));
}

// Read the knapsack capacity
int w = Integer.parseInt(br.readLine().trim());

// Call fractionalKnapsack function and print result
System.out.println(String.format(
"%.6f", new Solution().fractionalKnapsack(values, weights, w)));
System.out.println("~");
}
}
}

// } Driver Code Ends


// User function Template for Java
class Item
{
int val ;
int wt ;
double ratio ;

Item(int val , int wt)
{
this.val = val ;
this.wt = wt ;
this.ratio = this.ratio = (double) this.val / this.wt ;
}
}

class ItemComp implements Comparator<Item>
{
public int compare(Item i1 , Item i2)
{
return Double.compare(i2.ratio , i1.ratio);
}
}
class Solution {
// Function to get the maximum total value in the knapsack.
double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
// code here
List<Item> items = new ArrayList<>() ;
for(int i =0 ;i<val.size() ;i++)
{
items.add(new Item(val.get(i) , wt.get(i)));
}
Collections.sort(items , new ItemComp()) ;

int i =0 ;
int n = items.size() ;
double ans = 0;
while(i<n && capacity > 0)
{
if (capacity >= items.get(i).wt)
{
ans+= items.get(i).val ;
capacity -= items.get(i).wt;
}
else
{
double temp = items.get(i).ratio*capacity ;
ans +=temp ;
capacity = 0 ;
}

i++ ;
}

return ans ;


}
}