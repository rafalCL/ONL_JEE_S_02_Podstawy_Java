package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWithScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
        // read token by token
//        try(Scanner scan = new Scanner(new File("text1.txt"))){
//            while (scan.hasNext()){
//                System.out.println(scan.next());
//            }
//        }

        // read byte by byte
        try(Scanner scan = new Scanner(new File("text1.txt"))){
            while (scan.hasNextByte()){
                System.out.println((char)scan.nextByte());
            }
        }

//        try(PrintWriter pw = new PrintWriter("C:\\Users\\Edu\\test2.txt")){
//            pw.println("ala ma kota");
//            pw.println("a kot ma ale");
//        } catch (FileNotFoundException e){
//            System.out.println("błąd zapisu");
//        }

    }
}
