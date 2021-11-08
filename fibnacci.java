import java.util.*;
public class fibnacci{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int fibn=fibnaccidp(n);
     System.out.println(fibn);
 }
 static int fibnaccirecursion(int n)
 {
     if(n==1 || n==0)
     return n;

     int fib1=fibnaccirecursion(n-1);
     int fib2=fibnaccirecursion(n-2);

     return fib1+fib2;
 }
 static int fibnaccimem(int n,int a[])
 {
     if(n==1 || n==0)
     return n;

     if(a[n]!=0)
     return a[n];

     int fib1=fibnaccimem(n-1,a);
     int fib2=fibnaccimem(n-2,a);
     a[n]=fib1+fib2;

     return fib1+fib2;
 }
 static int fibnaccidp(int n)
 {
     int dp[]=new int[n+1];
     dp[0]=0;
     dp[1]=1;
     for(int i=2;i<=n;i++)
     dp[i]=dp[i-1]+dp[i-2];

     return dp[n];
}

}