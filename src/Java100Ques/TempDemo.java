package Java100Ques;

public class TempDemo {
    public static void main(String[] args) {
        //celcius to farenheit
        float farenheit, celcius;
        celcius = 13;
        farenheit = ((celcius * 9) / 5) + 32;
        System.out.println("Temperature in Farenheit is : " + farenheit);

        //Farenheit to celcius
        celcius = ((farenheit - 32) * 5) / 9;
        System.out.println("Temperature in Celcius is :" + celcius);
    }
}
