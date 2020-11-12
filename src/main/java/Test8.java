public class Test8 {
    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(SpiralMatrix(a));
    }

    public static int[] SpiralMatrix (int[][] matrix) {
        int[] reuslt=new int[matrix.length*matrix[0].length];

        if(matrix.length==0)
            return new int[]{};

        int top=0;
        int down=matrix.length-1;
        int dindex=0;
        int right=matrix[0].length-1;
        int[] move=new int[]{0,1};
        int index=0;
        int count=matrix.length*matrix[0].length;
        int r=0;
        int c=0;
        while (count>0){
            reuslt[index++]=matrix[r][c];
            count--;

            if(r==top&&c==right&&move[1]==1){
                move[0]=1;
                move[1]=0;
                top++;

            }else if(r==down&&c==right&&move[0]==1){
                move[0]=0;
                move[1]=-1;
                right--;
            }else if(r==down&&c==dindex&&move[1]==-1){
                move[0]=-1;
                move[1]=0;
                down--;
            }else if(r==top&&c==dindex&&move[0]==-1){
                move[0]=0;
                move[1]=1;
                dindex++;
            }
            r+=move[0];
            c+=move[1];
        }
        return reuslt;

        }





        // write code here
    }

