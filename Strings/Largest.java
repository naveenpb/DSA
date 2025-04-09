package Strings;

public class Largest {
    public static void main(String[] args) {
        String fruits[] ={"mango","bananna","Apple","chicku"};
        String largest = fruits[0];
        for(int i =1;i<fruits.length;i++){
            if(fruits[i].compareTo(largest)>0){
                // changee symbol to get smallest
                // its very important we have to use compareto method here and it returns -ve value if its ture 
                // sooo...
                largest =fruits[i];
            }
        }
        System.out.println("THE LARGEST STRING IS " + largest);
    }
}
