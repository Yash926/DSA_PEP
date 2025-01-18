public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int j = arr.length -1 ;
        int i=0;
        while (j > i)
        {
        // swap
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
        i++ ;
        j-- ;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
     }
}
