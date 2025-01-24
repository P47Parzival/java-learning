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

