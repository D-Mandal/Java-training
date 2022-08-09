package DAY_1;

import java.util.Scanner;
public class Task2 {
    public static void main(String args[]) {


        int extra = 0;
        int Salary = 0;
        int Total = 0;
        int days[] = new int[7];
        System.out.print("Enter No of Working Hours ");
        for (int i = 0; i < 7; i++) {
            Scanner sc = new Scanner(System.in);

            days[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if (days[i] > 8) {
                extra= days[i] - 8;
                Salary += (days[i] * 100) + (extra* 15);
            } else {
                Salary += (days[i] * 100);
            }
        }

        Total = days[1] + days[2] + days[3] + days[4] + days[5];
        if (Total > 40) {
            Salary += (Total - 40) * 100 + (Total - 40) * 25;
        }
        if (days[0] > 0) {
            Salary = Salary * (25 / 100);
        }
        if (days[6] > 0) {
            Salary = Salary * (50 / 100);
        }
        System.out.println("TOTAL SALARY " + Salary);
    }
}