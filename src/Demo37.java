void main(){
    outer:
    for (int y = 0; y < 5; y++) {
        int x = 0;
        inner:
        while (x++ < 5){
            if (x == 3) break outer;
            System.out.print("* ");
        }
        System.out.println();
        if (y == 3) break;
    }
}