import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
//1. Declare a Scanner that accepts input from the keyboard.

        //declaring
        int generate ; // generate number
        int shift; // shift the randomly generated range
        int size; // sizes of the range
        double median; // median range

        System.out.println("Please enter the median: ");
        median = input.nextDouble();

        System.out.println("Please enter the sizes : ");
        size= input.nextInt();

        // Assume the user provides valid inputs. For consecutive numbers,
        // the median must either be an integer or .5 value, such as 1.5, 2.5, etc.
        // If the user provides an integer, the size of the range must be an odd number.
        // If the user provides a .5 value, the size of the range must be an even number.

            //2 and 10 (8 numbers)
            // 10-2 = 8
        size =


        median = largest - smallest + 1 ;

            // 0 to 8 => 2 to 10

        largest =  (int) (Math.random() * shift) + size;

        //  cast double to int median

        // if {
        // }
        // else {
        // }



        //Calculate the final randomly generated number using the result of Math.random, the size of the range, and the amount to shift.
        // Math.random()


        //Print the randomly generated number to the console.
        System.out.println( "Your random number is" + output );


    }
}

//  ? short public static void main(String[] args)
}
