void main(){
    main:
    {
        System.out.println("A");
        int x = 0;
        loop:
        while (x++ < 5) {
            System.out.println("B");
            if (x == 2) break main;
            System.out.println("C");
        }
        System.out.println("D");
    }
    System.out.println("E");
}