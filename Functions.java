// Factorial of number
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factorial for: ");
        int a = sc.nextInt();
        System.out.println("Factorial of number is: " + fact(a));
        sc.close();
    }

    public static int fact(int a) {
        if (a < 0) {
            System.out.println("Invalid number");
        } else {
            int factorial = 1;
            for (int i = 1; i <= a; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
        return 0;
    }

// Fibonacci series code
public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits you want in series: ");
        int a = sc.nextInt();
        System.out.println("Fibonnaci series is: ");
        fibo(a);
        sc.close();
    }
    public static void fibo(int a){
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for(int i = 3; i <= a; i++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
