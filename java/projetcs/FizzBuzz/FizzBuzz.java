// For multiples of 3, print Fizz instead of the number.
// For the multiples of 5, print Buzz.
// For numbers which are multiples of both 3 and 5, print FizzBuzz.

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            // prints number 1-100

            if (i % 3 == 0) {
                System.out.println("Fizz");
                // For multiples of 3, print Fizz instead of the number
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                // For the multiples of 5, print Buzz
            } else if (i % 5 == 0 || i % 3 == 0) {
                System.out.println("FizzBuzz");
                // For numbers which are multiples of both 3 and 5, print FizzBuzz
            } else {
                System.out.println(i);
            }
            // if none of the above conditions are met, print the number
        }
    }

}
