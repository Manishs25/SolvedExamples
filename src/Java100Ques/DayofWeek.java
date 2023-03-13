package Java100Ques;

import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day no. : ");
        int day = sc.nextInt();
        System.out.println(getDayOfWeek(day));
        if (day > 7) {
            System.out.println("Invalid day no.");
        }
    }

    public static String getDayOfWeek(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;


        }

        return dayName;
    }
}
