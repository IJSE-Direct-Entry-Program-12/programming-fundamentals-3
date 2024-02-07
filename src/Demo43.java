void main() {
    for (int i = 0; i < 5; i++) {
        System.out.print("Hello ");
        if (i == 3) {
            System.out.println();
            continue;
        }
        System.out.println("DEP-12");
    }

    System.out.println("----------------");

    int x = 0;
    while (x++ < 5){
        if (x == 3) continue;
        System.out.println("Hello");
    }
}