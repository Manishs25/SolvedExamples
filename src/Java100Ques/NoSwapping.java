package Java100Ques;

public class NoSwapping {
    public static void main(String[] args) {
//        int a = 10, b = 22;
//        System.out.println("before swapping " + a + " " + b);
//
//        a = a + b;//10+22=32
//        b = a - b;//32-22= 10
//        a = a - b;//32-10=22
//
//        System.out.println("after swapping " + a + " " + b);

//        int i,fact=1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the no:");
//        int num = scanner.nextInt();
//        for (i=1;i<=num;i++){
//            fact=fact*i;
//        }
//            System.out.println(fact);

//        int a=0,b=1,c;
//
//        System.out.print(a+" "+b);
//
//        for (int i=1;i<=10;i++){
//            c=a+b;
//            System.out.print(" "+c);
//            a=b;
//            b=c;
//        }

//
//        int n = 1234;
//        while (n>0){
//            int lastDigit = n% 10; //to fetch last digit
//            System.out.print(lastDigit);
//            n = n/10;//to remove last digit
//        }
//        System.out.println();


//    int n = 12432543;
//    while (n>0){
//        int lastD = n%10;
//        System.out.print(lastD);
//        n=n/10;
//    }
//        System.out.println();


//    int arr[]={234,345,6,7,7,456};
//    for(int i = arr.length-1;i>=0;i--){
//        System.out.print(arr[i]);
//    }

//
//    int no = 5;
//    int fact=1;
//    for (int i=1;i<=no;i++){
//        fact=fact*i;
//    }
//        System.out.println(fact);



//     int arr [] = {23,45,8,34,6,89,90};
//     int temp;
//     for (int i=0;i<arr.length;i++){
//         for (int j = i+1;j<arr.length;j++){
//             if ( arr[i]>arr[j]){
//                 temp= arr[i];
//                 arr[i]=arr[j];
//                arr[j]=temp;
//             }
//         }
//         }
//         for (int i = 0; i<=arr.length;i++){
//             System.out.println(arr[i]);
//     }

//        int a = 2;
//        int b = 3;
//
//        System.out.println(" "+a+ " "+b);
//
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println(" "+a+" "+b);



//        int no = 66;
//        int temp = 0;
//        for (int i =2; i<=no-1;i++){
//            if(no%i==0){
//                temp = temp+1;
//            }
//            }
//            if (temp == 0){
//                System.out.println("prime");
//            }
//            else {
//                System.out.println("not prime");
//        }
//
//            int  n = 0;
//            int m = 1;
//        System.out.print(n+" "+m);
//            int c;
//            for (int i = 0 ; i<=10;i++){
//                c = n+m;
//                System.out.print(" "+c);
//                n=m;
//                m=c;
//





//            }
//        int a = 5 ;
//        if (a%2==0){
//            System.out.println("even");
//        }else {
//            System.out.println("odd");
//        }


//        int arr[]={23,5,6,78,3};
//        for(int i = 0; i<=arr.length;i++){
//        if (arr[i]%2==0) {
//            System.out.println("even = "+arr[i]);
//        }
//        for (int j=0;j<=arr.length;j++){
//                if (arr[j]%2!=0){
//                    System.out.println("odd = "+arr[j]);
//                }
//            }
//
//        }

        int[] array = { 1, 2, 3, 4, 5 };

        int sum = 0;

        for (int i : array)
            sum += i;

        System.out.println(sum);
    }
}
