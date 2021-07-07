
    import java.util.Scanner;
    public class Bonus_exercise2 {
        public static void main( String args[] )
        {

            Scanner input = new Scanner(System.in);
            int num1;
            int num2;

            System.out.print( "Input first number: " ); // prompt
            num1 = input.nextInt(); // read first number from user

            System.out.print( "Input second number: " ); // prompt
            num2 = input.nextInt(); // read second number from user

            if ( num1 == num2 )
                System.out.printf( "%d == %d\n", num1, num2 );
            if ( num1 != num2 )
                System.out.printf( "%d != %d\n", num1, num2  );
            if ( num1 < num2 )
                System.out.printf( "%d < %d\n", num1, num2 );
            if ( num1 > num2 )
                System.out.printf( "%d > %d\n", num1, num2 );
            if ( num1 <= num2 )
                System.out.printf( "%d <= %d\n", num1, num2 );
            if ( num1 >= num2 )
                System.out.printf( "%d >= %d\n", num1, num2  );
        }
    }
//

