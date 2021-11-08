import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int c[]=new int[1000001];
        for(int i=1;i<=1000000;i++)
        {
            if(i%2==0)
            c[i]=c[i-1];
            else
            {
            int k=(fun1(i))==true?1:0;
            c[i]=c[i-1]+k;
            }
        }
        // for(int i=0;i<10;i++)
        // System.out.println(c[i]);

        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());

            int out_ = c[n];
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static boolean fun1(int n)
    {
      String s=Integer.toString(n);
      int k=s.length();
      for(int i=0;i<k/2;i++)
      {
          if(s.charAt(i)!=s.charAt(k-i-1))
          return false;
      }
      String bs=Integer.toBinaryString(n);
      k=bs.length();
      for(int i=0;i<k/2;i++)
      {
          if(bs.charAt(i)!=bs.charAt(k-i-1))
          return false;
      }
      return true;
    }

    
}