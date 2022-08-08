import java.util.Scanner;

public class Task1 {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int x= Sc.nextInt();
        int y= Sc.nextInt();
        int z= Sc.nextInt();

        System.out.println("Enter the no of students :");
        int n= Sc.nextInt();

        int a=x-n;
        int b=y-n;
        int c=z-n;
        if(a<0&&b<0&&c<0)
            System.out.println("None of the labs is allocated");
        else if(a<b&&a<c)
            System.out.println("L1");
        else if(b<a&&b<c)
            System.out.println("L2");
        else
            System.out.println("L3");
    }
}
