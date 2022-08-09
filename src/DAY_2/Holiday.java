package DAY_2;

public class Holiday {

    private String name;
    private int day;
    private String month;


    public Holiday(String Name, int Day, String Month) {
        name = Name;
        day = Day;
        month = Month;
    }

    public boolean inSameMonth(Holiday holiday_1, Holiday holiday_2) {
        if (holiday_1.month.equals(holiday_2.month)) {
            return true;
        }
        return false;
    }


    public static double avgDate(Holiday[] hol) {
        int sum = 0;
        for (int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].day;
        }
        return ((double) sum) / hol.length;

    }


    public static void main(String args[]) {
        Holiday hol = new Holiday("Independence Day", 4, "July");
    }
}

