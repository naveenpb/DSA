package Backtraking;

public class StringSubsets {

    public static void findsuubsets(String str, String ans , int i /* i for index */){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
                // rerember we also have to print  null subset..
            }
            System.out.println(ans);
            return;
            // retun statement is very important. because ater the base cacse is hit in the recurssion , i want to go oine step down , so its important.
        }

        // recurssion
        // yes choice
        findsuubsets(str, ans+str.charAt(i), i+1);
        // no choice
        findsuubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        
        findsuubsets(str, ""  , 0);
        // Empty string nu kuda pass mad bahudu , when you have given print statemt in function itself
    }
}
