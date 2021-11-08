import java.util.*;
public class noofwaysofcoloringnotmorethan2adjacent{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //no of houses
        int k=sc.nextInt();  //no of colors
        System.out.println(ways(n,k));
        
    }
    static int ways(int n,int k)
    {
       int ii=k;
       int ij=k*(k-1);
       int total=ii+ij;
       for(int i=3;i<=+n;i++)
       {
           ii=ij;
           ij=total*(k-1);
           total=ii+ij;
       }
       return total;
    }
    
    
}
