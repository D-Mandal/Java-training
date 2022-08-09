public class DAy2_TAsk1 {
    public static void main( String args[])
    {
        int marks[] ={20, 64, 45, 12, 67, 80, 76, 34, 25 , 7 };
        int max=0;
        int min=marks[0];
        for(int i =0; i<marks.length;i++)
        {
            if(marks[i]>max)
            {
                max=marks[i];
            }
        }
        for(int i =0; i<marks.length;i++)
        {
            if(marks[i]<min)
            {
                min=marks[i];
            }
        }
        System.out.println("Maximum marks " +max);
        System.out.println("Minimum marks " +min);
    }
}
