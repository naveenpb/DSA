package Queue;
import java.util.*;

public class IMP_LOGIC_INTV__FisrtNonRepeating {

    public static void printNonrepating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i = 0 ;i<str.length() ; i++ ){
            char ch = str.charAt(i);

            q.add(ch);
            freq[ch-'a'] ++; //this is important logic to remember

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove(); // because all elemets here has frequency more than 1 , and will not be a repeating character
            }

            if(q.isEmpty()){
                System.out.print(-1 +  " ");
            }

            else{
                System.out.print (q.peek() + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";

        printNonrepating(str);
    }
}
