import java.util.*;
public class goldmine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=1 ; i < m ; i++)
        {
            for(int j=0 ; j < n ; j++)
            {
                int up = j-1 >= 0 ? a[j-1][i-1] : 0;
                int lvl = a[j][i-1];
                int down = j+1 < n ? a[j+1][i-1] : 0;

                a[j][i]+=Math.max(up,Math.max(lvl,down));
            }
        }
        int max=a[0][m-1];
        for(int i=1;i<n;i++)
        {
            if(max<a[i][m-1])
            max=a[i][m-1];
        }
        System.out.print(max);
    }
    
}
