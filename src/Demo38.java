void main(){
    int x = 0, y = 0;
    while (true){
        while (true){
            System.out.print("* ");
            if (++x % 4 == 0) break;
        }
        if (++y == 3) break;
        System.out.println();
    }
}