import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a=0;
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arrays = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                arrays[i][j] = sc.nextInt();
            }
        int result = getMaxValue(arrays);
        System.out.print(result);
    }

        public static int getMaxValue (int[][] array){

//            if (array == null || array.length == 0 || array[0].length == 0) {
//                return -1;
//            }

            int row = array.length;
            int col = array[0].length;
            int[][] Max = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    int a = 0;
                    int b = 0;
                    if (i > 0)
                        a = Max[i - 1][j];
                    if (j > 0)
                        b = Max[i][j - 1];
                    Max[i][j] = array[i][j] + Math.max(a, b);

                }

            }
            return Max[row - 1][col - 1];
            //return Max[row - 1][col - 1];
        }

        //return Max[row - 1][col - 1];
    }
