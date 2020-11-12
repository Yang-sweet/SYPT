public class Test7 {
    public static  void  main(String[] args){
        int[] a={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(GetMaxConsecutiveOnes(a,k));;

    }
    public static int GetMaxConsecutiveOnes (int[] arr, int k) {

        int left=0;
        int right=0;
        int count=0;
        int max=0;
        int result=0;
        while (right!=arr.length){
            if(arr[right]==0){
                count++;
            }
            while(count>k){
                if(arr[left++]==0){
                    --count;
                }
            }

             result=Math.max(result,right-left+1);
            right++;
//            //System.out.println(count);
//            int result=right-left;
//            //System.out.println(result);
//
//            max= max >result? max:count;
//            System.out.println(max);
        }
        return result;
    }
}
