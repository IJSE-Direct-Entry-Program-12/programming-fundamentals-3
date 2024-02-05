import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);
    int highestMarks = -1, lowestMarks = -1;
    String bestStudentName = "", worstStudentName = "";
    int studentId = 0;

    while(studentId++ < 3){
        System.out.print(STR."Enter student\{studentId} name: ");
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

        if (studentId == 1){
            highestMarks = totalMarks;
            lowestMarks = totalMarks;
            bestStudentName = name;
            worstStudentName = name;
        }else{
            if (highestMarks < totalMarks){
                highestMarks = totalMarks;
                bestStudentName = name;
            }else if (lowestMarks > totalMarks){
                lowestMarks = totalMarks;
                worstStudentName = name;
            }
        }
    }
    System.out.println(STR."Best Student Name: \{bestStudentName}");
    System.out.println(STR."Best Student Total: \{highestMarks}");
    System.out.println(STR."Best Student Avg.: \{(highestMarks / 3.)}");

    System.out.println(STR."Worst Student Name: \{worstStudentName}");
    System.out.println(STR."Worst Student Total: \{lowestMarks}");
    System.out.println(STR."Worst Student Avg.: \{(lowestMarks / 3.)}");

}