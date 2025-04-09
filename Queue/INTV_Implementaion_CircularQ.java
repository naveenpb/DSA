package Queue;

public class INTV_Implementaion_CircularQ {
    
    
    // Note :- front = (front+1)%n
             // rear = (rear+1) %n //n is size

// here all implementation is of O(1) 


    // using array
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front =-1;
        
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isfull(){
            return (rear+1)%size ==front;
        }

        public void add(int data){
            if(isfull()){
                System.out.println("Bc quque is full");
                return;
            }

            if(front == -1 ){
                front = 0 ; //Initilization
            }

            rear = (rear+1) %size;
            arr[rear] = data;
        }


        public int remove(){
            if(isEmpty()) {
                System.out.println("Cant remove ");
                return -1;
            }

            int result = arr[front];

            if(rear == front){
                rear = front = -1; //because only one was remaining , so after remaining that element make it -1
            }
            else{
                front = (front+1)%size;
            }
           
            return result;
        }

        public int peek(){
            if(isEmpty()) {
                System.out.println("Cant remove ");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
