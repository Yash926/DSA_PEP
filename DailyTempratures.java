// import java.util.*;
// class Solution {
// public int[] dailyTemperatures(int[] temperatures) {
// Stack<Integer> st = new Stack<>();
// int length=temperatures.length;
// int[] ans=new int[length];
// for(int i=0;i<temperatures.length;i++){
// while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
// int previndex= st.pop();
// ans[previndex]=i-previndex;
// }
// st.push(i);

// }
// return ans;
// }
// }

// ab
// Abhijit
// 11:49 AM
// class Pair
// {
// int temp ;
// int index;

// Pair(int temp , int index)
// {
// this.temp = temp;
// this.index = index ;
// }
// }
// class Solution {
// public int[] dailyTemperatures(int[] temperatures) {
// ArrayList<Integer> ans = new ArrayList<>() ;
// Stack<Pair> st = new Stack<>() ;

// for(int i =temperatures.length -1 ;i >=0 ;i--)
// {

// while (!st.isEmpty() && st.peek().temp <= temperatures[i])
// {
// st.pop() ;
// }
// if(st.isEmpty())
// {
// ans.add(0);
// }
// else
// {
// ans.add(st.peek().index - i);
// }
// st.push(new Pair(temperatures[i] , i)) ;
// }

// Collections.reverse(ans);
// int [] array = new int[ans.size()];

// for(int i = 0 ; i<ans.size() ;i++)
// {
// array[i] = ans.get(i) ;
// }

// return array ;

// }
// }