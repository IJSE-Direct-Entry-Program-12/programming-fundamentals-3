import java.util.Scanner;

void main() {
    final var SCANNER = new Scanner(System.in);
    final var RED = "\033[31m";
    final var RESET = "\033[0m";

    while (true) {
        System.out.print("Enter year: ");
        int year = SCANNER.nextInt();

        if (year < 1980 || year > 2050) {
            System.out.println(STR."\{RED}Invalid year, try again\{RESET}");
            continue;
        }

        System.out.print("Enter month: ");
        String month = SCANNER.next();
        int totalDays = 0;
        boolean fallThrough = false;

        if (month.equals("JANUARY") || month.equals("JAN")) {
            totalDays = 31;
            fallThrough = true;
        }
        if (fallThrough || month.equals("FEBRUARY") || month.equals("FEB")) {
            totalDays += (year % 4 == 0 ? 29 : 28);
            fallThrough = true;
        }
        if (fallThrough || month.equals("MARCH") || month.equals("MAR")) {
            totalDays += 31;
            fallThrough = true;
        }
        if (fallThrough || month.equals("APRIL") || month.equals("APR")) {
            totalDays += 30;
            fallThrough = true;
        }
        if (fallThrough || month.equals("MAY")) {
            totalDays += 31;
            fallThrough = true;
        }
        if (fallThrough || month.equals("JUNE") || month.equals("JUN")) {
            totalDays += 30;
            fallThrough = true;
        }
        if (fallThrough || month.equals("JULY") || month.equals("JUL")) {
            totalDays += 31;
            fallThrough = true;
        }
        if (fallThrough || month.equals("AUGUST") || month.equals("AUG")) {
            totalDays += 31;
            fallThrough = true;
        }
        if (fallThrough || month.equals("SEPTEMBER") || month.equals("SEP")) {
            totalDays += 30;
            fallThrough = true;
        }
        if (fallThrough || month.equals("OCTOBER") || month.equals("OCT")) {
            totalDays += 31;
            fallThrough = true;
        }
        if (fallThrough || month.equals("NOVEMBER") || month.equals("NOV")) {
            totalDays += 30;
            fallThrough = true;
        }
        if (fallThrough || month.equals("DECEMBER") || month.equals("DEC")) {
            totalDays += 31;
            fallThrough = true;
        }
        if (!fallThrough) {
            System.out.println("Invalid month, try again");
        } else {
            System.out.println(STR."Total number of days since \{month}: \{totalDays}");
        }
    }
}