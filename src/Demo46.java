void main(){
    int x, y = 10;
    outer:
    while (true){
        System.out.println();
        if (((x = 0) == 0) && --y == 0) break;
        while (true){
            System.out.print("* ");
            if (x++ == (y > 5 ? y - 5 : 5 - y)) continue outer;
        }
    }
}