package HomeworkEleven;

public class Time {

    // instance variables
    int hour;
    int minute;
    int second;
    String month;
    int year;

   //argument constructor
    public Time (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time (String month, int year) {
        this.month = month;
        this.year = year;
    }
    public Time (int hour, int minute, int second, String month, int year) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.year = year;
    }

    //getter

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    //setter
    public void setHour(int newHour) {
         this.hour = newHour;

         if(hour > 0 && hour <=24) {
             System.out.println(newHour);
         }
    }

    public void setMinute(int newMinute) {
        this.minute = newMinute;
    }
    public void setSecond(int newSecond) {
        this.second = newSecond;
    }

    public void setMonth(String newMonth) {
        this.month = newMonth;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }
}
