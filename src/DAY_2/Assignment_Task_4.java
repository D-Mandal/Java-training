package DAY_2;
import java.util.Scanner;
public class Assignment_Task_4 {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Sentence in Lowercase:");
            String str = sc.nextLine();
            System.out.println("Sentence in Uppercase:");
            String str1 = sc.nextLine();

            str = str.toUpperCase();  //converts string to uppercase
            str1 = str1.toLowerCase();
            System.out.println("Sentence in upper case= "+str);
            System.out.println("Sentence in lower case= "+str1);
        }

}
