package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueue {

    // see if we get size of odd number then we can reject in the problem if the question is like that ! .... decide on question



    // important logic 

    public static void interleave(Queue<Integer>  q){
        Queue<Integer> firsthalf = new LinkedList<>();
        int size  = q.size();
        int mid = size/2;

        for(int i = 0 ; i < mid ; i ++){ // declare separate mid and size ,, if we mention size function inside for loop , then it will create problem ..likee every time we reduce the q size the mid will decrease
            firsthalf.add(q.remove());
        }

        while (!firsthalf.isEmpty()) {
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
