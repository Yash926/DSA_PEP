public class Main {
static int helper(int [] val , int [] wt , int c , int n , int [][] dp)
{
if(n == 0 || c == 0)
{
return 0;
}

if(dp[c][n] != -1)
{
return dp[c][n];
}

if(wt[n-1] > c)
{
// exclude
dp[c][n] = helper(val , wt , c , n-1 , dp) ;
return dp[c][n] ;
}
else
{
int include = val[n-1] + helper(val , wt , c - wt[n-1] , n-1 , dp) ;
int exclude = helper(val , wt , c , n-1 , dp) ;
dp[c][n] = Math.max(include , exclude) ;
return dp[c][n] ;
}
}
public static void main(String[] args) {
int val []= {1 ,2 ,3} ;
int wt [] = {4 , 5 , 1} ;
int c = 4 ;
int n = wt.length;
int dp[][] = new int[c+1][n+1] ;
for(int i= 0 ;i<c+1 ;i++)
{
for(int j =0 ;j<n+1 ;j++)
{
dp[i][j] =-1 ;
}
}
int ans = helper(val , wt , c , wt.length ,dp);
System.out.println(ans) ;

}
}

//unbounded knapsack

public class Main {
    static int helper(int [] val , int [] wt , int c , int n , int [][] dp)
    {
    if(n == 0 || c == 0)
    {
    return 0;
    }
    
    if(dp[c][n] != -1)
    {
    return dp[c][n];
    }
    
    if(wt[n-1] > c)
    {
    // exclude
    dp[c][n] = helper(val , wt , c , n-1 , dp) ;
    return dp[c][n] ;
    }
    else
    {
    int include = val[n-1] + helper(val , wt , c - wt[n-1] , n , dp) ;
    int exclude = helper(val , wt , c , n-1 , dp) ;
    dp[c][n] = Math.max(include , exclude) ;
    return dp[c][n] ;
    }
    }
    public static void main(String[] args) {
    int val []= {1 ,2 ,3} ;
    int wt [] = {4 , 5 , 1} ;
    int c = 4 ;
    int n = wt.length;
    int dp[][] = new int[c+1][n+1] ;
    for(int i= 0 ;i<c+1 ;i++)
    {
    for(int j =0 ;j<n+1 ;j++)
    {
    dp[i][j] =-1 ;
    }
    }
    int ans = helper(val , wt , c , wt.length ,dp);
    System.out.println(ans) ;
    
    }
    }