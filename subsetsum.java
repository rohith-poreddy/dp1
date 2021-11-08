import java.util.*;
public class subsetsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
        int tar=sc.nextInt();
        System.out.print(isSubset(a,n,tar));
    }
    static boolean isSubset(int a[],int  n,int tar)
    {
        boolean dp[][]=new boolean[n+1][tar+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=tar;j++)
            {
                if(i==0&&j==0)
                dp[i][j]=true;
                else if(i==0)
                dp[i][j]=false;
                else if(j==0)
                dp[i][j]=true;
                else
                {
                    dp[i][j]=dp[i-1][j];
                    if(j-a[i-1]>=0)
                    dp[i][j]=dp[i][j]||dp[i-1][j-a[i-1]];
                }
            }
        }
        return dp[n][tar];
    }
    
}
