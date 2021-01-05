package HomeworkEleven;
import java.util.Scanner;
public class TimeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.next(); // mustafa
        System.out.println("Welcome "+name+"!"); // welcome mustafa
         Time time = new Time();
        Time date = new Time();
        Time dateAndTime =new Time();
        int option=0;
        do{
            System.out.println("Please read the instructions and select an option...");
            Time.instructions();
            option=input.nextInt();
            switch (option) {
                case 1: // to create time
                    System.out.println("Enter hour:");
                    int hour=input.nextInt();
                    System.out.println("Enter minute:");
                    int minute=input.nextInt();
                    System.out.println("Enter second:");
                    int second=input.nextInt();
                    time =new Time(hour,minute,second);
                    break;
                case 2:
                    System.out.println("Enter month:");
                    int month=input.nextInt();
                    System.out.println("Enter year:");
                    int year=input.nextInt();
                    date=new Time(month, year);
                    break;
                case 3:
                    System.out.println("Enter hour:");
                    int hour1= input.nextInt();
                    System.out.println("Enter minute:");
                    int minute1= input.nextInt();
                    System.out.println("Enter second:");
                    int second1= input.nextInt();
                    System.out.println("Enter month:");
                    int month1= input.nextInt();
                    System.out.println("Enter year:");
                    int year1= input.nextInt();
                    dateAndTime =new Time(hour1,minute1,second1,month1,year1);
                    break;
                case 4:
                    System.out.println("Enter hour to update:");
                    time.setHour(input.nextInt()); // int hour=input.nextInt();
                    System.out.println("Enter minute to update:");
                    time.setMinute(input.nextInt());
                    System.out.println("Enter second to update:");
                    time.setSecond(input.nextInt());
                    break;
                case 5:
                    System.out.println("Enter month to update:");
                    date.setMonth(input.nextInt());
                    System.out.println("Enter year to update:");
                    date.setYear(input.nextInt());
                    break;
                case 6:
                    time.printTime();
                    break;
                case 7:
                    date.printDate();
                    break;
                case 8:
                    System.out.println(dateAndTime.toString());
                    break;
                case 9:
                    break;
            }
        }while(option!=9);
        System.out.println("Thanks for using the app. Have a great day!");
    }
    }
}
