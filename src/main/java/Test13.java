import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test13 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                String target = scanner.nextLine(), line = scanner.nextLine(), rep = scanner.nextLine();
                HashMap<Character, Integer> map = new HashMap<>(64), temp = new HashMap<>(64);

                for (int i=0; i<target.length(); i++) {
                    char ch = target.charAt(i);
                    map.put(ch, map.getOrDefault(ch, 0)+1);
                }
                char[] array = line.toCharArray();
                StringBuilder sb = new StringBuilder();
                for (int i=0; i<array.length; ) {
                    if (!isLetter(array[i])) {
                        sb.append(array[i]);
                        i++;
                    } else {
                        int remain = target.length();
                        temp.clear();
                        temp.putAll(map);
                        int j;
                        for (j=i; remain > 0 && j<array.length && isLetter(array[j]); remain--, j++) {
                            char c = array[j];
                            if (temp.get(c) == null || c == 0)
                                break;
                            temp.put(c, map.get(c)-1);
                        }
                        if (remain == 0 && (j == array.length || !isLetter(array[j]))) {
                            sb.append(rep);
                            i = j;
                        } else {
                            for (; i<array.length && isLetter(array[i]); i++) {
                                sb.append(array[i]);
                            }
                        }
                    }
                }
                System.out.println(sb.toString());
            }
        }

        public static boolean isLetter(char c) {
            return c>='a' && c<='z';
        }











    public static String R(String a,String b,String c){
        ArrayList<String> list=new ArrayList<String>();
        char[] pStr=a.toCharArray();
        int len=pStr.length;



        int n=1<<len;
//        for(int i=0;i<n;++i){
//            int t;
//            for(int j=0;j<len;j++){
//                t=1<<j;
//                if((t&i)!=0){
//                    System.out.println(pStr[j]);
//                }
//            }
//        }
//
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
            char temp=pStr[i];
            pStr[i]=pStr[j];
            pStr[j]=temp;
        }
        }


        String str=new String();
        str=b.replaceAll(a,c);


        return str;
    }
}
