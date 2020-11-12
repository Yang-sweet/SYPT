import java.util.Scanner;
import java.util.Stack;

public class xiaomi1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(isVal(str));

    }
    public static Boolean isVal(String str){
        if(str==null)
            return true;
        char[] ch=str.toCharArray();
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('||ch[i]=='{'||ch[i]=='['){
                stack.push(ch[i]);
            }else if(ch[i]==')'&&stack.peek()=='('){
                stack.pop();
            }else if(ch[i]==']'&&stack.peek()=='['){
                stack.pop();
            }else if(ch[i]=='}'&&stack.peek()=='{'){
                stack.pop();
            }else return false;
        }
        return true;


    }
}
