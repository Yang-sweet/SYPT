import java.util.Scanner;
import java.util.Stack;

public class banyu3 {
    public static void main(String[] args) {
        String s="()))";
        num(s);

    }
    public static int num(String s){
        char[] ch=s.toCharArray();
        Stack<Character> st=new Stack<Character>();
        int num=0;
        for(int i=0;i<ch.length;i++) {
            while (!st.isEmpty()) {
                if (ch[i] == '(') {
                    st.push(ch[i]);
                } else if (ch[i] == ')' && ch[i + 1] == ')'&&st.peek() == '(') {
                    st.pop();
                    i += 1;

                }else {
                        num = num + 1;
                    }
                }


            }

        return num;
    }
}
