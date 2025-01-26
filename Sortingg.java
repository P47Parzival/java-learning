import java.util.Scanner;

public class Sortingg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.print("\nNow enter " + size + " Elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Elements you enterd are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        //bubble sort( time complexity is O(n^2))
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp; 
                }
            }
        }

        //selection sort(time complexity O(n^2))
        for (int i = 0; i < numbers.length - 1; i++) {
            int smallest = i;
            for(int j =i+1; j<numbers.length; j++){
                if(numbers[smallest] > numbers[j]){
                    smallest = j;
                }
            }
            int temp = numbers[smallest];
            numbers[smallest] = numbers[i];
            numbers[i] = temp;
        }

        //insertion sort
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;
            while (j >= 0 && current < numbers[j]) {
                numbers[j+1] = numbers[j];
                j--; 
            }
            numbers[j+1] = current;
        }

        System.out.print("\nSorted elements are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
}
