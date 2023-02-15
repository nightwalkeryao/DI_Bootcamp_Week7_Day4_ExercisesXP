package Exercise3;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = sc.nextInt();
        System.out.println("Enter X:");
        int X = sc.nextInt();
        Random rand = new Random();

        for (int i = 1; i <= N ; i++) {
            System.out.println("Random number " + i + ": " + rand.nextInt(0, X+1));
        }
    }
}
