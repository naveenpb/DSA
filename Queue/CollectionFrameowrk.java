package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionFrameowrk {
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>(); // because queue is an interface .. see collection frameowrk chart for more details
        q.add(1);

        q.add(2);
        System.out.println(q); // like array collection framework print method...
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll(); //remove also can be used
        }
        
        Queue <Integer> q2 = new ArrayDeque<>();
        // we cann also implement it using arraydequque 
        
        q2.add(1);
        q2.add(2);
        
        while (!q2.isEmpty()) {
            System.out.println(q.peek());
            q2.remove(); //remove also can be used
        }


        /*
         * 
         * 
         * 
         * in arraydequeue implementation , null is storing , 1 and 2 are not adding into queue .....check it once ask chatgpt ...currently 27/8/24 4:19 pm no internet ..4th sem summer holiday
         * 
         * 
         * 
         */
    
    }
}
    
