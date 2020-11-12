public class Insertion {
    /*
    直接排序
     */
    public static void sort(int[] a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                //比较索引j j-1处的值
                if(a[j]<a[j-1]){
                    swap(a,a[j-1],a[j]);
                }else {
                    break;
                }
            }
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
        Insertion.sort(a);
        System.out.println(a);
    }

}
