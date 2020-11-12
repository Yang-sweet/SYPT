import java.util.Scanner;

public class shence4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(res(str));
    }

    public static String res(String str) {
        str.replaceAll(" +", " ");
        System.out.println(str);
        String[] s = str.split(" ");
        String r = "";
//        for(String st:s){
//            for(int i=1;i<=st.length();i++){
//                r+=st.charAt(st.length()-i);
//            }
//            r+=" ";
//        }
        for (int i = 1; i < s.length; i++) {
            for (int j = 1; j <= s[i].length(); j++) {
                r += s[i].charAt(s.length - i);
            }
            r += " ";

//        }

        }
        return r;
    }
}
