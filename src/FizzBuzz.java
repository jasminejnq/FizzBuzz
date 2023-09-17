/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1; // Start from 1 instead of 0
        while (i <= 100) { // Use <= to include 100 in the range

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {

            System.out.println("FizzBuzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);
        }
        i++;
        return i;
    }
}
