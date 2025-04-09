package Arrays;

public class LInearSearch {
   
    public static void linear(int arr[],int key){
        int pos =0 ;
        int flag =0 ;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("the Element found in the place " +pos +" (ZERO INDEXING)") ;
                flag = 1 ;            
            
            }
            pos ++ ;

        }
        if (flag != 1){
            System.out.println("ENTER A VALID KEY LAVDE");
        }
    }

    public static void main(String[] args) {
        int arr [] ={1,2,3,4,14,6,7};   
        linear(arr, 7);
    }
}
