//import java.io.*;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello world 4!");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter you name: ");
        String name = scan.nextLine();
        System.out.println("Hello" + name);
        scan.close();
        

    }
}