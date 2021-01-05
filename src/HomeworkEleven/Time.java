package HomeworkEleven;

public class Time {

    // instance variables
    int hour;
    int minute;
    int second;
    int month;
    int year;

   //argument constructor
    public Time (int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time (int month, int year) {
        this.month = month;
        this.year = year;
    }
    public Time (int hour, int minute, int second, int month, int year) {
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

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    //setter
    public void setHour(int hour) {

        if (hour <= 0 || hour > 23) {
            this.hour = 0;
        }else {
            this.hour = hour;
        }

    }

    public void setMinute(int minute) {

        if (minute < 0 || minute > 59) {
            this.minute = 0;
        }else {
            this.minute = minute;
        }
    }
    public void setSecond(int second) {

        if (second < 0 || second > 59) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public void setMonth(int month) {
        if(month < 0 || month >12) {
            this.month = 0;
        }else {
            this.month = month;
        }
    }
    public void setYear(int year) {
       if(month<=0) {
           this.year = 0;
       } else {
           this.year = year;
       }
    }

    public void printTime(){
        System.out.println(getHour()+"/"+getMinute()+"/"+getSecond());
    }
    public void printDate(){
        System.out.println(getMonth()+"/"+getYear());
    }
    public String toString(){
        return getHour()+"/"+getMinute()+"/"+getSecond()+" - "+getMonth()+"/"+getYear();
    }
    public static void instructions(){ // time.instructions();
        System.out.println("Press 1 to create Time");
        System.out.println("Press 2 to create Date");
        System.out.println("Press 3 to create Date and Time");
        System.out.println("Press 4 to update Time");
        System.out.println("Press 5 to update Date");
        System.out.println("Press 6 to print Time information");
        System.out.println("Press 7 to print Date information");
        System.out.println("Press 8 to print Date and Time information");
        System.out.println("Press 9 to exit");
    }
}






