import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class meituan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();

            }
        }
        min(a,n,m);
    }
    public  static int[][] min(int[][] a,int n,int m){
        while (n/2!=1){
            n=n/2;
        }
        int[][] res=new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=a[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();

        }
        return res;


    }
}
