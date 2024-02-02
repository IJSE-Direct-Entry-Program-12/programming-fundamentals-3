import java.util.Scanner;

void main(){
    final Scanner SCANNER = new Scanner(System.in);

    final String FIRST_NAME, LAST_NAME;
    final int MARKS1, MARKS2, MARKS3;
    final char GRADE1, GRADE2, GRADE3;
    final String COLOR1, COLOR2, COLOR3;

    final String GREEN = "\033[32m";
    final String BLUE = "\033[34m";
    final String YELLOW = "\033[33m";
    final String BLACK = "\033[38m";
    final String RED = "\033[31m";

    final String RESET = "\033[0m";

    System.out.print("Enter first name: ");
    FIRST_NAME = SCANNER.next();

    System.out.print("Enter last name: ");
    LAST_NAME = SCANNER.next();

    System.out.print("Enter subject 1 marks: ");
    MARKS1 = SCANNER.nextInt();
    if (MARKS1 < 0 || MARKS1 > 100){
        System.err.println("Invalid Subject 1 Marks");
        System.exit(1);
    }

    System.out.print("Enter subject 2 marks: ");
    MARKS2 = SCANNER.nextInt();
    if (MARKS2 < 0 || MARKS2 > 100){
        System.err.println("Invalid Subject 2 Marks");
        System.exit(1);
    }

    System.out.print("Enter subject 3 marks: ");
    MARKS3 = SCANNER.nextInt();
    if (MARKS3 < 0 || MARKS3 > 100){
        System.err.println("Invalid Subject 3 Marks");
        System.exit(1);
    }

    GRADE1 = MARKS1 >= 75 ? 'A' : MARKS1 >= 65 ? 'B': MARKS1 >= 55 ? 'C': MARKS1 >= 45 ? 'S': 'F';
    GRADE2 = MARKS2 >= 75 ? 'A' : MARKS2 >= 65 ? 'B': MARKS2 >= 55 ? 'C': MARKS2 >= 45 ? 'S': 'F';
    GRADE3 = MARKS3 >= 75 ? 'A' : MARKS3 >= 65 ? 'B': MARKS3 >= 55 ? 'C': MARKS3 >= 45 ? 'S': 'F';
    
    COLOR1 = GRADE1 == 'A' ? GREEN : GRADE1 == 'B' ? BLUE : GRADE1 == 'C' ? YELLOW : GRADE1 == 'S' ? BLACK: RED;
    COLOR2 = GRADE2 == 'A' ? GREEN : GRADE2 == 'B' ? BLUE : GRADE2 == 'C' ? YELLOW : GRADE2 == 'S' ? BLACK: RED;
    COLOR3 = GRADE3 == 'A' ? GREEN : GRADE3 == 'B' ? BLUE : GRADE3 == 'C' ? YELLOW : GRADE3 == 'S' ? BLACK: RED;

    System.out.println("=================================");
    System.out.println("|            REPORT CARD        |");
    System.out.println("=================================");
    System.out.println(STR."NAME: \{FIRST_NAME} \{LAST_NAME}");
    System.out.println("---------------------------------");
    System.out.println(STR."SUBJECT\t\t | MARKS\t | GRADE");
    System.out.println("---------------------------------");
    System.out.println(STR."Subject1\t | \{COLOR1}\{MARKS1}\{RESET}\t\t | \{COLOR1}\{GRADE1}\{RESET}");
    System.out.println(STR."Subject2\t | \{COLOR2}\{MARKS2}\{RESET}\t\t | \{COLOR2}\{GRADE2}\{RESET}");
    System.out.println(STR."Subject3\t | \{COLOR3}\{MARKS3}\{RESET}\t\t | \{COLOR3}\{GRADE3}\{RESET}");
    System.out.println("---------------------------------");
    System.out.println(STR."TOTAL MARKS\t: \{MARKS1 + MARKS2 + MARKS3}");
    System.out.println(STR."AVG. MARKS\t: \{(MARKS1 + MARKS2 + MARKS3) / 3.}");
}