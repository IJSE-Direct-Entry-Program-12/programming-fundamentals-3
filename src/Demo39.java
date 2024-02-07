void main(){

    int y = 6;
    do {
        for (int x = 0; x++ < 4; System.out.print(x == 4 ? "= " : "")) {
            System.out.print("* ");
            if (x == 4 && y % 2 != 0) break;
        }
        y--;
        System.out.println();
    }while(y != 0);
}