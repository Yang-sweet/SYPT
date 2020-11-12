import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//
//public class sum3 {
//    public static void main(String[] args) {
//        int[] a=new int[]{-1,1,9,2,0,6,-4,-3};
//        System.out.println(sum(a));
//    }
//    public static List<List<Integer>> sum(int[] a){
//        Arrays.sort(a);
//        List<List<Integer>> lists=new ArrayList<>();
//        List<Integer> list=new ArrayList<Integer>();
//
//        for(int i=0;i<a.length;i++){
//            int cuur=a[i];
//            int l=i+1;
//            int r=a.length-1;
//
//            while(l<r) {
//                int sum=cuur+a[l]+a[r];
//                if (sum == 0) {
//                    list.add(cuur);
//                    list.add(a[l]);
//                    list.add(a[r]);
//                    lists.add(list);
//                    while(l<  r&& a[l+1] == a[l]) ++l;
//                    while (l < r && a[r-1] == a[r]) --r;
//                    l++;
//                    r--;
//                } else if (sum < 0) {
//                    l++;
//                } else if (sum > 0) {
//                    r--;
//                }
//            }
//        }
//        return lists;
//
//
//
//
//
//    }
//}

public class sum3{



    public static void main(String[] args) {
        int[] nums=new int[]{-1,1,9,2,0,6,-4,-3};
        threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for(int i = 0;i < len;++i) {
            if(nums[i] > 0) return lists;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int curr = nums[i];
            int L = i+1, R = len-1;
            while (L < R) {
                int tmp = curr + nums[L] + nums[R];
                if(tmp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while(L < R && nums[L+1] == nums[L]) ++L;
                    while (L < R && nums[R-1] == nums[R]) --R;
                    ++L;
                    --R;
                } else if(tmp < 0) {
                    ++L;
                } else {
                    --R;
                }
            }
        }
        return lists;
    }

}
