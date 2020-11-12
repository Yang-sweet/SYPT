import java.util.Scanner;

public class meituan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(num(n,m,k,a));
    }
    public static int num(int n,int m,int k,int[] a){
        int count=0;

        if(a==null||m==0||n==0)
            return 0;
        for(int i=0;i<n-1;i++){
            if(a[i]>=k&&a[i+1]>=k){
                count++;
                System.out.println(count);
            }
            else if(a[i]>k){
                i=i+2;
                System.out.println(count);
            }
            System.out.println(count);

        }

//        for(int i=0;i<n;i++){
//            boolean t=true;
//            for (int j=i;j<m;j++){
//
//                if(a[j]>=k&&a[j+1]>=k){
//                    t=t&&true;
//
//                }else {
//                    t=false;
//                }
//
//            }
//            if(t==true){
//                count++;
//            }
//            System.out.println(count);
//        }
        return count;
    }
}
