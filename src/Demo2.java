void main() {
    if (true) System.out.println("True");
    else System.out.println("False");

    if (false) System.out.println("True");
    else {
        System.out.println("This is else block");
        System.out.println("Here we have multiple statements");
    }

    if (true) {
        System.out.println("This is then block");
        System.out.println("We have multiple statements here");
    } else System.out.println("Else block has only one statement");
}