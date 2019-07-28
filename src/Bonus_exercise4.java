
    import java.util.Scanner;
    public class Bonus_exercise4 {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("First number: ");
            double a = in.nextDouble();
            System.out.print("Second number: ");
            double b = in.nextDouble();
            System.out.print("Third number: ");
            double c = in.nextDouble();
            System.out.print("The smallest value is " + smallest(a, b, c)+"\n" );
        }

        public static double smallest(double a, double b, double c)
        {
            return Math.min(Math.min(a, b), c);
        }
    }


