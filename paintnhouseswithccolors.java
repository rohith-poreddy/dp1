import java.util.*;
public class paintnhouseswithccolors{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //no of houses
        int c=sc.nextInt();  //no of colors
        int a[][]=new int[n][c];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }        
        System.out.println(mincost(a,n,c));
        
    }
    static int mincost(int dp[][],int n,int c)
    {
       int least=Integer.MAX_VALUE;
       int sleast=Integer.MAX_VALUE;
       for(int i=0;i<c;i++)
       {
           if(dp[0][i]<=least)
           {
               sleast=least;
               least=dp[0][i];
           }
           else if(dp[0][i]<=sleast)
           {
               sleast=dp[0][i];
           }
       }  // initail least and second least;
       
       for(int i=1;i<n;i++)
       {
           int n_least=Integer.MAX_VALUE;
           int n_sleast=Integer.MAX_VALUE;
           for(int j=0;j<c;j++)
           {
               if(dp[i-1][j]==least)
               {
                  dp[i][j]=dp[i][j]+sleast;
               }
               else
               {
                  dp[i][j]=dp[i][j]+least;
               }
               
               if(dp[i][j]<=n_least)
               {
                   n_sleast=n_least;
                   n_least=dp[i][j];
               }
               else if(dp[i][j]<=n_sleast)
               {
                   n_sleast=dp[0][i];
               }
           }
           least=n_least;
           sleast=n_sleast;

       }
       return least;
    }
    
    
}
