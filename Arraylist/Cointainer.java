package Arraylist;
import java.util.*;

public class Cointainer {

    public static int Mostwater(ArrayList<Integer> height){
        int maxwater = 0;
        // Brute Force
        for(int i =0 ;i <height.size();i++){
            for(int j = 0 ;j<height.size();j++){
               int minheight = Math.min(height.get(i), height.get(j));
               int width = j-i;
               int water = minheight * width;
               if(maxwater< water){
                    maxwater=water;
               }

            }
        }
        return maxwater;
    }

        // O(n^2)

        // we can optimize it to O(N) , by using 2-pointer approch(IMP)

        // left pointer = 0  , right-point = size-1;


        public static int MostwaterOptimised(ArrayList<Integer> height){
            int maxwater2 = 0;
            
            int i = 0;
            int j = height.size()-1;


            while (i<j) {
               int minheight = Math.min(height.get(i), height.get(j));
               int width = j-i;
               int water = minheight * width;
               if(height.get(j) < height.get(i)){
                j--;
               }
               else{
                i++;
               }

               if(maxwater2< water){
                maxwater2=water;
           }
        }

        return maxwater2;
    }




    public static void main(String[] args) {

        ArrayList<Integer> height =  new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(Mostwater(height)); //It has O(N^2)
        System.out.println(MostwaterOptimised(height)); //Its has O(N)
    }
}
