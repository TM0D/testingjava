public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 1;
        year = 1990;
    }

    public Date(int dy, int mo, int yr) {
        day = dy;
        month = mo;
        year = yr;
    }

    public int getDayOfWeek() {
       return (day + year + (year / 4) - (year / 100) + (year / 400) + (31 * month) / 12) % 7;
    }

    public static boolean isLeapYear(int y) {
        if (y % 400 == 0) {
            return true;
        } else if (y % 100 == 0) {
            return false;
        } else if (y % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
