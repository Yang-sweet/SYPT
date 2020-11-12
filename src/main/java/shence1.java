import java.util.Scanner;
import java.util.Stack;

public class shence1 {
    //字符串删除重复空格 并翻转 输入 abc   bca  输出cba acb
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        String res="";
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==' '&&str.charAt(i+1)==' '){
//                continue;
//            }
//            res+=str.charAt(i);
//
//        }
//        System.out.println("res="+res);
//        char[] ch=res.toCharArray();
//        Stack<Character> st=new Stack<Character>();
//        int[] result=new int[ch.length];
//        int j=0;
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]!=' '){
//                //st.add(ch[i]);
//                st.push(ch[i]);
//
//            }else {
//                while (!st.isEmpty()){
//                    result[j++]=st.pop();
//                }
//            }
//        }
//        for(int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }

    //}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(shence3(str));

    }
    public static String shence3(String s){
        s =s.replaceAll(" +", " ");
        System.out.println(s);
        String[] split = s.split(" ");
        s = "";
        for(String str:split){
            int strLen = str.length();
            for(int i=1;i<=strLen;i++){
                s+=str.charAt(strLen-i);
            }
            s+=" ";
        }
        return s;
    }

}
