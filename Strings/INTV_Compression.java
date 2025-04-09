package Strings;

import java.lang.StringBuilder;

public class INTV_Compression {

    // TIME COMLEXITY IS O(n)
    public static String compression(String str){
        String newstr ="";
        for(int i = 0 ;i<str.length();i++){
            Integer count =1 ;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count>1) {
                newstr += count.toString();
            }
        }
        return newstr;
    } 

    
    /**
     * 
     * // now let us do it using string builder
     * 
     */
    public static void string_builder_compression(String str){
        StringBuilder sb = new StringBuilder("");
        Integer count =0 ;
        for(int i =0 ;i<str.length();i++){
            while (str.charAt(i)==str.charAt(i+1) && i<str.length()-1) {
                count ++;
            }
            sb.append(str.charAt(i));
            if(count>0){
                sb.append(count.toString());
            }
            
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str ="aaabbcccdd";
       String a = compression(str);
       System.out.println(a);
       string_builder_compression(str);
    }
}
