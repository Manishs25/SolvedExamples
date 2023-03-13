package Java100Ques.collection;

public class StRev {
    public static void main(String[] args) {

        String s = "Java is programming language";

        s = s + " ";

        String reverseSent = "";

        String word = "";

        for (int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if (ch != ' '){
                word = word + ch;
            }else {
                reverseSent = word+ " "+reverseSent;
                word="";
            }
        }
        System.out.println(reverseSent);
    }
}
