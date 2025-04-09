package Bit_Manuplication;

public class INTV_Updatebit {
    public static void update(int n , int i , int update){
        if(update ==1){
            SetithBit.setithbit(n, i);
        }
        else{
            System.out.println(Clearithbit.clearithbit(n, i));
            
        }
    }

    // the above is normal method  but for best knowlede kniw second method
    
    public static int updatelogic(int n , int i ,int nb){
        int a = Clearithbit.clearithbit(n, i);
        int bitmask = nb << i;
        return a|bitmask;
        // it will be asked in interview
    }


    public static void main(String[] args) {
        update(5, 2, 0);
        System.out.println(updatelogic(5, 2, 0));

    }
}
