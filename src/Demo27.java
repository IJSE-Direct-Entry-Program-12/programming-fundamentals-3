void main(){
    // do ; while(true);

    // do-while (2)
    // * - (1)
    // sop (2)

//    int y = 0;
//    while(y++ < 5){
//        int x = 0;
//        while (x++ < 5) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

    int y = 0;
    do{
        int x = 0;
        do {
            System.out.print("* ");
        } while (x++ < 4);
        System.out.println();
    }while(y++ < 4);

}