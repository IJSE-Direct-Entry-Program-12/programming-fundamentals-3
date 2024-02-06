void main(){

    int y = 0;
    // int k = 4;
    do{
        int x = 0;
        do {
            System.out.print("* ");
        } while (x++ < (4-y));   // 4, 3, 2, 1,
        System.out.println();
        // k--;
    }while (y++ < 4);

}