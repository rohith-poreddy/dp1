import java.util.*;
public class knapsack01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int wt[]=new int[n];
        for(int i=0;i<n;i++)
        wt[i]=sc.nextInt();

        int val[]=new int[n];
        for(int i=0;i<n;i++)
        val[i]=sc.nextInt();

        int tarwt=sc.nextInt();

        int ans=fun01(n,wt,val,tarwt);
        System.out.print(ans);


    }
    static int fun01(int n,int wt[],int val[],int tarwt)
    {
       int dp[][]=new int[n+1][tarwt+1];
       for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=tarwt;j++)
           {
               if(i==0||j==0)
               dp[i][j]=0;
               else{
                   dp[i][j]=dp[i-1][j];
                   if(j-wt[i-1]>=0)
                   {
                       dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-wt[i-1]]+val[i-1]);
                   }
               }
           }
       }
       int res=dp[n][tarwt];
       int wet=tarwt;
       for(int i=n-1;i>0;i--)
       {
           if(res==dp[i][wet])
           continue;
           else
           {
               System.out.println(wt[i]);
               wet=wet-wt[i];
               res=res-val[i];
           }
       }
       return dp[n][tarwt];
      

    }
    static int fun01_spaceoptimized(int n,int wt[],int val[],int tarwt)
    {
       int dp[][]=new int[2][tarwt+1];
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=tarwt;j++)
           {
                dp[i%2][j]=dp[(i-1)%2][j];
                if(j-wt[i-1]>=0)
                    dp[i%2][j]=Math.max(dp[i%2][j],dp[(i-1)%2][j-wt[i-1]]+val[i-1]);
           }
       }
       return dp[n%2][tarwt];

    }

    

    static int unboundedknapsack(int n,int wt[],int val[],int tarwt)
    {
       int dp[]=new int[tarwt+1];
       dp[0]=0;
       for(int i=1;i<=tarwt;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(wt[j]<=i)
               {
                   dp[i]=Math.max(dp[i],dp[i-wt[j]]+val[j]);
               }
           }

       }
       
       return dp[tarwt];

    }

    
}
