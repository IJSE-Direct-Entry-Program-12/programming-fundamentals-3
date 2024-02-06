void main(){
    main:
    System.out.println("A");
    outer:
    {
        System.out.println("B");
        inner:
        {
            System.out.println("C");
            System.out.println("D");
            innerInner:
            {
                System.out.println("E");
                break inner;
            }
        }
        System.out.println("F");
        if (true) break outer;
        System.out.println("H");
    }
    System.out.println("I");
}