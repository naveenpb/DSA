package Strings;
import java.lang.StringBuilder;
public class INTV_Uppercase {


    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1 ;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                // gap sikmele ond mundke hogi , capital letter madi string ge haku.
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi i am naveen";
        String a =touppercase(str);
        System.out.println(a);

    }
}
