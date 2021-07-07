package Java_practice.javaI_II_practice;


import java.io.*;
import java.util.List;
import java.util.ArrayList;

    public class CatchHandle {

        private List<Integer> list;
        private static final int SIZE = 10;

        public CatchHandle() {
            list = new ArrayList<Integer>(SIZE);
            for (int i = 0; i < SIZE; i++) {
                list.add(new Integer(i));
            }
        }

        public void writeList() {
            // The FileWriter constructor throws IOException, which must be caught.
            try {
                PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

                System.out.println("Entered try statement");
                out = new PrintWriter(new FileWriter("OutFile.txt"));
                for (int i = 0; i < SIZE; i++) {
                    // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                    out.println("Value at: " + i + " = " + list.get(i));
                }

            } catch (IndexOutOfBoundsException e) {
                System.err.println("IndexOutOfBoundsException: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Caught IOException: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            
        }
    }


