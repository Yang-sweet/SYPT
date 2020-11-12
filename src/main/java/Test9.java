import java.math.BigDecimal;
import java.util.Scanner;

public class Test9 {
    public int GetFragment (String str) {
        char temp;
        double n=1.0;
        double avg=0.0;
        temp=str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(temp!=str.charAt(i)){
                n++;
            }
            temp=str.charAt(i);
        }
        avg=(double)(str.length()/n);
        BigDecimal b=new BigDecimal(avg);


return 0;
        // write code here
    }
}
