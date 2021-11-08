import java.util.*;
public class nosubsequenceabc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(noways(s));
    }
    static int noways(String s)
    {
        int n=s.length();
        int a=0;
        int ab=0;
        int abc=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a')
            a=2*a+1;
            else if(s.charAt(i)=='b')
            ab=2*ab+a;
            else
            abc=2*abc+ab;
        }
        return abc;
    }
    
}
