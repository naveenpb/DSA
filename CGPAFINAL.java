import java.util.Scanner;
public class CGPAFINAL {
    
    public static void internals(){
        System.out.println("Enter the total internals marks of respective subjets");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Maths = ");
        int m31 = sc.nextInt();
        System.out.print("Enter Marks of OS = ");
        int os1 = sc.nextInt();
        System.out.print("Enter the marks of DDCO = ");
        int ddco1 = sc.nextInt();
        
        System.out.print("Enter the marks of DSA = ");
        int dsa1 = sc.nextInt();
        System.out.print("Enter the marks of java in = ");
        int java1 = sc.nextInt();
        System.out.print("Enter the marks of dvp = ");
        int dvp = sc .nextInt();
        System.out.print("Enter the marks of scr = ");
        int scr = sc.nextInt();
        System.out.print("Enter the marks of dsa lab = ");
        int dsalab=sc.nextInt();
        System.out.println();
        System.out.println();



        // External marks 
        System.out.println("Enter External marks of respective subject");
        System.out.print("Enter Marks of MATHS =  ");
        int m3 = sc.nextInt();
        int m3e =m3;
        m3/=2;

        System.out.print("Enter Marks of OS = ");
        int os = sc.nextInt();
        int ose = os;
        os/=2;

        System.out.print("Enter the marks of DDCO = ");
        int ddco = sc.nextInt();
        int ddcoe = ddco;
        ddco/=2;

        System.out.print("Enter the marks of DSA = ");
        int dsa = sc.nextInt();
        int dsae = dsa;
        dsa/=2;

        System.out.print("Enter the marks of java in = ");
        int java = sc.nextInt();
        int javae = java;
        java/=2;
        
        System.out.println();
        System.out.println();

        int mattotal = m3+m31;
        int ddcototal= ddco+ddco1;
        int ostotal = os1+os;
        int javatotal = java+java1;
        int dsatotal  = dsa+dsa1;

        int arr[]={mattotal,ddcototal,ostotal,javatotal,dsatotal,dvp,dsalab,scr};
        int External[]={m3e,ddcoe,ose,javae,dsae,dvp,dsalab,scr};
        cgpacalc(arr, External);
        sc.close();
        
    }

    public static void cgpacalc(int arr[],int External[]){
        // credits
        int credits[]={4,4,4,3,3,1,1,1};
        String arrsub[]={"MATHS","DDCO","OS","JAVA","DSA","DVP","DSALAB","SCR"};
        int total[]=new int[arrsub.length];
        float totalpoints =0 ;

        System.out.println("-----------------YOUR RESULTS ARE HERE-----------------------");
        
        for(int i =0 ;i<=7;i++){

            System.out.println();
            System.out.println();
            System.out.println();

            if(i==5){
                if(arr[i]>=45){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*10);
                    System.out.println("YOUR GRADE IS O");
                    total[i] = credits[i]*10;
                }
                else if(arr[i]>=40){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*9);
                    System.out.println("YOUR GRADE IS A+");
                    total[i] = credits[i]*9;
                }
    
                else if(arr[i]>=35){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*8);
                    System.out.println("YOUR GRADE IS A");
                    total[i] = credits[i]*8;
                }
    
                else if(arr[i]>=30){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*7);
                    System.out.println("YOUR GRADE IS B+");
                    total[i] = credits[i]*7;
                }
    
                else if(arr[i]>=25){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*6);
                    System.out.println("YOUR GRADE IS B");
                    total[i] = credits[i]*6;
                }
    
                else if(arr[i]>=20){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*5);
                    System.out.println("YOUR GRADE IS C");
                    total[i] = credits[i]*5;
                }
    
                else if(arr[i]==20){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = 0");
                    System.out.println("YOUR GRADE IS F");
                    total[i] = credits[i]*0;
                }
                else{
                    System.out.println("YOU HAVE FAILED IN " + arrsub[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = 0");
                    System.out.println("YOUR GRADE IS f");
                    total[i] = 0;
                }
                
            }

            else if(i==6){
                if(arr[i]>=45){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*10);
                    System.out.println("YOUR GRADE IS O");
                    total[i] = credits[i]*10;
                }
                else if(arr[i]>=40){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*9);
                    System.out.println("YOUR GRADE IS A+");
                    total[i] = credits[i]*9;
                }
    
                else if(arr[i]>=35){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*8);
                    System.out.println("YOUR GRADE IS A");
                    total[i] = credits[i]*8;
                }
    
                else if(arr[i]>=30){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*7);
                    System.out.println("YOUR GRADE IS B+");
                    total[i] = credits[i]*7;
                }
    
                else if(arr[i]>=25){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*6);
                    System.out.println("YOUR GRADE IS B");
                    total[i] = credits[i]*6;
                }
    
                else if(arr[i]>=20){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*5);
                    System.out.println("YOUR GRADE IS C");
                    total[i] = credits[i]*5;
                }
    
                else if(arr[i]==20){
                    System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = 0");
                    System.out.println("YOUR GRADE IS F");
                    total[i] = credits[i]*0;
                }
                else{
                    System.out.println("YOU HAVE FAILED IN " + arrsub[i]);
                    System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = 0");
                    System.out.println("YOUR GRADE IS f");
                    total[i] = 0;
                }
                
            }

            else if(External[i]<40){
                System.out.println("YOU HAVE FAILED IN " + arrsub[i]);
                System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = 0");
                System.out.println("YOUR GRADE IS f");
                total[i] = 0;

            }

            else{
        
            if(arr[i]>=90){
                System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*10);
                System.out.println("YOUR GRADE IS O");
                total[i] = credits[i]*10;
            }

            else if(arr[i]>=80){
                System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*9);
                System.out.println("YOUR GRADE IS A+");
                total[i] = credits[i]*9;
            }

            else if(arr[i]>=70){
                System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*8);
                System.out.println("YOUR GRADE IS A");
                total[i] = credits[i]*8;
            }

            else if(arr[i]>=60){
                System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*7);
                System.out.println("YOUR GRADE IS B+");
                total[i] = credits[i]*7;
            }

            else if(arr[i]>=50){
                System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*6);
                System.out.println("YOUR GRADE IS B");
                total[i] = credits[i]*6;
            }

            else if(arr[i]>=45){
                System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*5);
                System.out.println("YOUR GRADE IS C");
                total[i] = credits[i]*5;
            }

            else if(arr[i]>40){
                System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*5);
                System.out.println("YOUR GRADE IS C");
                total[i] = credits[i]*5;
            }

            else if(External[i]==40){
                System.out.println("TOTAL MARKS IN "+arrsub[i]+" is "+arr[i]);
                System.out.println("TOTAL CREDITS EARNED in "+arrsub[i]+" = "+credits[i]*5);
                System.out.println("YOUR GRADE IS P");
                total[i] = credits[i]*5;
            }
        }
        }

        // calc total points
        for(int i =0 ; i<=7;i++){ 
            totalpoints +=total[i];
        }
        System.out.println();
        System.out.println();

        System.out.println("THE TOTAL SGGA IS = "+totalpoints/21);
    
    }
    public static void main(String[] args) {
        internals();
    }

}