//print 1 to 5
    public static void main(String args[]){
        int n = 1;
        printnumbers(n);
    }
    public static void printnumbers(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printnumbers(n+1);
    }

//print sum of n natural numbers
    public static void printsum(int i, int n, int sum){
        if(i == n){
            sum = sum + i;
            System.out.println(sum);
            return; 
        }
        sum = sum + i;
        printsum(i+1, n, sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till wich you want sum for: ");
        int n = sc.nextInt();
        printsum(1, n, 0);
        sc.close();
    }

//factorial of number n 
    public static void main(String args[]){
        int n = 5;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factnm1 = factorial(n-1);
        int factn = factnm1*n;
        return factn;
    }
