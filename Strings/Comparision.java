package Strings;



public class Comparision {
    public static void main(String[] args) {
    String s ="naveen";
    String s1 = "naveen";
    String s2 = new String("naveen");

    if(s ==s1){
        System.out.println("yes");
    }
    if(s == s2){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
    // THE OUTPUT WILL  BE  NO EVEN THE VALUES ARE SAME BECAUSE THE == OPERATOR CHECKS FOR OBJ IS SAME OR NOT LIKE IT SEES AND CHECKS FOR SAME ADDRESS
    // AND WHEN WE USE NEW KEYWORD IN JAVA THE VALUE IS STORED IN NEW ADDRESS SPACE SO IT SAYS NO 
    // TO COMPARE THE VALUES OF THE STRING W NEED TO USE ONE METHOS CALLED EQUALS()
    if(s.equals(s2))
        System.out.println("yes yes");
}
}

    
