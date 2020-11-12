import java.util.Scanner;

public class meituan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int d=sc.nextInt();

        System.out.println(num(n,k,d));

    }
    public static  int f(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        else
            return f(n-1)+1;

    }
    public static int num(int n,int k,int d){

        if(n==0){
            return 0;
        }
        return  f(n);

    }


}
