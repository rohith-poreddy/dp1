import java.util.*;
public class tilenxm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        int m=sc.nextInt();
        System.out.println(ways(n,m));
        sc.close();
    }
    static int ways(int n,int m)
    {
       int dp[]=new int[n+1];
       dp[1]=1;
       for(int i=2;i<=n;i++)
       {
           if(i<m)
             dp[i]=1;
           else if(i==m)
             dp[i]=2;
           else
             dp[i]=dp[i-1]+dp[i-m];
       }
       return dp[n];
    }
    
    
}
