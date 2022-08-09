package DAY_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lab 1 cap-- ");
        int x=sc.nextInt();
        System.out.print("Enter lab 2 cap- ");
        int y=sc.nextInt();
        System.out.print("Enter lab 3 cap-- ");
        int z=sc.nextInt();
        System.out.print("Enter number of student- ");
        int n=sc.nextInt();
        int a=(x-n);
        int b=(y-n);
        int c=(z-n);
        if(a<0 && b>=0 && c>=0 ){
            if(b<c){
                System.out.println("L2");
            }else{
                System.out.println("L3");
            }
        }
        if(a>=0 && b<0 && c>=0 ){
            if(a<c){
                System.out.println("L1");
            }else{
                System.out.println("L3");
            }
        }
        if(a>=0 && b>=0 && c<0 ){
            if(a<b){
                System.out.println("L1");
            }else{
                System.out.println("L2");
            }
        }
        if(a<=b && a<=c && a>=0 && b>=0 && c>=0){
            System.out.println("L1");
        }
        else if(b<=a && b<=c && a>=0 && b>=0 && c>=0){
            System.out.println("L2");
        }
        else if(c<=a && c<=b && a>=0 && b>=0 && c>=0){
            System.out.println("L3");


    }
    }
}
