import java.util.*;
public class climbstairs{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int cp=countpathdp(n);
     System.out.println(cp);
 }
 static int countpathrecursion(int n)
 {
     if(n==1 || n==0 ||n==2)
     return n;

     int cp1=countpathrecursion(n-1);
     int cp2=countpathrecursion(n-2);
     int cp3=countpathrecursion(n-3);
     int cn=cp1+cp2+cp3;

     return cn;
 }
 static int countpathmm(int n,int a[])
 {
     if(n==1 || n==0 || n==2)
     return n;

     if(a[n]!=0)
     return a[n];

     int cp1=countpathmm(n-1,a);
     int cp2=countpathmm(n-2,a);
     int cp3=countpathmm(n-3,a); 
     int cn=cp1+cp2+cp3;
     a[n]=cn;

     return cn;
 }
 static int countpathdp(int n)
 {
     int dp[]=new int[n+1];
     dp[0]=0;
     dp[1]=1;
     dp[2]=2;
     for(int i=3;i<=n;i++)
     dp[i]=dp[i-1]+dp[i-2]+dp[i-3];

     return dp[n];
}

}