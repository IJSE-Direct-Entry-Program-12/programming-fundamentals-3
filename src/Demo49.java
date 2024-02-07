import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);
    final var RED = "\033[31m";
    final var RESET = "\033[0m";

    while(true) {

        System.out.print("Enter your grade: ");
        String grade = SCANNER.next();

        // grade == "A+"
        if (grade.equals("A+")) System.out.println("Your marks: [90-100]");
        else if (grade.equals("A")) System.out.println("Your marks: [75-89]");
        else if (grade.equals("B+")) System.out.println("Your marks: [65-74]");
        else if (grade.equals("B")) System.out.println("Your marks: [60-64]");
        else if (grade.equals("C")) System.out.println("Your marks: [55-59]");
        else if (grade.equals("S")) System.out.println("Your marks: [45-54]");
        else if (grade.equals("F")) System.out.println("Your marks: [0-44]");
        else System.out.println(STR."\{RED}Invalid grade, try again!\{RESET}");
    }
}