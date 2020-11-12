import java.util.HashMap;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Test16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] nums = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                int num = sc.nextInt();
                nums[i][j] = num;
            }
        }
        System.out.print(getHi(nums));
    }
    public static int getHi(int[][] nums){
        int min=nums[1][0];
        for(int i=0;i<3;i++){
            if(nums[1][i]<min){
                min=nums[1][i];
            }
        }
        int n=nums[0][1]*nums[0][2];
        int res=n+min;
        return res;

    }



}

