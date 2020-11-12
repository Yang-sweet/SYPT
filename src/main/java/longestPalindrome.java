public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println( l("ababab"));
    }
    public static String l(String s){
        String res="";
        int max=0;
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                dp[j][i]=s.charAt(i)==s.charAt(j)&&(i-j<=2||dp[j+1][i-1]);
                if(dp[j][i]){
                    if(i-j+1>max){
                        max=i-j+1;
                        res=s.substring(j,i+1);
                    }
                }
            }

        }
        return res;


    }
}
