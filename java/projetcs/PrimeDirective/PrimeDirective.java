import java.util.ArrayList;

class PrimeDirective {
  public boolean isPrime(int number) {
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }
    for (int i = 2; i * i <= number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };
    for (int number : numbers) {
      if (pd.isPrime(number)) {
        System.out.println(number + " is prime");
      } else {
        System.out.println(number + " is not prime");
        // 7 should return true
        // 28 should return false
        // 2 should return true
        // 0 should return false
        // run with java PrimeDirective
      }
    }
  }
}
