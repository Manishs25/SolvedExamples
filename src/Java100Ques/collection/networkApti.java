package Java100Ques.collection;

public class networkApti {
    public static void main(String[] args) {

                int arr[] = {2,36,7,9,9,5,3,34,6000,0};
                int temp;
                for (int i = 0; i<args.length;i++){
                    for (int j = i+1;j<arr.length;j++){
                        if (arr[i]<arr[j]){
                            temp=arr[i];
                            arr[i]=arr[j];
                            arr[j] =temp;

                        }
                    }
                }
                for (int i = 0;i <arr.length; i++){
                    System.out.println(arr[i]+ " ");
                }
        System.out.println(arr[1]);

            }
        }
