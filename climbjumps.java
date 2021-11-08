import java.util.*;
public class climbjumps{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
     }
     int ans=countjumpsdp(arr, n);
     System.out.println(ans);
     sc.close();
}
static int countjumpsrecursion(int arr[],int i,int n)
{
    if(i==n)
    return 1;
    int count=0;
    for(int idx=1;idx<=arr[i];idx++)
    {
      if(i+idx<=n)
      {
       count=count+countjumpsrecursion(arr, i+idx, n);
      }
    }
    return count;
}
static int countjumpsdp(int arr[],int n)
{
    int[] dp = new int[n + 1];
    dp[n] = 1;

    for (int i = n - 1; i >= 0; i--) 
    {
        for (int reach = i + 1; reach <= Math.min(n, i + arr[i]); reach++)
         {
          dp[i] += dp[reach];
         }
    }
    return dp[0];
}
static int mincountjumps(int arr[],int n)
{
    Integer[] dp = new Integer[n + 1];
    dp[n] = 0;
    for (int i = n - 1; i >= 0; i--) 
    {
        if(arr[i]==0)
        continue;
        int min=Integer.MAX_VALUE;
        for (int reach = i + 1; reach <= Math.min(n, i + arr[i]); reach++)
         {
             if(dp[reach]!=null)
             min =Math.min(min, dp[reach]);
         }
         if(min!=Integer.MAX_VALUE)
         dp[i]=min+1;
    }
    return dp[0];
}

}
