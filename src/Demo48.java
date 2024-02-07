import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);
    final var RED = "\033[31m";
    final var RESET = "\033[0m";

    while(true) {
        System.out.print("Enter marks: ");
        int marks = SCANNER.nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println(STR."\{RED}Invalid marks\{RESET}");
            continue;
        }

        if (marks >= 90 ) System.out.println("A+");
        else if (marks >= 75) System.out.println("A");
        else if (marks >= 65) System.out.println("B+");
        else if (marks >= 60) System.out.println("B");
        else if (marks >= 55) System.out.println("C");
        else if (marks >= 45) System.out.println("S");
        else System.out.println("Failed");
    }
}