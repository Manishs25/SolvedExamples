package Java100Ques.collection;

public class ResverseNum {
    public static void main(String[] args) {
        int no = 12345, lastDigit;

        while (no>0){
            lastDigit = no%10;
            System.out.print(lastDigit);
            no = no /10;
        }
        System.out.println();
    }
}
