import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);

    System.out.print("Enter student name: ");
    String name = SCANNER.next();

    int x = 0;

    int totalMarks = 0;
    while (x++ < 3) {
        boolean invalidMarks = true;
        while (invalidMarks) {
            System.out.print(STR."Enter subject\{x} marks: ");
            int marks = SCANNER.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("\033[31mInvalid marks, try again!\033[0m");
            } else {
                invalidMarks = false;
                totalMarks += marks;
            }
        }
    }

    System.out.println(STR."Student \{name}'s Total Marks: \{totalMarks}");
    System.out.println(STR."Student \{name}'s Avg. Marks: \{(totalMarks / 3.)}");

}