package GeneralCodes;

public class Prime {
    public static boolean isprime(int n){
        boolean prime=true;
        // we have written Math.sqrt(n) becaues to reduce time xomplexity , we can simply write it as i<=n-1
        // even to reduce that we can return 2 first itself


        if(n==2){
            return prime;
        }
      
        else{

        for(int i =2 ;i<=Math.sqrt(n);i++){
            if((n%i)==0){
                prime = false;
                break;
            }
        }
        return prime;
 
    }
    }

    public static void primeInRange(int n){
        for(int i =2 ; i<=n;i++){
            if(isprime(i)){//if true it will print the value
                System.out.print(i+" ");
            }
        }
    }

 public static void main(String[] args) {
    System.out.println(isprime(2)); 
    primeInRange(20);   
}


}
