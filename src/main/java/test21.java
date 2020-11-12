public class test21 {
    public static void main(String[] args) {
        int[] m=new int[]{0,0,0,2};
        int n=1;
        System.out.println(parking(m,n));
    }
    public static  boolean parking (int[] park, int n) {
        if(park.length==0||n==0)
            return false;
        // write code here
        boolean res;
        int count=0;
        int r=0;
//        for(int i=0;i<park.length;i++){
//            if(park[i]==0||park[i+1]==0){
//                count++;
//            }else count=0;
//        }
        String str=park.toString();
        String[] st=str.split("1");
        for(int i=0;i<st.length;i++){
            for(int j=0;j<st[i].length();j++){
            if(st[i].charAt(j)==0) {
                count++;
            }
        }
            if(count<3)
                r=0;
            if(count==3)
                r+=1;
            else r+=count/3+1;

            count=0;

        }
        if(r>=n)
            return true;
        else return false;

    }
}
