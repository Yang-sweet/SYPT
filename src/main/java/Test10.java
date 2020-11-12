public class Test10 {
    public static void main(String[] args) {
        int a=9,b=3,c=3;
        System.out.println(numberofprize(a,b,c));
    }

    public static int numberofprize (int a, int b, int c) {
        int result=0;
        int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        int min=arr[0];
        int m=0;
        if(a!=0&b!=0&c!=0){
            for (int i=1;i<arr.length;i++){
                    if(arr[i]<min)
                        min=arr[i];
                System.out.println("arr[i]"+arr[i]);
                System.out.println("min="+min);
            }
            System.out.println(min);
            if((a-min)!=0&&(b-min)!=0){

                m=(a+b-min*2)/3;

            }else if((a-min)==0){

                 m=(b-min)/5;
            }else if((b-min)==0){

                 m=(a-min)/5;
            }


            result=min+m;
        }







        return result;



        // write code here
    }
}
