import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);
    final var RED = "\033[31m";
    final var RESET = "\033[0m";

    while(true) {

        System.out.print("Enter your grade: ");
        String grade = SCANNER.next();

        switch (grade){
            default -> System.out.println(STR."\{RED}Invalid grade, try again!\{RESET}");
            case "A+" -> {
                System.out.println("Your marks: [90-100]");
                System.out.println("HELLO");
            }
            case "A" ->  System.out.println("Your marks: [75-89]");
            case "B" + "+" -> System.out.println("Your marks: [65-74]");
            case "B" -> System.out.println("Your marks: [60-64]");
            case "C" -> System.out.println("Your marks: [55-59]");
            case "S" -> System.out.println("Your marks: [45-54]");
            case "F", "W" -> System.out.println("Your marks: [0-44]");
//            case "F", case"W" -> System.out.println("Your marks: [0-44]"); // <- This is compile-time error
        }

//        switch (grade){
//            default:
//                System.out.println(STR."\{RED}Invalid grade, try again!\{RESET}");
//                break;
//            case "A+":
//                System.out.println("Your marks: [90-100]");
//                break;
//            case "A":
//                System.out.println("Your marks: [75-89]");
//                break;
//            case "B" + "+":
//                System.out.println("Your marks: [65-74]");
//                break;
//            case "B":
//                System.out.println("Your marks: [60-64]");
//                break;
//            case "C":
//                System.out.println("Your marks: [55-59]");
//                break;
//            case "S":
//                System.out.println("Your marks: [45-54]");
//                break;
        //    case "F": case "W":
//            case "F","W":
//                System.out.println("Your marks: [0-44]");
//                break;
//        }

//        if (grade.equals("A+")) System.out.println("Your marks: [90-100]");
//        else if (grade.equals("A")) System.out.println("Your marks: [75-89]");
//        else if (grade.equals("B+")) System.out.println("Your marks: [65-74]");
//        else if (grade.equals("B")) System.out.println("Your marks: [60-64]");
//        else if (grade.equals("C")) System.out.println("Your marks: [55-59]");
//        else if (grade.equals("S")) System.out.println("Your marks: [45-54]");
//        else if (grade.equals("F") || grade.equals("W")) System.out.println("Your marks: [0-44]");
//        else System.out.println(STR."\{RED}Invalid grade, try again!\{RESET}");
    }
}