package lab;

public class MyDate {

    public int day;
    public int month;
    public int year;

    public MyDate(){}

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }


}