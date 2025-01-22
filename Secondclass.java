//Print sum of n natural numbers where n is 4

class Secondclass{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int sum = sc.nextInt();
      for(int i = 1; i<=4; i++){
          sum = sum + i;
      };
      System.out.print(sum);
  }
}
  
