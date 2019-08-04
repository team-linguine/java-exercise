
import java.util.Arrays;
    public class Java_array_exercise1 {
        public static void main(String[] args) {
            int[] my_array = {6, 14, 56, 15, 36, 56, 37, 18, 999, 49};
            int[] new_array = new int[10];

            System.out.println("Source Array : "+Arrays.toString(my_array));

            for(int i=0; i < my_array.length; i++) {
                new_array[i] = my_array[i];
            }
            System.out.println("New Array: "+Arrays.toString(new_array));
        }
    }



