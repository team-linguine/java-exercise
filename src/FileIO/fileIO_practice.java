//package FileIO;
//import java.io.*;
//import java.nio.*;
//public class fileIO_practice {
//
//    public static void main(String[] args) {
//        String directory = "data";
//        String filename = "info.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }
//
//        if (! Files.exists(dataFile)) {
//            Files.createFile(dataFile);
//        }
//    }
//}
