import java.util.*;
public class paintthreehousesmincost{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //no of houses

        int red[]=new int[n];
        int green[]=new int[n];
        int blue[]=new int[n];

        for(int i=0;i<n;i++)
        {
            red[i]=sc.nextInt();
            green[i]=sc.nextInt();
            blue[i]=sc.nextInt();
        }
        System.out.println(mincost(red,green,blue,n));
        
    }
    static int mincost(int red[],int green[],int blue[],int n)
    {
        for(int i=1;i<n;i++)
        {
            red[i] = red[i] + Math.min( green[i-1] , blue[i-1] );
            green[i] = green[i] + Math.min( red[i-1] , blue[i-1] );
            blue[i] = blue[i] + Math.min( red[i-1] , green[i-1] );
        }
        return Math.min( red[n-1] , Math.min( green[n-1] , blue[n-1] ));
    }
    
}
