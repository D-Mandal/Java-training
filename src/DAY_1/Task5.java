package DAY_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int flag = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int row = Sc.nextInt();
        System.out.println("Enter the no of columns : ");
        int col = Sc.nextInt();
        System.out.println("Enter the tree no : ");
        int Tree_num = Sc.nextInt();
        for (int i = 1; i <= row; i++) {
            if (Tree_num == i) {
                flag = 1;
                break;
            }
        }
        for (int i = row; i <= col * row; i = i + row) {
            if (Tree_num == i) {
                flag = 1;
                break;
            }
        }
        for (int i = 1; i <= (row*(col - 1) + 1); i = i + row) {
            if (Tree_num == i) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}