public class TEST19 {
    public static void main(String[] args) {
        System.out.println(getsum(3,3));
    }

    public static long getsum(int m,int n) {
        int sum=0;
        int t=0;
        for(int i=0;i<n;i++){
            sum+=m;
            m=m*10;
            t=t+sum;
        }
        return t;
    }
}
