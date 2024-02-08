import java.util.Scanner;

void main(){
    final var SCANNER = new Scanner(System.in);

    while (true) {
        System.out.print("Enter a day: ");
        switch (SCANNER.next()) {
            case "MONDAY":
                System.out.println("Monday is awesome and refreshing");
                break;
            case "TUESDAY": day:{
                    System.out.println("WoW!");
                    if (true) break day;        // This will break the day block
                    // if (true) break;         // This will break the switch
                }
                System.out.println("Tuesday is okay");
                break;
            case "WEDNESDAY":
                System.out.println("Wednesday is not bad");
                break;
            case "THURSDAY":
                System.out.println("Thursday is boring");
                break;
            case "FRIDAY":
                System.out.println("Friday is full of shit");
                break;
            case "SATURDAY", "SUNDAY":
                System.out.println("Weekend is always fun");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}