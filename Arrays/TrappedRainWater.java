package Arrays;

public class TrappedRainWater {
    // vvvvvimp topic
    public int calcwater(int height[]){
        
        // make auxuallary arrays i.e make helping arrays , which are leftmax and right max
        int leftmax[] = new int[height.length];
        int n = height.length;
        // 1st element will be same
        leftmax[0]=height[0];
        for(int i =1 ;i<n ;i++){
            // here we havent put i<= beacues n starts from 1
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        // make rightmax array
        int rightmax[]=new int[height.length];
        rightmax[n-1]=height[n-1];
        // we have to use n-1 because we ,get lenght from starting index 1 ,and indexing in array starts from 0
        // so we want to put i=n-2
        for(int i =n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater =0;
        // To calculate trapped rain water
        // first find waterlevel , waterlevel is min of leftmax and rightmax array .....Think logically you will get the reason
        for(int i =0;i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            
            trappedwater += waterlevel-height[i]; 
        }
       
        return trappedwater;
    }

    public static void main(String[] args) {
        TrappedRainWater obj = new TrappedRainWater();
        int height[]={4,2,0,6,3,2,5};
        int totalwater=obj.calcwater(height);
        System.out.println(" The total Trapped water is " + totalwater +" units");
    }
    
}
