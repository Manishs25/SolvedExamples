package Java100Ques.collection;

public class DelWhiteSpace {
    public static void main(String[] args) {

        String str = "   m ani sh sdfjflasf kdaklgaddlfgadfj dflhksjlhsldkh ";

        str = str.replaceAll("\\s","");

        System.out.println(str);
    }
}
