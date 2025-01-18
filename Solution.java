// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character,Character> map=new HashMap<>();
//         HashMap<Character,Character> map1=new HashMap<>();
//         boolean ans=true;
//         for(int i=0;i<s.length();i++)
//         {
//             char x=s.charAt(i);
//             char y=t.charAt(i);
//             if(map.containsKey(x)&& map.get(x)!=y)
//             {
//                 ans=false;
//             }
//             if(map1.containsKey(y)&& map1.get(y)!=x)
//             {
//                 ans=false;
//             }
//             map.put(x,y);
//             map1.put(y,x);
//         }
//         return ans;
//     }
// }