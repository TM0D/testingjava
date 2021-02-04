package u5classes;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    public Date(int dy, int mo, int yr) {
        day = dy;
        month = mo;
        year = yr;
    }

    public Date(Date other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public int getDayOfWeek() {
       return (day + year + (year / 4) - (year / 100) + (year / 400) + (31 * month) / 12) % 7;
    }

    public static Date getEasterDate(int year) {
        int a,b,c,d,e,f,g,h,i,k,r,m,n,p;
        a = year % 19;
        b = year / 100;
        c = year % 100;
        d = b / 4;
        e = b % 4;
        f = (b + 8) / 25;
        g = (b - f + 1) / 3;
        h = (19 * a + b - d - g + 15) % 30;
        i = c / 4;
        k = c % 4;
        r = (32 + 2 * e + 2 * i - h - k) % 7;
        m = (a + 11 * h + 11 * e) / 451;
        n = (h + r - 7 * m + 114) / 31;
        p = (h + r - 7 * m + 114) % 31;
        Date easter = new Date(p+1, n, year);
        return easter;
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

    public static String getMonthName(int m) {
        switch (m) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
        }
        return "no";
    }
}
