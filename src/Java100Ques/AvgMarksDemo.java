package Java100Ques;

import java.util.Scanner;

public class AvgMarksDemo {
    public static void main(String[] args) {
        float s1, s2, s3, s4, s5, s6;
        double total, average, percentage;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of Six subjects...");
        System.out.print("Enter the marks of English : ");
        s1 = scanner.nextFloat();
        System.out.print("Enter the marks of Physics : ");
        s2 = scanner.nextFloat();
        System.out.print("Enter the marks of Chemistry : ");
        s3 = scanner.nextFloat();
        System.out.print("Enter the marks of Biology : ");
        s4 = scanner.nextFloat();
        System.out.print("Enter the marks of Computer : ");
        s5 = scanner.nextFloat();
        System.out.print("Enter the marks of Mathematics : ");
        s6 = scanner.nextFloat();
        total = (s1 + s2 + s3 + s4 + s5 + s6);
        System.out.println("Total : " + total);
        average = (total / 6);
        System.out.println("Average : " + average);
        percentage = (total / 600) * 100;
        System.out.println("Percentage : " + percentage);
    }
}
