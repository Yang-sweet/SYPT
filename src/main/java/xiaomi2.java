import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;

import java.util.Scanner;

public class xiaomi2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(sx(str));
    }
    private static String sx(String str){
        if(str==null)
            return "";
        char[] s=str.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length;){
            char c=s[i];
            //sb.append(s[i]);
            //i++;
            while (S(sb.toString(),c)){
                sb.append(s[i]);
            }
//            while (i<s.length&&s[i]==c){
//                i++;
//            }
            i++;
        }
        return sb.toString();


    }
    public static Boolean S(String s, char c){
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]==c)
                return false;
        }
        return true;

    }
}




//
//import java.util.Scanner;

//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        System.out.println(sx(str));
//    }
//    private static String sx(String str){
//        if(str==null)
//            return "";
//        char[] s=str.toCharArray();
//        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<s.length;){
//            char c=s[i];
//            sb.append(s[i]);
//            i++;
//            while (i<s.length&&s[i]==c){
//                i++;
//            }
//        }
//        return sb.toString();
//
//
//    }
//}
