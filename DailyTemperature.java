// import java.util.*;

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int n = temperatures.length;
//         int[] res = new int[n]; // Store final results
//         Stack<Integer> st = new Stack<>(); // Stack stores indices

//         for (int i = n - 1; i >= 0; i--) {
//             // Pop elements from stack while stack is not empty and temperature is smaller
//             while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
//                 st.pop();
//             }

//             // If stack is not empty, find the difference between indices
//             if (!st.isEmpty()) {
//                 res[i] = st.peek() - i;
//             }

//             // Push the current index into the stack
//             st.push(i);
//         }

//         return res;
//     }
// }
