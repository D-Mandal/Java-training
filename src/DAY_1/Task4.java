package DAY_1;

import java.util.Scanner;
public class Task4 {
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the no :");
        int a= Sc.nextInt();

        while (a != 1)
        {
            System.out.println(a + " ");


            if ((a & 1) == 1)
                a = 3 * a + 1;


            else
                a = a / 2;
        }


        System.out.print(a);
    }
    }

