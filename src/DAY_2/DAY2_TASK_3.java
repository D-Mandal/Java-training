package DAY_2;
import java.util.Scanner;
public class DAY2_TASK_3 {
    public static void main(String args[]) {
        int size, sum = 0, max_count = 0, mode = 0;
        float mean;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int array[] = new int[size];
        //mean
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("Mean : " + sum / size);
        //mode
        for (int j = 0; j < size; j++) {
            int count = 0;
            for (int k = 0; k < size; k++) {
                if (array[j] == array[k])
                    count += 1;
            }
            if (count > max_count) {
                max_count = count;
                mode = array[j];
            }
        }
        System.out.println(mode);
        //median
        if (size % 2 == 0) {
            int median = array[size / 2] + array[(size / 2) + 1];
            System.out.println("Median is" + median / 2);
        } else {
            System.out.println("Median is " + array[size / 2]);
        }
    }
}


