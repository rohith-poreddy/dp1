import java.util.*;
public class maxnonadjsum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(maxsum(a,n));
        
    }
    static int maxsum(int dp1[],int n)
    {
        int dp2[]=new int[n];
        dp2[0]=0;
        for(int i=1;i<n;i++)
        {
            dp1[i]=dp1[i]+dp2[i-1];
            dp2[i]=Math.max(dp2[i-1],dp1[i-1]);
        }
        return Math.max(dp2[n-1], dp1[n-1]);
    }
    
}
