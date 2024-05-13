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

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }

  // filterOddOrEven method filters the array for odd and even numbers
  public int[] filterOddOrEven(int[] numbers, boolean isOdd) {
    // array to store the filtered numbers
    int[] filteredNumbers = new int[numbers.length];

    // Initialize a variable to keep track of the index of the filteredNumbers array
    int index = 0;

    // Loop through each number in the input array
    for (int number : numbers) {
      // Check if the number is odd or even based on the isOdd argument
      if ((isOdd && number % 2 != 0) || (!isOdd && number % 2 == 0)) {
        // If the number meets the criteria, add it to the filteredNumbers array
        filteredNumbers[index] = number;
        index++;
      }
    }

    // array to store the filtered numbers without any extra elements
    int[] result = new int[index];

    // Copy the filtered numbers to the result array
    System.arraycopy(filteredNumbers, 0, result, 0, index);

    return result;
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

        System.out.println(pd.onlyPrimes(numbers));
        // should print [29, 11, 101, 43, 89]
      }
    }
  }
}
