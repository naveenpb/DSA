package Strings;

// import java.util.*;

public class Input_Output {
    public static void main(String[] args) {
        // char arr[] ={'a','b','c'};
        // String str = "abcd";
        // String str2 = new String("abc");

        // // 
        // // STRINGS ARE IMUTTABLE IN JAVA
        // // 
        // Scanner sc = new Scanner(System.in);
        // // String name =sc.next();
        // // so here next takes only one starting word ...
        // String name = sc.nextLine();
        // // 
        // // SO WHEN WE USE NEXTLINE .... IT TAKES WHOLE LINE AND WE CAN WRITE THE WHOLE SENTENCE ....
        // // 
        // System.out.println(name);



        /*
         * METHODS OF STRING
         */
        // Lenght
         String name ="naveen";
         System.out.println(name.length());

        //  Concatenation
        String lastname ="PB";

        String Fullname = name + " " +lastname;
        System.out.println(Fullname);

        // charat
        System.out.println(Fullname.charAt(4));
        // USING THIS WE CAN PUT A STRIING INTO CHAR ARRAY BY RUNNING FOR LOOP
        // THERE ARE MANY METHODS INCLUDING THIS ALSO
    }
}
