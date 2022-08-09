package DAY_1;

import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char first_char=sc.next().charAt(0);
        char second_char=sc.next().charAt(0);
        System.out.println("Enter no of Rows : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<=i;k++){
                System.out.print(first_char);
            }
            for(int j=n-1;j>=i;j--){
                System.out.print(second_char);
            }
            System.out.println();
        }
    }
}