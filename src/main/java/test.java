import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums=new int[n+1];
        for(int i=1;i<=n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            int op=sc.nextInt();
            int x=sc.nextInt();
            if(op==1){
                int left=2*x;
                if(left>n){
                    continue;
                }
                int right=2*x+1;
                int[] t={nums[x],nums[left],nums[right]};
                Arrays.sort(t);
                nums[x]=t[2];
                nums[left]=t[1];
                nums[right]=t[0];
            }else{
                int f=1;
                while(--x>0){
                    f*=2;
                }
                for(int j=f;j<2*f&&j<=n;j++){
                    System.out.println(nums[j]);
                }
            }

        }


    }
}