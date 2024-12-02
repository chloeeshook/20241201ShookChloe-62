public class Main {
  public static void main(String[] args) {
    System.out.println("The sum of the gidigts in 234 is: " + sumDigits(234));
    System.out.println("The sum of the gidigts in 1001 is: " + sumDigits(1001));
    System.out.println("The sum of the gidigts in 987654321 is: " +   sumDigits(987654321));
  }
  public static int sumDigits(long n) {
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n = n / 10; 
    }
    return sum;
  }
}
