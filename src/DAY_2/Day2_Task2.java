package DAY_2;

public class Day2_Task2 {
    public static void main(String[] args)
    {
     String s1="Debolina"  ;
     String s2="Mandal";
     StringBuffer sb=new StringBuffer(s1);
     String s[] =s1.split("o",4);
     for(String i:s){
         System.out.println(i);
     }
     System.out.println("The length of the string " +s1.length());
     System.out.println("The length of the string " + s1+s2);

     System.out.print("The reverse of string " +sb.reverse()+"\n");


        if(s1.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }

    }

