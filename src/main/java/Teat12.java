public class Teat12 {
    public static void main(String[] args) {
        int[] x=new int[]{-1,4,5,2};
        System.out.println(getHouses(2,x));
    }

    public static int getHouses (int t, int[] xa) {
        int left=0;
        int right=0;
        int n=0;
        int count=0;
        int[] b=new int[xa.length/2];
        for(int i=0;i<xa.length;){
            int j=i+1;
            left=xa[i]-xa[j]/2;
            b[i]=left;
            right=xa[i]+xa[j]/2;
            b[i+1]=right;
            n=b[i+1]-b[i];
            if(n>=t&&n<2*t){
                count++;

            }else if(n>2*t){
                count+=2;
            }
            i=i+2;



        }


        return count;


        // write code here
    }
}
