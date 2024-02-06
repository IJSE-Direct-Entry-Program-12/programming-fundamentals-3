import java.util.Scanner;

void main() {
//    int x = 0;
//    do {
//        System.out.print("* ");
//    }while (x++ < 4);
//    System.out.println();

    final var SCANNER = new Scanner(System.in);

    int stars = 5;
    int x = stars;
    int input;
    boolean valid = false;

    do {
        if (!valid) {
            System.out.print("Enter a number: ");
            input = SCANNER.nextInt();
            if (input < 4) {
                System.out.println("\033[31mInvalid number\033[0m");
            } else {
                valid = true;
                stars  = input;
                x = stars;
            }
        }else{
            System.out.print(x > 0 ? "* " : "\n");
            if (x == 0) {
                stars--;
                x = stars;
            }else  x--;
        }
    }while (stars != 0);

//    int x = 0;
//    int stars = 20;
//    do {
//        System.out.print(x < stars ? "* " : "\n");
//        if (x++ == stars){
//            x = 0;
//            stars--;
//        }
//    } while (stars != 0);
}