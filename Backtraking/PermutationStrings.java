package Backtraking;

public class PermutationStrings {
    
    public static void findpermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // recurssion

        for(int i = 0 ;i <str.length();i++){
            char curr = str.charAt(i);
            String newstring = str.substring(0 , i) + str.substring(i+1); 
            // because nange selected item na bittu mikkiro string beku , adikke 0 inda i tanka ond substring na madi , i+1 ninda end tanka ond substring na madidre , i will not get that ith element in newstring , partisala loop alli bhege agutte
            findpermutation(newstring, ans+curr);
             
        }

    }
    public static void main(String[] args) {
        String str = "abc" ;
        findpermutation(str, "");
        
    }
}
