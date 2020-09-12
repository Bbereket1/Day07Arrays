import java.util.stream.IntStream;

public class Arrays {
    public static void main(String[] args) {

        /*
        double[] creditCardTransactions = {34.25, 53.2, 526.89};

        System.out.println(creditCardTransactions[0]);
        System.out.println(creditCardTransactions[1]);
        System.out.println(creditCardTransactions[2]);

        int[] numbers = {0, 1, 2, 3};

        /*

        Loops

        Loops allows to perform a given task multiple times

        For Loops


        if (Condition) {
        // run this task
        }

        for(initialize; condition, increment) {
        //run this task
        }



        Question 1

        Create a method that prints numbers from 0 to 50. BUT,
        if the number is divisible by 3, print "Fizz" instead of the number.


        Question 2

        Print numbers 0 to 50. BUT if the number is divisible by 3,
        print "Fizz" instead of the number. If the number is divisible by 5, print "Buzz".
        If the number is divisible by both 3 and 5, print "FizzBuzz".




            // Example
        for (int i = 0; i < creditCardTransactions.length; i++) {
            // Use < only instead of <=
            System.out.println(creditCardTransactions[i]);
        }

        */



        // Question 1

        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                System.out.println("Frizz");
            } else {
                System.out.println(i);
            }

        }

        // Question 1

        for (int i = 0; i < 50; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FrizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Frizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


    }

}
