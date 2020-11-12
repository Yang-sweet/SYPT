import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Scanner;

public class jinshanyun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        res(n);
    }
    public static void res(int n){

        System.out.println(1);

        for(int i=2;i<=n;i++){
            fei(i);
        }

    }


    public static void   fei(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        //StringBuffer sb=new StringBuffer();
        ar.add(f1);
        ar.add(f2);
//        if (n == 2) {
//            System.out.println(ar);
//        } else{

            for (int i = 0; i < n - 2; i++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
                ar.add(f3);
            }
        for (int j = ar.size() - 2; j >= 0; j--) {
            ar.add(ar.get(j));
        }

        System.out.println(ar.toString().replaceAll("(?:\\[|null|\\]| +)",""));
    }


//
//        StringBuffer sb1=new StringBuffer();
//        sb1=sb;
//        //System.out.println(sb1.reverse());
//        sb.append(sb1.reverse());
//        System.out.println(sb);

    }
//}
