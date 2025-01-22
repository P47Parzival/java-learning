import java.util.*;
public class Practical {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Start entering the values");
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter value for element " + (i+1));
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("The elements you entered are : ");
        for(int i=0; i<arr.length; i++){
            if(i == arr.length - 1){
                System.out.println(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }
        int max = findmax(arr);
        System.out.println("\nOut of all the elements you entered the max element is: " + max);
    }

    public static int findmax(int[] n){
        int maximum = n[0];

        for (int n1 : n) {
            if(maximum < n1){
                maximum = n1;
            }
        }
        return maximum;
    }
}
