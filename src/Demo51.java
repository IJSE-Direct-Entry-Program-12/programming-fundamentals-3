void main(){
    int value = 10;
    // This is the simplest switch statement (without any cases)
    switch(value){}

    // We can't mix these two styles
    switch (value){
        case 10:
            System.out.println("Hello 10");
            break;
        // case 11-> System.out.println("Hello 11");
    }

    switch (value){
        // case 11 -> break;
        case 10 -> {
            System.out.println("Hello 10");
            // Compiler will add the break statement implicitly here
            // break;
        }
    }

    // Exhaustive Switch Statement is a switch statement that covers all possible values
    // of the given switch expression
    switch (value){
        case 10:
            System.out.println("Value is 10");
            break;
        case 11:
            System.out.println("Value is 11");
            break;
        default:
            System.out.println("Default");
            break;
    }
}
