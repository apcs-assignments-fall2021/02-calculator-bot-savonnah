import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        double total = a + b + c;
        int changing = (int)total;
        int median = (changing/3);
        return (median);
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int absa = Math.abs(a);
        int absb = Math.abs(b);
        if (absa > absb) {
            return a;
        }
        else {
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        int asqr = (a*a);
        int bsqr = (b*b);
        double csqr = asqr + bsqr;
        double c = Math.sqrt(csqr);
        return c; // REPLACE WITH YOUR CODE
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        //System.out.println(median(1, 2, 3)); // should be 2
        //System.out.println(magnitude(-7, -1)); // should be -7
        //System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out? (Please use lower case)");
        System.out.println("The options are median, magnitude, pythagoras");
        String command = scan.nextLine();
        String medi = "median";
        String mag = "magnitude";
        String pyth = "pythagoras";

        boolean q = command.equals(medi);
        boolean r = command.equals(mag);
        boolean s = command.equals(pyth);
        if (q) {
            System.out.println("Please input a number to calculate the median with: ");
            int a = scan.nextInt();
            System.out.println("Please input another number to calculate the median with: ");
            int b = scan.nextInt();
            System.out.println("Please input another number to calculate the median with: ");
            int c = scan.nextInt();
            System.out.println("The median is: " + median(a,b,c));
        }
        else if (r){
            System.out.println("Please input a number to find the largest absolute value: ");
            int x = scan.nextInt();
            System.out.println("Please input a number to find the largest absolute value: ");
            int y = scan.nextInt();
            System.out.println("The largest absolute value is: " + magnitude(x,y));
        }
        else if (s){
            System.out.println("Please input a value to 'a' in a^2 + b^2 = c^2: ");
            int d = scan.nextInt();
            System.out.println("Please input a value to 'b' in a^2 + b^2 = c^2: ");
            int e = scan.nextInt();
            System.out.println("The c value in a^2 + b^2 = c^2 is: " + pythagoras(d,e));;
        }
        /*
        //Median
        System.out.println("Please input a number to calculate the median with: ");
        int a = scan.nextInt();
        System.out.println("Please input another number to calculate the median with: ");
        int b = scan.nextInt();
        System.out.println("Please input another number to calculate the median with: ");
        int c = scan.nextInt();
        System.out.println("The median is: " + median(a,b,c));

        //Magnitude
        System.out.println("Please input a number to find the largest absolute value: ");
        int x = scan.nextInt();
        System.out.println("Please input a number to find the largest absolute value: ");
        int y = scan.nextInt();
        System.out.println("The largest absolute value is: " + magnitude(x,y));

        //Pythagoras
        System.out.println("Please input a value to 'a' in a^2 + b^2 = c^2: ");
        int d = scan.nextInt();
        System.out.println("Please input a value to 'b' in a^2 + b^2 = c^2: ");
        int e = scan.nextInt();
        System.out.println("The c value in a^2 + b^2 = c^2 is: " + pythagoras(d,e));
    */
    }
}

