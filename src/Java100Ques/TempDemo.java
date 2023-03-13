package Java100Ques;

import java.util.Arrays;

public class TempDemo {
    public static void main(String[] args) {
//        //celcius to farenheit
//        float farenheit, celcius;
//        celcius = 13;
//        farenheit = ((celcius * 9) / 5) + 32;
//        System.out.println("Temperature in Farenheit is : " + farenheit);
//
//        //Farenheit to celcius
//        celcius = ((farenheit - 32) * 5) / 9;
//        System.out.println("Temperature in Celcius is :" + celcius);


//        int no=3;
//        for (int i = 1; i <= 10; i++){
//            System.out.println(no+"*"+i+"="+(no*i));
//        }

//        for (int i = 1;i<=5;i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.println("*");
//            }
//            System.out.println();


//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
////                System.out.print("");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i=1;i<6;i++){
//            for (int j=6;j>i;j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//
//        }

        int arr[]={21,456,87,9,987,0,0,23425};
    int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
//        int max = arr[0];
//        for (int i:arr){
//            if (i>max){
//                max=i;
//            }
//        }
//        System.out.println(max);
    }




}
