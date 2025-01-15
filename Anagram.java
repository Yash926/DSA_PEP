import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        // String s1 = "listen";
        // String s2 = "silent";
        // boolean isAnagram = true;
        // if(s1.length()!=s2.length())
        // {
        //     isAnagram=false;
        // }
        // else
        // {
        //     int[] arr = new int[256];
        //     for(int i=0;i<s1.length();i++)
        //     {
        //         arr[s1.charAt(i)]++;
        //         arr[s2.charAt(i)]--;
        //     }
        //     for(int i=0;i<256;i++)
        //     {
        //         if(arr[i]!=0)
        //         {
        //             isAnagram=false;
        //             break;
        //         }
        //     }
        // }
        // if(isAnagram)
        // {
        //     System.out.println("Anagram");
        // }
        // else
        // {
        //     System.out.println("Not Anagram");
        // }


         // String s1="listen";
        // String s3="silent";
        // char[] t=s1.toCharArray();
        // Arrays.sort(t);
        // String s2=new String(t);
        // System.out.println(s2);

        // char[] t1=s3.toCharArray();
        // Arrays.sort(t1);
        // String s4=new String(t1);
        // System.out.println(s4);


        // if(s2.equals(s4))
        // {
        //     System.out.println("Anagram");
        // }
        // else
        // {
        //     System.out.println("Not Anagram");
        // }  


        String s="anagram";
        String t="nagaram"; 
        if(s.length()!=t.length())
        {
            System.out.println("Not Anagram");
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        System.out.println(map1);
        System.out.println(map2);

        if(map1.equals(map2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }
}
