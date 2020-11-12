import java.util.*;


public class test18{
    /**
     *
     * @param num int整型 相加的数字
     * @param itemNum int整型 相加项数
     * @return long长整型
     */
    public static void main(String[] args) {
        System.out.println(sum(3,5));;
    }
    public static long sum (int num, int itemNum) {
        // write code here
        long sum=0;
        String str="";
        for(int i=1;i<=itemNum;i++){
            if(i==1){
                sum=num;
                str+=num+"+";
            }
            else{
                String s="";
                for(int j=1;j<=i;j++){
                    s+=num;
                }
                sum+=Long.parseLong(s);
                str+=s+"+";
            }

        }
        str=str.substring(0,str.length()-1);

        return sum;

    }
}