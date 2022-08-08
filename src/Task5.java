import java.util.Scanner;
public class Task5 {
    public static void main(String args[]) {

        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int a= Sc.nextInt();
        System.out.println("Enter the no of columns :");
        int b= Sc.nextInt();
        System.out.println("Enter the tree no :");
        int n= Sc.nextInt();
        if(n==10||n==11||n==16||n==17||n==18||n==19||n==20||n==5||n==4||n==2||n==3)

        {

            System.out.println("Yes");

        }

        else

        {

            System.out.println("No");

        }
    }


}
