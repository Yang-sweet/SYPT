import java.util.Scanner;
public class Test2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        StringBuffer st1=new StringBuffer();
        int f;
        for(int i=0;i<str.length();i++){
            f=0;
            if(str.charAt(i)!='_'){
            st1.append(str.charAt(i));}
            else{
                f=1;
            }

             try {
                 if(str.charAt(i)=='_'&&str.charAt(i+1)!='_'){
                     st1.append('_');

                 }

             }catch (Exception e){
                 continue;
             }



            }
        System.out.println(st1);
        }
    }
