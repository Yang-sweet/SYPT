public class weiju2 {
    public static int couples (int month) {
        int i=1,j=0,x;
        if (month<3){
            return 1;
        }else if(month==3){
            return 2;
        }else {
            return couples(month-1)+couples(month+1);

//            for(int m=1;m<month;m++){
//                x=i;
//                i=i+j;
//                j=x;
//            }
//            System.out.println(i);
        }
        // write code here
    }

    public static void main(String[] args) {
        int n=6;
        couples(n);
    }
}
