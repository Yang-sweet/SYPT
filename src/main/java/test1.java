public class test1 {
    public static void main(String[] args) {
        int[] a={1,2,5};
        System.out.println(num(a));;
    }


    public static int num(int[] a){
        int sum=0;
        int avg=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];

        }
        avg=sum/a.length;

        for(int i=0;i<a.length;i++){
            if(a[i]!=avg){
                count+=Math.abs((a[i]-avg));
            }

        }

        return count;
    }
}
