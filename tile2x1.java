import java.util.*;
public class tile2x1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        System.out.println(ways(n));
        sc.close();
    }
    static int ways(int n)
    {
       int dp[]=new int[n+1];
       dp[1]=1;
       dp[2]=2;
       for(int i=3;i<=n;i++)
       dp[i]=dp[i-1]+dp[i-2];
       return dp[n];
    }
    
    
}
