package GreedyAlogrithum;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

public class INTV_JobSequencing {

    static class job{
        int deadline;
        int profit;
        int id;//JOB a =1 , job b  = 2 , job c =  3

        public job(int id , int deadline , int profit){
            this.deadline= deadline;
            this.profit = profit;
            this.id = id;
        }
    }
    
    public static void main(String[] args) {


        int jobInfo[][] = {{4,20} , {1,10} ,{1,40} , {1,30}};

        ArrayList<job> jobs  = new ArrayList<>();

        for(int i  = 0 ; i <jobInfo.length ; i++){
            jobs.add(new job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs ,(obj1,obj2) -> obj2.profit - obj1.profit); // so it sorts objects in decending order , if we  want assending order ibject sorting then we have to ... do obj1.profit - obj2.profit
        
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0 ;
        for(int i = 0 ; i <jobs.size();i++){
            job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("max jobs = " + seq.size());
        for(int i  = 0 ; i < seq.size();i++){
            System.out.print(seq.get(i) + " ");
             
            
        }


    }   
}
