package Java100Ques;

public class ConversionDemo {
    public static void main(String[] args) {

        // days into years
        int days = 10398;
        int years = days / 365;
        System.out.println("Years : " + years);

        //days into weeks
        int weeks = (days % 365) / 7;
        System.out.println("Weeks : " + weeks);

        //weeks into days
        days = (days % 365) % 7;
        System.out.println("Days : " + days);
    }
}
