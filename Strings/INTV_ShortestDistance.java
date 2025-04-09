package Strings;
/*
 * WHERE EVER I HAVE GIVEN INTV THEN THESE QUESTIONS ARE MOST FREQUENTLY USED QUESTIONS IN PLACEMENT AND INTERVIEW
 * 
 */
public class INTV_ShortestDistance {
    public static void shortestpath(String str){
        int x = 0;
        int y =0;
        for(int  i = 0;i<str.length();i++){
            // NORTH
            if(str.charAt(i) == 'N'){
                x += 1;
            }
            // SOUTH
            else if( str .charAt(i) == 'S'){
                x-=1;
            }
            // WEST
            else if(str.charAt(i)=='W'){
                y -= 1;
            }
            // east
            else{
                y +=1;
            }

        }

        float shortdist = (float) Math.sqrt((x*x) + (y*y));
        // we have used float here because if its not propper sqrt we should display each point distance
        System.out.println("THE SHORTEST PATH IS " + shortdist);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        shortestpath(str);
    }
}
