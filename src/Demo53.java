import java.util.Scanner;

void main() {
    final var SCANNER = new Scanner(System.in);

    while (true) {
        System.out.print("Enter a day: ");

//        switch (SCANNER.next()) {
//            case "MONDAY" -> System.out.println("Monday is awesome and refreshing");
//            case "TUESDAY" -> System.out.println("Tuesday is okay");
//            case "WEDNESDAY" -> System.out.println("Wednesday is not bad");
//            case "THURSDAY" -> System.out.println("Thursday is boring");
//            case "FRIDAY" -> System.out.println("Friday is full of shit");
//            case "SATURDAY", "SUNDAY" -> System.out.println("Weekend is always fun");
//            default -> System.out.println("Invalid day");
//        }


        String feedback = switch (SCANNER.next()) {
            case "MONDAY" -> {
                System.out.println("Monday is awesome" + "and refreshing");
                //yield 10;  // <- This can't be done (incompatible data types)
                yield "Monday is awesome" + "and refreshing";
            }
            case "TUESDAY" -> {
                System.out.println("Tuesday");
                yield "Tuesday is okay";
            }
//            case "WEDNESDAY" -> 20;  // <- This can't be done (incompatible data types)
            case "THURSDAY" -> "Thursday is boring";
            case "FRIDAY" -> "Friday is full of shit";
            case "SATURDAY", "SUNDAY" -> "Weekend is always fun";
            default -> "Invalid day";
        };

        System.out.println();
    }
}