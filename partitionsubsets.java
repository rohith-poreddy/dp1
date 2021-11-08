
import java.util.*;
public class partitionsubsets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        int k=sc.nextInt();
        System.out.println(ways1(n,k));
        sc.close();
    }
    static int ways(int n,int k)
    {
       if(n==0||k==0||n<k)
       return 0;
       if(n==k)
       return 1;
       int dp[][]=new int[n+1][k+1];
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=Math.min(i,k);j++)
           {
               if(i==j)
               dp[i][j]=1;
               else
               dp[i][j]=j*dp[i-1][j]+dp[i-1][j-1];
           }
       }
    return dp[n][k];
    }
    static int ways1(int n,int k)
    {
       if(n==0||k==0||n<k)
       return 0;
       if(n==k)
       return 1;
       int dp[][]=new int[2][k+1];
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=Math.min(i,k);j++)
           {
               if(i==j)
               dp[i%2][j]=1;
               else
               dp[i%2][j]=j*dp[1-i%2][j]+dp[1-i%2][j-1];
           }
       }
    return dp[n%2][k];
    }
    
    
}
