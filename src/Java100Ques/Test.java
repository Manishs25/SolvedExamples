package Java100Ques;

public class Test {
    int function(int a, int b){
        if (b == 0){
//            System.out.println();;
            return 1;
        }
        int temp = function((a),b/2);
        if (b % 2 != 0){
            return temp * temp * a;
        }else {
            return temp*temp;
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
//        int a =3, b =5;
//        test.function(3,5);
//        function(3,5);
        System.out.println(test.function(3,5));

    }
}