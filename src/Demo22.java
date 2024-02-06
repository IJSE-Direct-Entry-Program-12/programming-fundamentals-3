void main(){
    // while() System.out.println("Hello"); Compile-time error

    // for(;;) System.out.println("Hello");

    for( int x = 0 ; x < 5 ; System.out.print("DEP"), x = x + 1) {
        System.out.print("Hello ");
    }

    // You can define multiple comma separated variables with or without an initializer of a same data type
    //for (int y = 5, f = 3, x; true; ) System.out.println("Hello");

    System.out.println("---------------------");

    //int x = 2, int y = 3;     // Compile-time error
    int x = 2, y = 3;           // Okay

    // for(int x=2, int y=3; x < 2; x++) System.out.println(x);

//    int x = 0;
//    for (System.out.println("Init1"),System.out.println("Init2"); x < 3 ; System.out.println("Update1"), System.out.println("Update2")){
//        System.out.println("Hello");
//        x++;
//    }

    // Init1
    // Hello x=1
    // Update1
    // Update2
    // Hello x=2
    // Update1
    // Update2
    // Hello x=3
    // Update1
    // Update2
}