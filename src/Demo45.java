void main(){
    int x, y = 0;
    outer:
    while (true){
        System.out.println();
        if (((x = 0) == 0) && ++y == 10) break;
        while (true){
            System.out.print("* ");
            if (x++ == (y < 5 ? 5 - y : y - 5)) continue outer;
        }
    }
}