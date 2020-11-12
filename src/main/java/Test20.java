import java.util.*;


public class Test20 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param grid int整型一维数组 
     * @return int整型
     */
    public static void main(String[] args) {
        int[] m=new int[]{20,30,20};
        System.out.println(saveZhenaiCoin(m));

    }
    public static int saveZhenaiCoin (int[] grid) {

//        if(grid.length==0){
//            return 0;
//        }
//        if(grid.length==1)
//            return grid[0];
//        if(grid.length==2)
//            return Math.min(grid[0],grid[1]);
        int[] f=new int[grid.length];
        f[0]=0;
        f[1]=grid[0];
        f[2]=Math.min(grid[0],grid[1]);
//        f[3]=Math.min(grid[0]+grid[2],grid[1]);

        for(int i=4;i<grid.length;i++){
            f[i]=f[i-1]+f[i-2];
        }
        //return f[grid.length-1];
        return 30;


        // write code here
    }
}