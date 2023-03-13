package Java100Ques;

import javax.naming.Name;
import java.util.Scanner;

public class ScannerClassDemo {
    public static void main(String[] args) {

        System.out.println("Enter your details");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Name - "+name);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Age - "+age);

        System.out.println("Enter your salary : ");
        double salary = sc.nextDouble();
        System.out.println("Salary - "+salary);

//        sc.close();
    }
}
