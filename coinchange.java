import java.util.*;
public class coinchange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++)
          coins[i]=sc.nextInt();
        int tar=sc.nextInt();
        int noways=numberofcombinations(coins,n,tar);
        int nopers=numberofpermutations(coins,n,tar);
        System.out.println(noways+" "+nopers);
    }
    static int numberofcombinations(int coins[],int n,int tar)
    {
        int dp[]=new int[tar+1];
        dp[0]=1;
        for(int i=0;i<n;i++)//for(int coin:coins)
        {
            for(int j=coins[i];j<=tar;j++)//for(int j=coin;j<=tar;j++)
            {
               dp[j]+=dp[j-coins[i]];//dp[j]+=dp[j-coin];
            }
        }
        return dp[tar];

    }
    static int numberofpermutations(int coins[],int n,int tar)
    {
        int dp[]=new int[tar+1];
        dp[0]=1;
        for(int amt=1;amt<=tar;amt++)
        {
            for(int coin:coins)
            {
              if(coin<=amt)
              {
                  int ramt=amt-coin;
                  dp[amt]+=dp[ramt];
              }
            }
        }
        return dp[tar];
    }
    
}
