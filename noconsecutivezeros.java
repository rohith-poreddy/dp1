import java.util.*;
public class noconsecutivezeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(notwozeros_spaceoptimized(n));
    }
    static int notwozeros(int  n)
    {
        int dp0[]=new int[n+1];
        int dp1[]=new int[n+1];
        dp1[1]=1;
        dp0[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp1[i]=dp1[i-1]+dp0[i-1];
            dp0[i]=dp1[i-1];
        }
        return dp0[n]+dp1[n];
    }
    static int notwozeros_spaceoptimized(int  n) 
    {
        int count_0s=1,count_1s=1;
        for(int i=2;i<=n;i++)
        {
           int  newcount_1s=count_1s+count_0s;
           count_0s=count_1s;
           count_1s=newcount_1s;

        }
        return count_0s+count_1s;
    }
    
}
