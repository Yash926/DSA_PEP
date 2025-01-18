public class MovingZeroes{
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                arr[i]=arr[j];
                i++;
            }
        }
        for(int x=i;x<arr.length;x++)
        {
            arr[x]=0;
        }
        for (int n:arr)
        {
            System.out.print(n+" ");
        }
    }
}