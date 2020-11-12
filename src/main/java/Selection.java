public class Selection {
    /*
    选择排序

     */
    public static void sort(int[] a){
        //int min=0; //最小值的索引
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){

                if(a[min]>a[j]){
                     min=j;
                }else {
                    break;
                }
            }
            System.out.println(a[min]);
            swap(a,i,min);

        }


    }
    /*
    比较v是否大于w
 */
//    public static boolean compare(int v,int w){
//        if(v<w){
//            swap(a,v,w);
//        }
//
//    }
    /*
    交换
 */
    public static void swap(int[] a,int i,int j){
        int temp;
        temp=i;
        i=j;
        j=temp;
    }

    public static void main(String[] args) {
        int[] a={1,5,7,3,4,9};
        Selection.sort(a);
        for (int i=0;i<a.length;i++){

            System.out.println(a[i]);

        }

    }

}
