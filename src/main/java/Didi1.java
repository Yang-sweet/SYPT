import java.util.Scanner;

public class Didi1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(reverse(s));
        //System.out.println(getstr(n,s));
    }


    public static String getstr(int a,String s){
        if(a==0)
            return "";
        if(s==null)
            return "";
        int left=0;
        String[] st=new String[s.length()/2+1];
        String[] st1=new String[s.length()/2+1];


        for(int i=0;i<s.length()-1;){
            int j=0;
            st[j++]=s.substring(i,a);
            i=i+a;
            }
        for(int i=0;i<st.length;i++){

            st1[i]=reverse(st[i]);
        }
        return st.toString();

        }

    public static String reverse(String s){
        int l=s.length();
        char[] array=s.toCharArray();
        for(int i=0;i<l/2;i++){
            array[i]=s.charAt(l-1-i);
            array[l-1-i]=s.charAt(i);
        }
        return new String(array);
    }



    }

