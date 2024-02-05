import java.util.Scanner;

void main() {
    final Scanner SCANNER = new Scanner(System.in);
    final int MARKS;

    System.out.print("Enter your marks: ");
    MARKS = SCANNER.nextInt();

    assert MARKS >= 0 && MARKS <= 100 : "Invalid Marks";

    System.out.println(STR."Your Marks: \{MARKS}");
}