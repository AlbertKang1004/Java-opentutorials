package my.project;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]");
        int scores = scan.nextInt(); // you should use nextInt instead of nextLine
        if (scores < 0) {
            System.out.println("impossible");
        } else if (0 <= scores && scores <= 49) {
            System.out.println("failed");
        } else if (50 <= scores && scores <= 59) {
            System.out.println("1");
        } else if (60 <= scores && scores <= 69) {
            System.out.println("2");
        } else if (70 <= scores && scores <= 79) {
            System.out.println("3");
        } else if(80 <= scores && scores <= 89) {
            System.out.println("4");
        } else if(90 <= scores && scores <= 99) {
            System.out.println("5");
        } else if (scores < 33) {
            System.out.println("incredible!");
        } else {
            System.out.println("not valid");
        }
        scan.close();
    }
}