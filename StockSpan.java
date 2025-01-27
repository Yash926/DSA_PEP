// class Pair
// {
// int val ;
// int index ;

// Pair(int val , int index)
// {
// this.val = val ;
// this.index = index ;
// }
// }
// public class Main {
// public static void main(String[] args) {
// //pge
// int arr [] = {100 , 80 , 60 , 70 , 60 , 75 , 85} ;
// ArrayList<Integer> ans = new ArrayList<>() ;
// Stack<Pair> st = new Stack<>() ;
// for(int i =0 ;i<arr.length ;i++)
// {
// while (!st.isEmpty() && st.peek().val < arr[i])
// {
// st.pop() ;
// }
// if(st.isEmpty())
// {
// ans.add(1) ;
// }
// else
// {
// ans.add(i - st.peek().index) ;
// }

// st.push(new Pair(arr[i] , i));

// }

// System.out.println(ans) ;
// }
// }





// class Pair
// {
// int val ;
// int index ;

// Pair(int val , int index)
// {
// this.val = val ;
// this.index = index ;
// }
// }
// class StockSpanner {
// Stack<Pair> st ;
// int index ;
// public StockSpanner() {
// st = new Stack<>() ;
// index = 0 ;
// }
// public int next(int price) {
// // pge
// // i - pge index ;
// int ans = 1;
// while(!st.isEmpty() && st.peek().val <= price)
// {
// st.pop() ;
// }
// if(st.isEmpty())
// {
// ans = this.index +1 ;
// }
// else
// {
// ans = index - st.peek().index ;
// }

// st.push(new Pair(price, index)) ;
// index++;
// return ans ;

// }

// }


// /**
// * Your StockSpanner object will be instantiated and called as such:
// * StockSpanner obj = new StockSpanner();
// * int param_1 = obj.next(price);
// */